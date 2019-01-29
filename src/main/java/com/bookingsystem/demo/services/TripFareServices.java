package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.TripFare;

public interface TripFareServices {

	long insert(TripFare tripFare);

	TripFare find(long tripFareId);

	List<TripFare> findAll();

}
