package com.sinensia.partemedico.integration.model.DTO;

public class Query1DTO {

	private Double diastolica;
	private Double sistolica;
	
	public Query1DTO() {
		
	}

	public Query1DTO(Double diastolica, Double sistolica) {
		super();
		this.diastolica = diastolica;
		this.sistolica = sistolica;
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

	@Override
	public String toString() {
		return "Query1DTO [diastolica=" + diastolica + ", sistolica=" + sistolica + "]";
	}
	
}
