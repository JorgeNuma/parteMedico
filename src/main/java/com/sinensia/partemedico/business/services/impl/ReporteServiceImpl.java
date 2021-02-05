package com.sinensia.partemedico.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.partemedico.business.model.Reporte;
import com.sinensia.partemedico.business.services.ReporteService;
import com.sinensia.partemedico.integration.model.ReportePL;
import com.sinensia.partemedico.integration.repositories.ReportePLRepository;
import com.sinensia.partemedico.integration.utilidades.MapperPersonalizado;

@Service
public class ReporteServiceImpl implements ReporteService {

	@Autowired
	private ReportePLRepository reportePLRepository;
	
	@Autowired
	private MapperPersonalizado mapperPersonalizado;
	
	@Override
	public List<Reporte> getAll() {
		List<ReportePL> reportesPL = reportePLRepository.findAll();
		List<Reporte>reportes = new ArrayList<Reporte>();
		
		for(ReportePL reportePL : reportesPL) {
			reportes.add(mapperPersonalizado.fromReportePLToReporte(reportePL));
		}
		return reportes;
	}

	@Override
	public Reporte crear(Reporte reporte) {
		ReportePL rpPL = reportePLRepository.save(mapperPersonalizado.fromReporteToReportePL(reporte));
		return mapperPersonalizado.fromReportePLToReporte(rpPL);
	}

	@Override
	public Reporte read(int codigo) {
		Optional<ReportePL> optional = reportePLRepository.findById(codigo); 
		return optional.isPresent() ? mapperPersonalizado.fromReportePLToReporte(optional.get()) : null;
	}

	@Override
	public List<Reporte> getByDni(String dni) {
		List<ReportePL> reportesPL = reportePLRepository.findByUsuarioDni(dni);
		List<Reporte>reportes = new ArrayList<Reporte>();
		
		for(ReportePL reportePL : reportesPL) {
			reportes.add(mapperPersonalizado.fromReportePLToReporte(reportePL));
		}
		return reportes;
	}

}
