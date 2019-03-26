package com.rms.database.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class BookingEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	private String roomNumber;
	private String buildingName;
	//private ArrayList<EmployeeEntity> employeeList;
	public BookingEntity(String roomNumber, String buildingName) {
		this.roomNumber = roomNumber;
		this.buildingName = buildingName;
	}

}
