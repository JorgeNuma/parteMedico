package com.sinensia.partemedico.presentation.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.business.services.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> getAll() {
		return usuarioService.getAll();
	}	

	@GetMapping("/{dni}")
	public Usuario getById(@PathVariable String dni) {
		return usuarioService.read(dni);
	}

	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.crear(usuario);
	}
}

//BORRAME