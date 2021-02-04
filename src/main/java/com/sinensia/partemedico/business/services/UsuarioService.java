package com.sinensia.partemedico.business.services;

public interface UsuarioService {

	public List<Usuario> getAll();
	
	public List<Usuario> read(String dni);
	
	public Usuario crear(Usuario usuario);
	
}
