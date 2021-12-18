package com.hospital.model;
	import java.io.Serializable;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    @Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	public class Doctor implements Serializable{
		@Id
		@GeneratedValue
		private int id;
		@NotBlank(message="Name cannot be empty")
	private String name;
	//private String email;
	@NotNull(message="Phone number cannot be null")
	private Long phoneNo;
	@NotBlank(message="Gender cannot be empty")
	private String gender;
	@NotNull(message="Age cannot be empty")
	private int age;
	@NotBlank(message="DateOfJoining cannot be empty")
	private String dateOfJoining;
	@NotNull(message="Experience cannot be empty")
	private int experience;
	@NotBlank(message="Doctor specialization cannot be empty")
	private String specialization;
	@NotNull(message="Salary cannot be null")
	private int salary;
	}
	