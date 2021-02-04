package com.sinensia.partemedico.business.services;

import java.util.List;

import com.sinensia.partemedico.business.model.Usuario;

public interface UsuarioService {

	public List<Usuario> getAll();
	
	public List<Usuario> read(String dni);
	
	public Usuario crear(Usuario usuario);
	
}
