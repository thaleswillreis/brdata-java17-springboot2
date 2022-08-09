package com.homeoffice.brdata.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeoffice.brdata.entities.Senso;
import com.homeoffice.brdata.services.SensoService;

@RestController
@RequestMapping(value = "/senso")
public class SensoResource {

	@Autowired
	private SensoService service;

	//End point para buscar todos os municipios
	@GetMapping
	public ResponseEntity<List<Senso>> findAll() {
		List<Senso> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//End point para buscar um municipio por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Senso> findById(@PathVariable Long id) {
		Senso obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
