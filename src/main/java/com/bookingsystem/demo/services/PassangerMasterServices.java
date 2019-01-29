package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.PassangerMaster;

public interface PassangerMasterServices {

	long insert(PassangerMaster passangerMaster);

	PassangerMaster find(long passangerMasterId);

	List<PassangerMaster> findAll();

}
