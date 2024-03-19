package br.com.cdb.bancodigitaljpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdb.bancodigitaljpa.entity.Cliente;
import br.com.cdb.bancodigitaljpa.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvarCLiente(String nome, String cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
		
	}

}
