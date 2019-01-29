package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.BusTypeMaster;

@Repository
@Transactional
public class BusTypeMasterDaoImpl implements BusTypeMasterDao {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(BusTypeMaster busTypeMaster) {
		System.out.println("entered insertDao");
		entityManager.merge(busTypeMaster);
		return busTypeMaster.getBusTypeMasterId();
	}

	public BusTypeMaster find(long busTypeMaster) {
		return entityManager.find(BusTypeMaster.class, busTypeMaster);
	}

	@SuppressWarnings("unchecked")
	public List<BusTypeMaster> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_btm", BusTypeMaster.class);
		return query.getResultList();
	}
}
