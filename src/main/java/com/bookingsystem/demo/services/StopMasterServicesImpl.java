package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.StopMasterDao;
import com.bookingsystem.demo.entity.StopMaster;

@Service
public class StopMasterServicesImpl implements StopMasterServices {

	@Autowired
	StopMasterDao stopMasterDao;

	public long insert(StopMaster stopMaster) {
		System.out.println("entered insert");
		return stopMasterDao.insert(stopMaster);
	}

	public StopMaster find(long stopMasterId) {
		return stopMasterDao.find(stopMasterId);
	}

	public List<StopMaster> findAll() {
		return stopMasterDao.findAll();
	}

}
