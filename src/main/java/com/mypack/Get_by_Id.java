package com.mypack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Get_by_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =  new Configuration();
		cfg.configure("com/mypack/hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		

		Session session= factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		
		
		
         System.out.println("Enter your ID to get Details");
         Scanner sc = new Scanner(System.in);
         
       int IDinput=sc.nextInt();
        		 
         
         
	students s=(students)session.get(students.class,IDinput);


		System.out.println(s);
  transaction.commit();
		session.close();
		factory.close();
		
		

	}

}
