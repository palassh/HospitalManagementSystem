package com.hospital.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.Nurse;



public interface NurseRepository extends JpaRepository<Nurse ,Integer>{

	//void deleteAllById(int nid);

	//Optional<Nurse> findById(int nid);
	//List<Nurse> findByName(String name);
	//List<Nurse> findByAddress(String address);
//	List<Nurse> findByAssistDoctor(String assistDoctor);
//	List<Nurse> findByPhoneNumber(int phoneNumber);
//	List<Nurse> findByEmail(String emailId);
//	List<Nurse> findBySalary(int salary);
//	List<Nurse> finfByDate(Date date);
	
	
	

}
