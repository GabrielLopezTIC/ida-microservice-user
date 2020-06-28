package com.gabriel.core.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabriel.core.models.documents.Rol;

public interface IRolRepo extends MongoRepository<Rol, String>{

	public Rol findByRol(String rol);
}
