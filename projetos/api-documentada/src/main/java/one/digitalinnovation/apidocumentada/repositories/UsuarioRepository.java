package one.digitalinnovation.apidocumentada.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import one.digitalinnovation.apidocumentada.handlers.BusinessException;
import one.digitalinnovation.apidocumentada.model.Usuario;

@Repository
public class UsuarioRepository {

	public void save(Usuario usuario) {
		if(usuario.getLogin() == null) {
			throw new BusinessException("O campo login é obrigatório");
		}
		if(usuario.getPassword() == null) {
			throw new BusinessException("O campo passworld é obrigatório");
		}
		
		System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		System.out.println(usuario);
	}

	public void update(Usuario usuario) {
		System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		System.out.println(usuario);
	}

	public void remove(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
		System.out.println(id);
	}

	public List<Usuario> listAll() {
		System.out.println("LIST - Listando os usários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Erik", "password"));
		usuarios.add(new Usuario("Vasconcelos", "masterpass"));
		return usuarios;
	}

	public Usuario finById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
		return new Usuario("Erik", "password");
	}

}
