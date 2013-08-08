package com.khan.opensns.web.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface GenericDao<T, PK extends Serializable> {
	public T save(T entity);
	
	public Collection<T> save(Collection<T> entity);
	
	public T getById(PK id);
	
	public List<T> findByCriteria(Criterion criterion);

	public void delete(T entity);
	
	public void delete(PK id);
}