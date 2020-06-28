package com.gabriel.core.models.documents;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "Usuarios")
@JsonPropertyOrder({"id"})
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 4065081749713676665L;
	
	@Id
	private String id;
	
	@Email(message = "Email should be valid")
	@Indexed(unique = true)
	@NotBlank
	@NotEmpty
	private String email;
	@NotBlank
	@NotEmpty
	private String password;
	@NotBlank
	@NotEmpty
	private LocalDateTime fechaCreado;
	@NotBlank
	@NotEmpty
	private boolean enabled;
	@NotBlank
	@NotEmpty
	private List<Rol> roles;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	public LocalDateTime getFechaCreado() {
		return fechaCreado;
	}
	public void setFechaCreado(LocalDateTime fechaCreado) {
		this.fechaCreado = fechaCreado;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
