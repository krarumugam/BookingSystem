package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.TripFareDao;
import com.bookingsystem.demo.entity.TripFare;

@Service
public class TripFareServicesImpl implements TripFareServices{
	@Autowired
	TripFareDao tripFareDao;

	public long insert(TripFare tripFare) {
		System.out.println("entered insert TripFareService");
		return tripFareDao.insert(tripFare);
	}

	public TripFare find(long tripFareId) {
		return tripFareDao.find(tripFareId);
	}

	public List<TripFare> findAll() {
		return tripFareDao.findAll();
	}
}
