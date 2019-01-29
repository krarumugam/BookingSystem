package com.bookingsystem.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.demo.dao.RouteMasterDao;
import com.bookingsystem.demo.entity.RouteMaster;

@Service
public class RouteMasterServicesImpl implements RouteMasterServices {
	@Autowired
	RouteMasterDao routeMasterDao;

	public long insert(RouteMaster routeMaster) {
		System.out.println("entered insert");
		return routeMasterDao.insert(routeMaster);
	}

	public RouteMaster find(long routeMasterId) {
		return routeMasterDao.find(routeMasterId);
	}

	public List<RouteMaster> findAll() {
		return routeMasterDao.findAll();
	}
}
