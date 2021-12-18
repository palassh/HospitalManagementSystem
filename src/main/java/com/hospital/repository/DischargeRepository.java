package com.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Discharge;

@Repository
public interface DischargeRepository extends JpaRepository<Discharge, Integer>{

	//Object signInAuthentication(String signin);

	//Object exists(String signout);
	
	
}
