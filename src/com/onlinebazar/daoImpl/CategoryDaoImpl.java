package com.onlinebazar.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebazar.dao.CategoryDao;
import com.onlinebazar.model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session session() {
		return sessionFactory.getCurrentSession(); 
	}
	
	@Override
	public List<Category> list() {
		List<Category> list=new ArrayList<Category>();
		list = session().createQuery("From Category").getResultList();
		return list;
	}

	@Override
	public Category get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Category category) {
		try {
			session().persist(category);
			//sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch(Exception e) {
			e.getMessage();
		}
		return false;
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
