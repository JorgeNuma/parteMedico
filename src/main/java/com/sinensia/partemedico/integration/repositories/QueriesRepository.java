package com.sinensia.partemedico.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.partemedico.integration.model.ReportePL;
import com.sinensia.partemedico.integration.model.DTO.Query1DTO;

@Repository
public interface QueriesRepository extends JpaRepository<ReportePL, Integer>{
	
	static String PAQUETE = "com.sinensia.partemedico.integration.model.DTO.";

	@Query("SELECT new " + PAQUETE + "Query1DTO("
			+ "AVG(r.diastolica) , AVG(r.sistolica)  "
			+ ")"
			+ " FROM ReportePL r "
			+ "WHERE r.horaReporte BETWEEN "
			+ "TO_DATE('2020-01','yyyy-MM') "
			+ "AND TO_DATE('2020-02','yyyy-MM')")
	public Query1DTO Quey1();

	@Query("SELECT "
			+ "AVG(r.peso) "			
			+ " FROM ReportePL r "
			+ "WHERE r.horaReporte BETWEEN "
			+ "TO_DATE('2020-01','yyyy-MM') "
			+ "AND TO_DATE('2020-02','yyyy-MM')")
	public Double Quey2();
	
}
