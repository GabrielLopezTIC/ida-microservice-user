package com.gabriel.core.models.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gabriel.core.models.documents.Rol;

@Repository
public class RolRepoImpl{
	
	@Autowired
	private IRolRepo rolRepo;
	
	public <S extends Rol> S save(S entity) {
		return rolRepo.save(entity);
	}

	public Optional<Rol> findById(String id) {
		return rolRepo.findById(id);
	}
	
	public List<Rol> findAll() {
		return rolRepo.findAll();
	}
	
	public void deleteById(String id) {
		rolRepo.deleteById(id);
	}

	public void deleteAll() {
		rolRepo.deleteAll();
	}
	
	public Rol findByRol(String rol) {
		return rolRepo.findByRol(rol);
	}	

}
