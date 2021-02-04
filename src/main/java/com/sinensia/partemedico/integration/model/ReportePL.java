package com.sinensia.partemedico.integration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="REPORTES")
public class ReportePL {

	@Id
	 @TableGenerator(name = "GENERADOR_REPORTES",
		table = "SECUENCIAS",
		pkColumnName = "NOMBRE_SECUENCIA",
		pkColumnValue = "REPORTE_SEQ",
		valueColumnName = "VALOR_SECUENCIA",
		allocationSize = 1
		)
		@GeneratedValue(strategy = GenerationType.TABLE, generator = "GENERADOR_REPORTES")
	private Integer codigo; // AUTOGENERADO
	
	@ManyToOne(targetEntity = UsuarioPL.class)
	@JoinColumn(name="DNI_USUARIO")
	private String dniUsuario;
	
	@Column(name="HORA_REPORTE")
	private Date horaReporte;
	
	private String longitud;
	private String latitud;
	
	private Double sistolica;
	private Double diastolica;
	
	private Double peso;
	
	@Column(name="NUMERO_PASOS")
	private Integer pasos;
	
	public ReportePL() {
		
	}
	
	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public Double getSistolica() {
		return sistolica;
	}

	public void setSistolica(Double sistolica) {
		this.sistolica = sistolica;
	}

	public Double getDiastolica() {
		return diastolica;
	}

	public void setDiastolica(Double diastolica) {
		this.diastolica = diastolica;
	}

	public Integer getPasos() {
		return pasos;
	}

	public void setPasos(Integer pasos) {
		this.pasos = pasos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		ReportePL other = (ReportePL) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReportePL [codigo=" + codigo + ", dni=" + dniUsuario + ", horaReporte=" + horaReporte + ", longitud="
				+ longitud + ", latitud=" + latitud + ", sistolica=" + sistolica + ", diastolica=" + diastolica
				+ ", pasos=" + pasos + "]";
	}
	
}
