package com.hospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Validated
public class Lab {
	@Id
	@GeneratedValue
	private int labId;
	
	@NotBlank(message = "Name cannot be blank")
	@Column(name = "name", nullable = false)
	private String name;
	
	@NotBlank(message = "test is mandatory")
	@Column(name = "test", nullable = false)
	private String test;
	
	@NotBlank(message = "Entering time is mandatory")
	@Column(name = "time", nullable = false)
	private String time;
	
	@NotBlank(message = "Entering room number is mandatory")
	@Column(name = "roomNumber", nullable = false)
	private String roomNumber;
	
	@NotBlank(message = "Entering operation is mandatory")
	@Column(name = "operation", nullable = false)
	private String operation;
}
