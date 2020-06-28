package com.gabriel.core.models.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.core.models.documents.Rol;
import com.gabriel.core.models.services.IRolService;

@RestController
@RequestMapping("rol")
public class RolRestController {
	
	@Autowired
	private IRolService rolService;
	
	//create
	@PostMapping(path = "/save")
	public Rol save(@RequestBody Rol entity) {
		return rolService.save(entity);
	}

	//read
	@GetMapping(path = "/find/rol/{rol}")
	public Rol findByRol(@PathVariable String rol) {
		return rolService.findByRol(rol);
	}
	
	
	@GetMapping(path = "/find/all")
	public List<Rol> findAll() {
		return rolService.findAll();
	}
	

	//delete
	@DeleteMapping(path = "/delete/{id}")
	public void deleteById(@PathVariable String id) {
		rolService.deleteById(id);
	}

	@DeleteMapping(path = "/delete/all")
	public void deleteAll() {
		rolService.deleteAll();
	}

}
