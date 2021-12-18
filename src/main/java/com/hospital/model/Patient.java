package com.hospital.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@Entity
@Validated

public class Patient implements Serializable{
	@Id
	@GeneratedValue
	private int patientId;
	@NotBlank(message = "Name cannot be null")
	private String name;
	@NotBlank(message = "Email cannot be empty")
	private String email;
	@NotBlank(message = "Address cannot be empty")
	private String address;
	@NotBlank(message = "Phone number cannot be null")
	private long phone;
	@NotBlank(message = "Gender cannot be null")
	private String gender;
	@NotBlank(message = "BirthDate cannot be null")
	private Date birthDate;
	@NotBlank(message = "Age cannot be empty")
	private int age;
	@NotBlank(message = "Blood group cannot be empty")
	private String bloodGroup;
	@NotBlank(message = "Name of the disease cannot be empty")
	private String disease;
	@NotBlank(message = "Ward name cannot be empty")
	private String ward;
	//@NotBlank(message = "Name of the consulting doctor cannot be empty")
	private String consultingDoctor;
	
}
