package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.PassangerMaster;

@Repository
@Transactional
public class PassangerMasterDaoImpl implements PassangerMasterDao {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(PassangerMaster passangerMaster) {
		entityManager.merge(passangerMaster);
		return passangerMaster.getPassangerMasterId();
	}

	public PassangerMaster find(long passangerMasterId) {
		return entityManager.find(PassangerMaster.class, passangerMasterId);
	}

	@SuppressWarnings("unchecked")
	public List<PassangerMaster> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_pm", PassangerMaster.class);
		return query.getResultList();
	}
}
