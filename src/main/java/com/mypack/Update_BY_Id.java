package com.mypack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update_BY_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("com/mypack/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		
		
		students s = new students();
		
		Scanner sc = new Scanner(System.in); 
	
		s.setStudentId(3);
		
		
	
		s.setStudentName("Aditya Nishad");
		
		
		
		s.setStudentCity("Varanasi");
		
		
	
		s.setStudentage(24);
		
		Transaction tx = session.beginTransaction();
		session.update(s);
	tx.commit();

	System.out.println("Object Updated successfully.....!!");
	session.close();
	factory.close();

	}

}
