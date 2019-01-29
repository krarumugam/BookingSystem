package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.PassangerMaster;

public interface PassangerMasterDao {

	long insert(PassangerMaster passangerMaster);

	PassangerMaster find(long passangerMasterId);

	List<PassangerMaster> findAll();

}
