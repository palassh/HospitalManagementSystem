package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Integer>{
	
}
