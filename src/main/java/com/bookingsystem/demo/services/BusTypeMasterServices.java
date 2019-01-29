package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.BusTypeMaster;

public interface BusTypeMasterServices {

	long insert(BusTypeMaster busTypeMaster);

	BusTypeMaster find(long busTypeMasterId);

	List<BusTypeMaster> findAll();

	// void updateUser(BusTypeMaster busTypeMaster);

}
