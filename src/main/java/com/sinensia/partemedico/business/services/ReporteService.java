package com.sinensia.partemedico.business.services;

import java.util.List;

import com.sinensia.partemedico.business.model.Reporte;

public interface ReporteService {
	
	public List<Reporte> getAll();
	
	public Reporte read(int codigo);
	
	public List<Reporte> getByDni(String dni);
	
	public Reporte crear(Reporte reporte);
}
