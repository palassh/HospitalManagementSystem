package com.hospital.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	 @Data
	    @NoArgsConstructor
	    @AllArgsConstructor
		@Entity
			public class Discharge implements Serializable {
			
			@Id
			@NotNull(message = " Id cannot be null")
			private int patientId;
			@Column(length=20)
			@NotBlank(message = " Name cannot be null")
			private String name;
			@Column(length = 25)
			@NotBlank(message = "email cannot be empty")
			//@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
			private String email;
			@NotBlank(message = "Gender cannot be empty")
			private String gender;
			@NotBlank(message = "String cannot be empty")
			private String address;
			@NotBlank(message = "City cannot be empty")
			private String city;
			@NotBlank(message = "Disease cannot be empty")
			private String disease;
			//@Pattern(regexp="(\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])")
			private LocalDate date;
			@NotBlank(message = "time cannot be empty")
	       // @Pattern(regexp="(1[012]|[1-9]):[0-5][0-9](\\\\s)?(?i)(am|pm)")
		    private String time;
			@NotBlank(message = "status cannot be empty")
            private String status;
		
			

	}


