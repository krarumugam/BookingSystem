package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.BusMaster;

@Repository
@Transactional
public class BusMasterDaoImpl implements BusMasterDao {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(BusMaster busMaster) {
		entityManager.flush();
		entityManager.merge(busMaster);
		return busMaster.getBusMasterId();
	}

	public BusMaster find(long busMasterId) {
		return entityManager.find(BusMaster.class, busMasterId);
	}

	@SuppressWarnings("unchecked")
	public List<BusMaster> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_bm", BusMaster.class);
		return query.getResultList();
	}
}
