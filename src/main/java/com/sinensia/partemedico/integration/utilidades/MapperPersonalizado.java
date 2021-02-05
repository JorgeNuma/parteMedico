package com.sinensia.partemedico.integration.utilidades;

import com.sinensia.partemedico.business.model.Reporte;
import com.sinensia.partemedico.business.model.Sexo;
import com.sinensia.partemedico.business.model.Usuario;
import com.sinensia.partemedico.integration.model.ReportePL;
import com.sinensia.partemedico.integration.model.SexoPL;
import com.sinensia.partemedico.integration.model.UsuarioPL;

public class MapperPersonalizado {
	
	public MapperPersonalizado() {
		
	}
	//----------------MAPEO DE USUARIOS----------------------

	public Usuario fromUsuarioPLtoUsuario(UsuarioPL usuariopl) {
		Usuario usuario = new Usuario();
		
		usuario.setDni(usuariopl.getDni());
		usuario.setNombre(usuariopl.getNombre());
		usuario.setApellido1(usuariopl.getApellido1());
		usuario.setApellido2(usuariopl.getApellido2());
		usuario.setSexo(fromSexoPLtoSexo(usuariopl.getSexo()));
		usuario.setFechaNacimiento(usuariopl.getFechaNacimiento());
		usuario.setAltura(usuariopl.getAltura());
		usuario.setObservaciones(usuariopl.getObservaciones());
		
		return usuario;
	}
	
	public UsuarioPL fromUsuarioToUsuarioPL(Usuario usuario) {
		UsuarioPL usuariopl = new UsuarioPL();
		
		usuariopl.setDni(usuario.getDni());
		usuariopl.setNombre(usuario.getNombre());
		usuariopl.setApellido1(usuario.getApellido1());
		usuariopl.setApellido2(usuario.getApellido2());
		usuariopl.setSexo(fromSexotoSexoPL(usuario.getSexo()));
		usuariopl.setFechaNacimiento(usuario.getFechaNacimiento());
		usuariopl.setAltura(usuario.getAltura());
		usuariopl.setObservaciones(usuario.getObservaciones());
		
		return usuariopl;
	}
	
	//--------------------MAPEO DE SEXO----------------------
	
	public Sexo fromSexoPLtoSexo(SexoPL sexoPL) {
		return 	Sexo.valueOf(sexoPL.toString());
	}
	
	public SexoPL fromSexotoSexoPL(Sexo sexo) {
		return 	SexoPL.valueOf(sexo.toString());
	}
	
	//-----------------------MAPEO DE REPORTES----------------
	
	public Reporte fromReportePLToReporte(ReportePL reportepl) {
		Reporte reporte = new Reporte();
		
		reporte.setCodigo(reportepl.getCodigo());
		reporte.set
		
		return reporte;
	}
	
}
