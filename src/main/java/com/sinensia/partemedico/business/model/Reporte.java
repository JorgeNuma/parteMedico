package com.sinensia.partemedico.business.model;

import java.util.Date;

public class Reporte {

	private int codigo;
	private Date horaReporte;
	private String longitud;
	private String latitud;
	private Double diastolica;
	private Double sistolica;
	private double peso;
	private int numeroPasos;
	private Usuario dniUsuario;
	
	public Reporte() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getHoraReporte() {
		return horaReporte;
	}

	public void setHoraReporte(Date horaReporte) {
		this.horaReporte = horaReporte;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public Double getDiastolica() {
		return diastolica;
	}

	public void setDiastolica(Double diastolica) {
		this.diastolica = diastolica;
	}

	public Double getSistolica() {
		return sistolica;
	}

	public void setSistolica(Double sistolica) {
		this.sistolica = sistolica;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumeroPasos() {
		return numeroPasos;
	}

	public void setNumeroPasos(int numeroPasos) {
		this.numeroPasos = numeroPasos;
	}

	public Usuario getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(Usuario dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reporte other = (Reporte) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reporte [codigo=" + codigo + ", horaReporte=" + horaReporte + ", longitud=" + longitud + ", latitud="
				+ latitud + ", diastolica=" + diastolica + ", sistolica=" + sistolica + ", peso=" + peso
				+ ", numeroPasos=" + numeroPasos + ", dniUsuario=" + dniUsuario + "]";
	}
	
}
