package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.StopMaster;

public interface StopMasterServices {

	long insert(StopMaster stopMaster);

	StopMaster find(long stopMasterId);

	List<StopMaster> findAll();
}
