package com.gabriel.core.models.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.core.models.documents.Usuario;
import com.gabriel.core.models.services.IUsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioService;
	

	//save
	//@CrossOrigin(origins = "*")
	@PostMapping(path = "/save/usr")
	public Usuario saveUser(@RequestBody Usuario usuario){
		return usuarioService.save(usuario);
	}

	// Read
	//@CrossOrigin(origins = "*")
	@GetMapping(path = "/find/usr/{email}")
	public Optional<Usuario> findByEmail(@PathVariable String email) {
	    System.out.println("Lego aqui");
		return usuarioService.findUserByEmail(email);	
	}
	
	//@CrossOrigin(origins = "*")
	@GetMapping(path = "/find/id/{id}")
	public Optional<Usuario> findById(@PathVariable String id) {
		return usuarioService.findUserById(id);
	}
	
	//@CrossOrigin(origins = "*")
	@GetMapping(path = "/find/all")
	public List<Usuario> findAll() {
		return usuarioService.findAll();
	}
	
	// update
	//@CrossOrigin(origins = "*")
	@PutMapping(path = "/update")
	public void update(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}
	
	
	/// Delete
	//@CrossOrigin(origins = "*")
	@DeleteMapping(path = "/delete/usr/{email}")
	public void deleteById(@PathVariable String email) {
		usuarioService.deleteByEmai(email);
	}
	
	//@CrossOrigin(origins = "*")
	@DeleteMapping(path = "/delete/all")
	public void deleteAll() {
		usuarioService.deleteAll();
	}
	
	//Verify
	//@CrossOrigin(origins = "*")
	@GetMapping(path = "/exist/{email}")
	public boolean existe(@PathVariable String email) {
		return usuarioService.existsByEmail(email);
	}
}
