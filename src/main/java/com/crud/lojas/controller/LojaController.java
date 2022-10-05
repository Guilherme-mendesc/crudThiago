package com.crud.lojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.lojas.model.Lojas;
import com.crud.lojas.repository.LojasRepository;

@RestController
@RequestMapping("/lojas")
@CrossOrigin("*")
public class LojaController {
	
	@Autowired
	private LojasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Lojas>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	

}
