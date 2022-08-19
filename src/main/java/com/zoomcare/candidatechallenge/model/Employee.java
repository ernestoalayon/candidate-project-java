package com.zoomcare.candidatechallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Employee {

		@Column(name = "id")
		@Id
		private Long employeeID;
		
		@Nullable
		@Column(name="supervisor_id")
		private Long supervisorID;

		public Long getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(Long employeeID) {
			this.employeeID = employeeID;
		}

		public Long getSupervisorID() {
			return supervisorID;
		}

		public void setSupervisorID(Long supervisorID) {
			this.supervisorID = supervisorID;
		}

}
