package com.sinensia.partemedico.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.partemedico.business.model.Reporte;
import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.business.services.ReporteService;
import com.sinensia.partemedico.business.services.UsuarioService;

@Controller
@RequestMapping("/partemedico")
public class AppController {

	@Autowired
	private ReporteService reporteService;

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value={"/home","/",""})
	public String home() {
		return "index";
	}

	@RequestMapping("/listado-reportes")
	public String getListadoReportes(Model model) {

		List<Reporte> reportes = reporteService.getAll();

		model.addAttribute("reportes", reportes);

		return "reportes";
	}

	@RequestMapping("/listado-usuarios")
	public String getListadoUsuarios(Model model) {

		List<Usuario> usuarios = usuarioService.getAll();

		model.addAttribute("usuarios", usuarios);

		return "usuarios";
	}

	@RequestMapping("/reportesUsuario/{dni}")
	public String getListadoReportesUsuario(Model model, String dni) {

		List<Reporte> reportes = reporteService.getByDni(dni);
		
		model.addAttribute("reportesUsuario", reportes);

		return "reportesUsuario";
	}

	@RequestMapping("/buscarUsuario/{dni}")
	public String getUsuarioDni() {
		return null;
	}

	@RequestMapping("/buscarReporte/{codigo}")
	public String getReporteCodigo() {
		return null;
	}

	@PostMapping("/altaUsuario")
	public String altaUsuario() {
		return null;
	}

	@PostMapping("/altaReporte")
	public String altaReporte() {
		return null;
	}
}