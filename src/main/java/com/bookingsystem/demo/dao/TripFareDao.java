package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.TripFare;

public interface TripFareDao {
	
	long insert(TripFare tripFare);
	
	TripFare find (long tripFareId);
	
	List<TripFare> findAll();

}
