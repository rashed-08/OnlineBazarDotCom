package com.onlinebazar.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebazar.dao.ProductDao;
import com.onlinebazar.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

/*	@Autowired
	private ProductDao productDao;
*/	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session session() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public boolean add(Product product) {
		try {
			session().persist(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Product> getProductList() {
		String query="From Product";
		List<Product> list=new ArrayList<Product>();
		list=session().createQuery(query,Product.class).getResultList();
		return list;
	}

	@Override
	public Product getProduct(int id) {
		try {
			Product product=session().get(Product.class, Integer.valueOf(id));
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Getting error from fetching data...");
			return null;
			// TODO: handle exception
		}
	}

	@Override
	public boolean update(Product product) {
		try {
			session().update(product);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Getting error from update product...");
			return false;
		}
	}

	@Override
	public boolean delete(Product product) {
		product.setActive(false);
		try {
			session().update(product);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Getting error from delete method...");
			return false;
		}
	}

	@Override
	public List<Product> getActiveProductList() {
		String query="From Product where active=:active";
		List<Product> list=new ArrayList<Product>();
		list=session().createQuery(query, Product.class).setParameter("active", true).getResultList();
//		session().setProperty("active", true);
		return list;
	}

	@Override
	public List<Product> getProductListByCategoryId(int category) {
		List<Product> list=new ArrayList<Product>();
		String query="From Product where active=:active and categoryId=:categoryId";
		list=session().createQuery(query,Product.class).setParameter("active", true).setParameter("categoryId", category).getResultList();
		return list;
	}

	@Override
	public List<Product> getLatestActiveProduct(int count) {
		List<Product> list=new ArrayList<Product>();
		String query="From Product where active=:active order by id";
		list=session().createQuery(query,Product.class).setParameter("active", true).getResultList();
		return list;
	}

}
