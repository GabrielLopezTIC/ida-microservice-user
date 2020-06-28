package com.gabriel.core.models.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabriel.core.models.documents.Usuario;

public interface IUsuarioRepo extends MongoRepository<Usuario, String> {

	public Optional<Usuario> findByEmail(String email);

	public void deleteByEmail(String email);
	
	public boolean existsByEmail(String email);
}
