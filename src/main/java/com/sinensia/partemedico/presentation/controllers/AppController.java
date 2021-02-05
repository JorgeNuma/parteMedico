package com.sinensia.partemedico.presentation.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinensia.partemedico.business.model.Reporte;
import com.sinensia.partemedico.business.model.Sexo;
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

	@RequestMapping(value = { "/home", "/", "" })
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
	public String getListadoReportesUsuario(Model model, @PathVariable("dni") String dni) {

		List<Reporte> reportes = reporteService.getByDni(dni);

		model.addAttribute("reportesUsuarios", reportes);

		
		return "reportesUsuarios";
	}

	@RequestMapping("/buscarUsuario/{dni}")
	public String getUsuarioDni(Model model, @PathVariable("dni") String dni) {

		Usuario usuario = usuarioService.read(dni);

		model.addAttribute("buscarUsuario", usuario);

		return "buscarUsuario";
	}

	@RequestMapping("/buscarReporte/{codigo}")
	public String getReporteCodigo(Model model, @PathVariable("codigo") int codigo) {
		Reporte reporte = reporteService.read(codigo);

		model.addAttribute("buscarReporte", reporte);

		return "buscarReporte";
	}

	@RequestMapping("/alta-usuarios")
	public String getFormularioUsuario() {

		return "altaUsuarios";
	}
	
	@RequestMapping(value="/alta-usuarios", method = RequestMethod.POST)
	public String postUsuarios(HttpServletRequest request) {
		
		Usuario u = new Usuario();
		
		u.setDni(request.getParameter("dni"));
		u.setNombre(request.getParameter("nombre"));
		u.setApellido1(request.getParameter("apellido1"));
		u.setApellido2(request.getParameter("apellido2"));
		u.setAltura(Integer.parseInt(request.getParameter("altura")));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			u.setFechaNacimiento(sdf.parse(request.getParameter("fechaNacimiento")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		u.setObservaciones(request.getParameter("observaciones"));
		u.setSexo(Sexo.valueOf(request.getParameter("sexo")));
		
		usuarioService.crear(u);
		
		return "altaUsuarios";
		
	}

	/*@RequestMapping(value="/alta-reporte", method = RequestMethod.POST)
	public String altaReporte(HttpServletRequest request) {
		
		Reporte r = new Reporte();
		
		r.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		r.setHoraReporte(horaReporte);
		private Integer codigo;
		private Usuario usuario;
		private Date horaReporte;
		private String longitud;
		private String latitud;
		private Double diastolica;
		private Double sistolica;
		private Double peso;
		private Integer numeroPasos;
		
		return null;
	}*/
}