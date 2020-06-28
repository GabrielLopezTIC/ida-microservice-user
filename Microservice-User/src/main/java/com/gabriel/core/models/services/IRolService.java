package com.gabriel.core.models.services;

import java.util.List;
import java.util.Optional;

import com.gabriel.core.models.documents.Rol;

public interface IRolService {
	public <S extends Rol> S save(S entity);

	public Optional<Rol> findById(String id);
	
	public Rol findByRol(String rol);
	
	public List<Rol> findAll();
	
	public void deleteById(String id);

	public void deleteAll();
}
