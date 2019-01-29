package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.BusMasterDao;
import com.bookingsystem.demo.entity.BusMaster;

@Service
public class BusMaterServicesImpl implements BusMasterServices {

	@Autowired
	BusMasterDao busMasterDao;

	public long insert(BusMaster busMaster) {
		return busMasterDao.insert(busMaster);
	}

	public BusMaster find(long busMasterId) {
		return busMasterDao.find(busMasterId);
	}

	public List<BusMaster> findAll() {
		return busMasterDao.findAll();
	}
}
