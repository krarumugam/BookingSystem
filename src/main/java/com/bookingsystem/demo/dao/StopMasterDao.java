package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.StopMaster;

public interface StopMasterDao {

	long insert(StopMaster stopMaster);

	StopMaster find(long stopMasterId);

	List<StopMaster> findAll();

}
