package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.RouteMaster;
import com.bookingsystem.demo.entity.StopMaster;

@Repository
@Transactional
public class StopMasterDaoImpl implements StopMasterDao {
	@PersistenceContext
	EntityManager entityManager;

	public long insert(StopMaster stopMaster) {
		System.out.print("enetered STopMasterDao");
		entityManager.merge(stopMaster);
		return stopMaster.getStopMasterId();
	}

	public StopMaster find(long stopMaster) {
		return entityManager.find(StopMaster.class, stopMaster);
	}

	@SuppressWarnings("unchecked")
	public List<StopMaster> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery("query_find_all_stm", RouteMaster.class);
		return query.getResultList();
	}

}
