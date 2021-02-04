package com.sinensia.partemedico.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.partemedico.integration.model.ReportePL;

@Repository
public interface ReportePLRepository extends JpaRepository<ReportePL, Integer>{
	
	public List<ReportePL> findByDniUsuario(String dni);
	
	

}
