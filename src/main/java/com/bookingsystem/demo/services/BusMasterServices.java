package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.BusMaster;

public interface BusMasterServices {

	long insert(BusMaster busMaster);

	BusMaster find(long busMasterId);

	List<BusMaster> findAll();
}
