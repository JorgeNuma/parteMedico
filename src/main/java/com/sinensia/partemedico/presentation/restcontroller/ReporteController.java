package com.sinensia.partemedico.presentation.restcontroller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.partemedico.business.model.Reporte;
import com.sinensia.partemedico.business.services.ReporteService;

@RestController
@CrossOrigin
@RequestMapping("/reportes")
public class ReporteController {
	
	@Autowired
	private ReporteService reporteService;
	
	@GetMapping
	public List<Reporte> getAll(){
		return reporteService.getAll();
	}
	
	@GetMapping("/{codigo}")
	public Reporte read(@PathVariable int codigo) {
		return reporteService.read(codigo);
	}
	
	@PostMapping
	@Transactional
	public Reporte save(@RequestBody Reporte reporte) {
		return reporteService.crear(reporte);
	}
	
	@GetMapping("/usuario/{dni}")
	public List<Reporte> getByDni(@PathVariable String dni){
		return reporteService.getByDni(dni);
	}
	
}
