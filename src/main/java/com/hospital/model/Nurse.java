package com.hospital.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data

@NoArgsConstructor
@Entity

public class Nurse implements Serializable{
	@Id
	//@GeneratedId
	 private int nurseId;
	//@NotNull(message = "Name should not be empty" )
	 private String name;
	//@NotNull(message = "Address should not be empty" )
     private String address;
	//@NotNull(message = "Assisting Doctor should not be empty" )
     private String assistDoctor;
	//@NotNull(message = "Phone number cannot be empty" )
     private long phoneNumber;
	//@NotNull (message = "EmailId cannot be empty")
	//@Size(min =1 , max=13)
	//@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
	
	private String emailId;
	//@NotNull(message = "Salary should not be empty" )
     private int salary;
	//@NotNull(message = "Date should not be empty" )
     private Date date;
    
}