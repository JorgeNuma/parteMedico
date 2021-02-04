package com.sinensia.partemedico.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sinensia.partemedico.business.model.Usuario;

@Service
public interface UsuarioService {

	public List<Usuario> getAll();
	
	public List<Usuario> read(String dni);
	
	public Usuario crear(Usuario usuario);
	
}
