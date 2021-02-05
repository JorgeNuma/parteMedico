package com.sinensia.partemedico.business.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.business.services.UsuarioService;
import com.sinensia.partemedico.integration.model.UsuarioPL;
import com.sinensia.partemedico.integration.repositories.UsuarioPLRepository;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioPLRepository usuarioPLRepository;

	@Override
	public List<Usuario> getAll() {

		List<UsuarioPL> usuarioPL = usuarioPLRepository.findAll();
		
		List<Usuario> usuarios = new ArrayList<>();
		
		return null;
	}

	@Override
	public List<Usuario> read(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario crear(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
