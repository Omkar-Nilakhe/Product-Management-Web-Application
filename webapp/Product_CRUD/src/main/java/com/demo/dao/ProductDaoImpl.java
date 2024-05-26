package com.demo.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao {
	Session session;
	public ProductDaoImpl() {
		Configuration config=new Configuration().configure();
		ServiceRegistry sr=new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties()).build();
		SessionFactory sf=config.buildSessionFactory(sr);
		session=sf.openSession();
	}	
	@Override
	public void addProduct(Product p) {
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
	}


	@Override
	public void updateProduct(Product p) {
		Transaction tr=session.beginTransaction();
		session.update(p);
		tr.commit();

	
	}
	@Override
	public void deleteProduct(Product p) {
		Transaction tr=session.beginTransaction();
		session.delete(p);
		tr.commit();
	}
	
	@Override
	public List<Product> viewallproducts() {
		System.out.println("view all method called...");
		Transaction tr=session.beginTransaction();
		 Query query = session.createQuery("from Product");
		 List<Product>plist=query.list();
		 
		 tr.commit();
         return plist;
		
		
	}
	@Override
	public Product searchproductById(Product p) {
		Transaction tr=session.beginTransaction();
		 Query query = session.createQuery("from Product");
		 
		 Product p1=(Product) session.get(Product.class,p.getProdid());
		 tr.commit();
		return p1;
	}

}
