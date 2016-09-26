package com.api.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.api.model.Data;

public class DataService {
	private EntityManagerFactory emf;
	
	public DataService(){
		emf = Persistence.createEntityManagerFactory("JavaApi");
	}
	
	public int persistData(Data data){
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		em.close();
		
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public List<Data> getData(){
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT d FROM Data d");
		List<Data> data = query.getResultList();
		
		return data;
		
	}
	
}
