package br.edu.infnet.persistencia;



import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;



public class JpaUtil {



	private static EntityManager em;

	

	private JpaUtil() {

		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("library");

		em = factory.createEntityManager();

	}



	public static EntityManager createEntityManager() {

		if(em == null) {

			new JpaUtil();

		}

		return em;

	}

	

	



}