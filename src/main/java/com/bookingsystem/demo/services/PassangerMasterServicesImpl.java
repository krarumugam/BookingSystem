package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.PassangerMasterDao;
import com.bookingsystem.demo.entity.PassangerMaster;

@Service
public class PassangerMasterServicesImpl implements PassangerMasterServices {

	@Autowired
	PassangerMasterDao passangerMasterDao;

	public long insert(PassangerMaster passangerMaster) {
		return passangerMasterDao.insert(passangerMaster);
	}

	public PassangerMaster find(long passangerMasterId) {
		return passangerMasterDao.find(passangerMasterId);
	}

	public List<PassangerMaster> findAll() {
		return passangerMasterDao.findAll();
	}

}
