package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.RouteMaster;

@Repository
@Transactional
public class RouteMasterDaoImpl implements RouteMasterDao {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(RouteMaster routeMaster) {
		System.out.println("entered Route Master insertDao");
		entityManager.merge(routeMaster);
		return routeMaster.getRouteMasterId();
	}

	public RouteMaster find(long routeMaster) {
		return entityManager.find(RouteMaster.class, routeMaster);
	}

	@SuppressWarnings("unchecked")
	public List<RouteMaster> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_rtm", RouteMaster.class);
		return query.getResultList();
	}

}
