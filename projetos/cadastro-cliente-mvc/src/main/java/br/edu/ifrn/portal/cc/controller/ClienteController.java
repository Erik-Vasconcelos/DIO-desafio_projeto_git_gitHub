package br.edu.ifrn.portal.cc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifrn.portal.cc.model.Cliente;
import br.edu.ifrn.portal.cc.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ModelAndView getPaginaInicial() {
		ModelAndView view = new ModelAndView("clientes");
		List<Cliente> clientesList = clienteService.getClientes();
		
		view.addObject("clienteList", clientesList);
		return view;
	}

	@GetMapping("/add")
	public ModelAndView getPaginaForm() {
		ModelAndView view = new ModelAndView("clienteForm");
		return view;
	}

	@PostMapping
	public String inseirCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			redirect.addFlashAttribute("mensagem", "Verifique os campos obrigatórios");
			return "redirect:/clientes/add";
		}

		clienteService.inserir(cliente);
		return "redirect:/clientes";
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView getEdit(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("clienteForm");
		return null;
	}

}
