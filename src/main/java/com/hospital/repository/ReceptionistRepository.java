package com.hospital.repository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hospital.model.Receptionist;


@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist,Integer> {
	public List<Receptionist> findByDoctorName(String doctorName);
	public List<Receptionist> findByPatientName(String patientName);
	
	//@Query("update appointment a set a.confirmed= ?1 where a.appointmentId= ?2")
	//int setConfirmation(String confirmation, Integer id);
	
	@Query(value="select * from appointment a where a.appointmentDate= ?1 AND a.doctorName= ?2", nativeQuery=true)
	List<Receptionist> findByDate(LocalDate date,String doctorName);

}
