package com.hospital.model;
import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
	@Entity
		public class Receptionist implements Serializable {
			@Id
			private int appointmentId;
			@NotBlank(message="Name cannot be null")
			private String patientName;
			@NotNull(message="Age cannot be empty")
			private int age;
			@NotBlank(message="Doctor's Name cannot be empty")
			private String doctorName;
			@NotNull(message="Date cannot be empty")
			private LocalDate appointmentDate;
			@NotBlank(message="Time cannot be empty")
			private String appointmentTime;
			public Receptionist() {
				
			}
			public Receptionist(int appointmentId, @NotBlank(message = "Name cannot be null") String patientName,
					@NotBlank(message = "Age cannot be empty") int age,
					@NotBlank(message = "Doctor's Name cannot be empty") String doctorName,
					@NotBlank(message = "Mobile Number cannot be empty") String mobileNo,
					@NotBlank(message = "Date cannot be empty") LocalDate appointmentDate, @NotBlank(message="Time cannot be empty") String appointmentTime) {
				super();
				this.appointmentId = appointmentId;
				this.patientName = patientName;
				this.age = age;
				this.doctorName = doctorName;
				this.appointmentDate = appointmentDate;
				this.appointmentTime = appointmentTime;
			}
			public int getAppointmentId() {
				return appointmentId;
			}
			public void setAppointmentId(int appointmentId) {
				this.appointmentId = appointmentId;
			}
			public String getPatientName() {
				return patientName;
			}
			public void setPatientName(String patientName) {
				this.patientName = patientName;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getDoctorName() {
				return doctorName;
			}
			public void setDoctorName(String doctorName) {
				this.doctorName = doctorName;
			}
			
			public LocalDate getAppointmentDate() {
				return appointmentDate;
			}
			public void setAppointmentDate(LocalDate appointmentDate) {
				this.appointmentDate = appointmentDate;
			}
			public String getAppointmentTime() {
				return appointmentTime;
			}
			public void setAppointmentTime(String appointmentTime) {
				this.appointmentTime = appointmentTime;
			}
			@Override
			public String toString() {
				return "Receptionist [appointmentId=" + appointmentId + ", patientName=" + patientName + ", age=" + age
						+ ", doctorName=" + doctorName + ", appointmentDate=" + appointmentDate + ", appointmentTime="
						+ appointmentTime + "]";
			}
			
		
		
		
	}