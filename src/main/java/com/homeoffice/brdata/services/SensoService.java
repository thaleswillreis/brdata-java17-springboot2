package com.homeoffice.brdata.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeoffice.brdata.entities.Senso;
import com.homeoffice.brdata.repositories.SensoRepository;

@Service
public class SensoService {

	@Autowired
	private SensoRepository repository;

	//método para recuperar todos os municipios
	public List<Senso> findAll() {
		return repository.findAll();
	}
	
	//método para recuperar um municipio pelo id
	public Senso findById(Long id) {
		Optional<Senso> obj = repository.findById(id);
		return obj.get();
	}
}
