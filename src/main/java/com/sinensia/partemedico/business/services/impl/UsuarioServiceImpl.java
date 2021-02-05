package com.sinensia.partemedico.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.business.services.UsuarioService;
import com.sinensia.partemedico.integration.model.UsuarioPL;
import com.sinensia.partemedico.integration.repositories.UsuarioPLRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private UsuarioPLRepository usuarioPLRepository;

	@Override
	public List<Usuario> getAll() {

		List<UsuarioPL> usuariosPL = usuarioPLRepository.findAll();
		
		List<Usuario> usuarios = new ArrayList<>();
		
		for (UsuarioPL usuarioPL : usuariosPL) {
			usuarios.add(dozerBeanMapper.map(usuarioPL, Usuario.class));
		}
		
		return usuarios;
	}

	@Override
	public Usuario read(String dni) {
		
		Optional<UsuarioPL> optionalUsuarioPL = usuarioPLRepository.findById(dni);
		
		UsuarioPL usuarioPL = optionalUsuarioPL.isPresent() ? optionalUsuarioPL.get() : null;
		
		Usuario usuario = dozerBeanMapper.map(usuarioPL, Usuario.class);
		
		return usuario;

	}

	@Override
	public Usuario crear(Usuario usuario) {
		
		UsuarioPL usuarioPL = dozerBeanMapper.map(usuario, UsuarioPL.class);
		
		UsuarioPL createdUsuarioPL = usuarioPLRepository.save(usuarioPL);
		
		Usuario usuarios = dozerBeanMapper.map(createdUsuarioPL, Usuario.class);
		
		return usuarios;
	}

}
