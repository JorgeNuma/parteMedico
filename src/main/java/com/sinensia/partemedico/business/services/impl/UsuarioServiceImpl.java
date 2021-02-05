package com.sinensia.partemedico.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.business.services.UsuarioService;
import com.sinensia.partemedico.integration.model.UsuarioPL;
import com.sinensia.partemedico.integration.repositories.UsuarioPLRepository;
import com.sinensia.partemedico.integration.utilidades.MapperPersonalizado;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private MapperPersonalizado mapperPersonalizado;
	
	@Autowired
	private UsuarioPLRepository usuarioPLRepository;

	@Override
	public List<Usuario> getAll() {

		List<UsuarioPL> usuariosPL = usuarioPLRepository.findAll();
		
		List<Usuario> usuarios = new ArrayList<>();
		
		for (UsuarioPL usuarioPL : usuariosPL) {
			usuarios.add(mapperPersonalizado.fromUsuarioPLToUsuario(usuarioPL));
		}
		
		return usuarios;
	}

	@Override
	public Usuario read(String dni) {
		
		Optional<UsuarioPL> optionalUsuarioPL = usuarioPLRepository.findById(dni);
		
		UsuarioPL usuarioPL = optionalUsuarioPL.isPresent() ? optionalUsuarioPL.get() : null;
		
		Usuario usuario = mapperPersonalizado.fromUsuarioPLToUsuario(usuarioPL);
		
		return usuario;
	}

	@Override
	public Usuario crear(Usuario usuario) {
		
		UsuarioPL usuarioPL = mapperPersonalizado.fromUsuarioToUsuarioPL(usuario);
		
		UsuarioPL createdUsuarioPL = usuarioPLRepository.save(usuarioPL);
		
		Usuario usuarios = mapperPersonalizado.fromUsuarioPLToUsuario(createdUsuarioPL);
		
		return usuarios;
	}

}
