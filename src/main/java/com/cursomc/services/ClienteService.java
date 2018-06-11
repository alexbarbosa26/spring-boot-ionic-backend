package com.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Cliente;
import com.cursomc.exceptions.ObjectNotFOundException;
import com.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository clienteRepo;

	public Cliente buscar(Integer id) {
		Cliente obj = clienteRepo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFOundException(
					"Objeto não encontrado Id: " + id + " Tipo: " + Cliente.class.getName());
		}

		return obj;
	}

}
