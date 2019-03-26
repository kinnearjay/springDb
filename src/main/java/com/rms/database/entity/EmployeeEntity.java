package com.rms.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.text.Position;

import com.rms.database.PositionsInCompany;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	
	private String employeeFirstName;
	private String employeeLastName;
	private String position;
	
	public EmployeeEntity(String employeeFirstName, String employeeLastName, String position) {
		
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.position = position;
		
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
	

}
