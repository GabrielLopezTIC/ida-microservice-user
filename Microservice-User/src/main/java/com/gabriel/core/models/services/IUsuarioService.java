package com.gabriel.core.models.services;

import java.util.List;
import java.util.Optional;

import com.gabriel.core.models.documents.Usuario;

public interface IUsuarioService {
	
	public Optional<Usuario> findById(String id);
	
	public Optional<Usuario> findUserByEmail(String email);
	
	public List<Usuario> findAll();
	
	public void deleteById(String id);

	public void deleteAll();

	public void deleteByEmai(String email);
	
	public boolean existsByEmail(String email);

	public Optional<Usuario> findUserById(String id);

	public Usuario save(Usuario usuario);

}
