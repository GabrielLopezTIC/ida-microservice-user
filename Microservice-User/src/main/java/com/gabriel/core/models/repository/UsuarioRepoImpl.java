package com.gabriel.core.models.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gabriel.core.models.documents.Usuario;

@Repository
public class UsuarioRepoImpl {
	
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	public Usuario save(Usuario entity) {
		return usuarioRepo.save(entity);
	}

	public Optional<Usuario> findById(String id) {
		return usuarioRepo.findById(id);
	}
	
	public List<Usuario> findAll() {
		return usuarioRepo.findAll();
	}
	
	public void deleteById(String id) {
		usuarioRepo.deleteById(id);
	}

	public void deleteAll() {
		usuarioRepo.deleteAll();
	}
	
	public Optional<Usuario> findUserByEmail(String email) {
	    return usuarioRepo.findByEmail(email);
	}
	
	public boolean exist(String email) {
		return usuarioRepo.existsByEmail(email);
	}

}
