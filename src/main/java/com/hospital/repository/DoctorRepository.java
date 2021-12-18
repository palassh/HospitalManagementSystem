
	package com.hospital.repository;
    import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hospital.model.Doctor;
	@RepositoryRestResource
	public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
        //List<Doctor> findBySpecialization();

		List<Doctor> findBySpecialization(String specialization);
        List<Doctor> findByExperience(int experience);
	
	}

