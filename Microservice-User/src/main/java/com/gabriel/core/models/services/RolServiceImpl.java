package com.gabriel.core.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.core.models.documents.Rol;
import com.gabriel.core.models.repository.IRolRepo;

@Service("RolService1")
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolRepo rolRepo;
	
	@Override
	public <S extends Rol> S save(S entity) {
		return rolRepo.save(entity);
	}

	@Override
	public Optional<Rol> findById(String id) {
		return rolRepo.findById(id);
	}

	@Override
	public List<Rol> findAll() {
		return rolRepo.findAll();
	}

	@Override
	public void deleteById(String id) {
		rolRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		rolRepo.deleteAll();
	}

	@Override
	public Rol findByRol(String rol) {
		return rolRepo.findByRol(rol);
	}

}
