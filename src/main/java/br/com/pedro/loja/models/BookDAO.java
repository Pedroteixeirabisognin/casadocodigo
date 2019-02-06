package br.com.pedro.loja.models;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Book product) {
		manager.persist(product);
	}
}
