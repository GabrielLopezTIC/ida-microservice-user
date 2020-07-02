package com.gabriel.core.models.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gabriel.core.models.documents.Rol;
import com.gabriel.core.models.documents.Usuario;
import com.gabriel.core.models.repository.IRolRepo;
import com.gabriel.core.models.repository.IUsuarioRepo;

@Service("UsuarioService1")
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepo usuarioRepo;
	@Autowired
	private IRolRepo rolRepo;
	
	@Autowired
	private BCryptPasswordEncoder encode;
	
	
	@Override
	public Usuario save(Usuario usuario) {
	    List<Rol> rolesTemp = usuario.getRoles();
	    List<Rol> roles = new ArrayList<Rol>();
	    for(Rol ite: rolesTemp) {
		roles.add(rolRepo.findByRol(ite.getRol()));
	    }
	    
	    usuario.setRoles(roles);
	    usuario.setFechaCreado(LocalDateTime.now());
	    usuario.setEnabled(true);
	    usuario.setPassword(encode.encode(usuario.getPassword()));
	    
	    return usuarioRepo.save(usuario);
	}

	
	@Override
	public Optional<Usuario> findById(String id) {
		return usuarioRepo.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepo.findAll();
	}

	@Override
	public void deleteById(String id) {
		usuarioRepo.deleteById(id);	
	}

	@Override
	public void deleteAll() {
		usuarioRepo.deleteAll();
	}

	@Override
	public Optional<Usuario> findUserByEmail(String email) {
	    return usuarioRepo.findByEmail(email);
	}

	@Override
	public void deleteByEmai(String email) {
		usuarioRepo.deleteByEmail(email);
	}

	@Override
	public boolean existsByEmail(String email) {
		return usuarioRepo.existsByEmail(email);
	}

	@Override
	public Optional<Usuario> findUserById(String id) {
		return usuarioRepo.findById(id);
	}

}
