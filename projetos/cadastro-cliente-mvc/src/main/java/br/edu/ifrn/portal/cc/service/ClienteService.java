package br.edu.ifrn.portal.cc.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrn.portal.cc.model.Cliente;
import br.edu.ifrn.portal.cc.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente inserir(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getCliente(Long id) {
		return clienteRepository.findById(id).get();
	}
	
	public List<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
}
