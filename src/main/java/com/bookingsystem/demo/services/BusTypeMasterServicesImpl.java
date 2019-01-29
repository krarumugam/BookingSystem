package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.BusTypeMasterDao;
import com.bookingsystem.demo.entity.BusTypeMaster;

@Service
public class BusTypeMasterServicesImpl implements BusTypeMasterServices {

	@Autowired
	BusTypeMasterDao busTypeMasterDao;

	public long insert(BusTypeMaster busTypeMaster) {
		System.out.println("entered insert");
		return busTypeMasterDao.insert(busTypeMaster);
	}

	public BusTypeMaster find(long busTypeMasterId) {
		return busTypeMasterDao.find(busTypeMasterId);
	}

	public List<BusTypeMaster> findAll() {
		return busTypeMasterDao.findAll();
	}

	/*
	 * public void updateUser(BusTypeMaster busTypeMaster) { // TODO Auto-generated
	 * method stub busTypeMasterDao.updateUser(busTypeMaster); }
	 */
}
