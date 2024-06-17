package com.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =  new Configuration();
		cfg.configure("com/mypack/hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		System.out.println(factory);
		System.out.println(factory.isClosed());
		
		
		
		students s1= new students(2,"Aditya","varanasi", 22);
		
		
		students s2= new students(1,"Amit","jaunnpur", 23);
		
		
		
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		
		session.save(s1);
		session.save(s2);
		
		
		
		tx.commit();
		session.close();
		
		System.out.println("Insert Data succefully ");
		
		

	}

}
