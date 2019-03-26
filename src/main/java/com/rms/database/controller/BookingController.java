package com.rms.database.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.database.entity.BookingEntity;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
	private List<BookingEntity> bookings;

	public BookingController() {
		bookings = new ArrayList<>();
		
		bookings.add(new BookingEntity("504","Anchorage 1"));
		bookings.add(new BookingEntity("408","Anchorage 1"));
		bookings.add(new BookingEntity("402","Anchorage 1"));
		bookings.add(new BookingEntity("405","Anchorage 1"));
		bookings.add(new BookingEntity("501","Anchorage 1"));
		
	}
	
	

}
