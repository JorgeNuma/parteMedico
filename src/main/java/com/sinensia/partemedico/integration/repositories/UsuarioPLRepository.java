package com.sinensia.partemedico.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.partemedico.integration.model.UsuarioPL;

@Repository
public interface UsuarioPLRepository extends JpaRepository<UsuarioPL, String>{

	public UsuarioPL findByDni(String dni);
	
	
}
