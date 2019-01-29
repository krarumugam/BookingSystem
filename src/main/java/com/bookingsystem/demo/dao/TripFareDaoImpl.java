package com.bookingsystem.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookingsystem.demo.entity.RouteMaster;
import com.bookingsystem.demo.entity.TripFare;

@Repository
@Transactional
public class TripFareDaoImpl implements TripFareDao {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(TripFare tripFare) {
		System.out.println("entered Route Master insertDao");
		entityManager.merge(tripFare);
		return tripFare.getTripFareId();
	}

	public TripFare find(long tripFare) {
		return entityManager.find(TripFare.class, tripFare);
	}

	@SuppressWarnings("unchecked")
	public List<TripFare> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_tf", RouteMaster.class);
		return query.getResultList();
	}
}
