package com.gabriel.core.models.documents;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "Roles")
@JsonPropertyOrder({"id"})
public class Rol implements Serializable{
	
	private static final long serialVersionUID = -9012799537086236250L;
	
	@Id
	@NotNull
	private String id;
	@NotNull
	private String rol;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	
}
