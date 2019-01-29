package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.BusMaster;

public interface BusMasterDao {

	long insert(BusMaster busMaster);

	BusMaster find(long busMasterId);

	List<BusMaster> findAll();

}
