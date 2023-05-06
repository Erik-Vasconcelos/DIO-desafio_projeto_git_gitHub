package one.digitalinnovation.dioclass.api;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.dioclass.api.Usuario.Status;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	/*public UsuarioController(UsuarioRepository usuarioRepository) {
		this.repository = usuarioRepository;
	}*/

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> obterUsuario(@PathVariable Long id) {
		//return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
		
		Optional<Usuario> optional = repository.findById(id);
		
		if(optional.isPresent()) {
			Usuario usuario = optional.get();
			Link link = linkTo(methodOn(UsuarioController.class).obterTodos()).withRel("Usuários");
			
			usuario.add(link);
			
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		}else {
			return new ResponseEntity<Usuario>(HttpStatus.OK);
		}
		
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> obterTodos() {
		long id;
		Link link;
		List<Usuario> usuarios = repository.findAll();
		
		if(usuarios.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			for (Usuario usuario : usuarios) {
				id = usuario.getId();
				
				link = linkTo(methodOn(UsuarioController.class).obterUsuario(id)).withSelfRel();
				usuario.add(link);
				
				link = linkTo(methodOn(UsuarioController.class).obterTodos()).withRel("Lista de usuarios");
				usuario.add(link);
			}
			
			return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
		}
	}

	@PostMapping
	public Usuario inserir(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@PutMapping("/{id}/bloquear")
	public ResponseEntity<?> bloquearUsuarioPorId(@PathVariable Long id){
		Usuario usuario = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
		
		if(usuario.getStatus() == Status.ATIVO) {
			usuario.setStatus(Status.BLOQUEADO);
			
			Link link = linkTo(methodOn(UsuarioController.class).obterUsuario(id)).withSelfRel();
			usuario.add(link);
			
			link = linkTo(methodOn(UsuarioController.class).obterTodos()).withRel("Lista de usuários");
			usuario.add(link);
			repository.save(usuario);
			
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		}
		
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
				.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
				.body("Não foi possível mudar o status do usuário! Status: " + usuario.getStatus());
	}
	

	@PutMapping("{id}")
	public Usuario atualizar(@RequestBody Usuario usuario, @PathVariable Long id) {
		return repository.findById(id).map(user -> {
			user.setNome(usuario.getNome());
			user.setLogin(usuario.getLogin());
		
			return repository.save(user);
		}).orElseGet(() -> {
			usuario.setId(id);
			return repository.save(usuario);
		});
	}
	
	@DeleteMapping("/{id}")
	public void removerUsuario(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
