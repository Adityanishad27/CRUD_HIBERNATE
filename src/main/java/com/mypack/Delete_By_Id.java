package com.mypack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete_By_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Configuration cfg= new Configuration();
		cfg.configure("com/mypack/hibernate.cfg.xml");
		
SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your ID to Delete Data");
		
		 students s= new students();
		 int IDinput= sc.nextInt();
		 s.setStudentId(IDinput);
		 
		 session.delete(s);
		
		
		//	session.update(s);
			tx.commit();
			System.out.println("Object Deleted  successfully.....!!");
			session.close();
			factory.close();

	}

}
