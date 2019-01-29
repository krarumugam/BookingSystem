package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.BusTypeMaster;

public interface BusTypeMasterDao {

	long insert(BusTypeMaster busTypeMaster);

	BusTypeMaster find(long busTypeMasterId);

	List<BusTypeMaster> findAll();

}
