package com.mypack;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class Fetch_All_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Configuration cfg = new Configuration();
	        cfg.configure("com/mypack/hibernate.cfg.xml");// populates the data of the
	                                            // configuration file

	        // creating session factory object
	        SessionFactory factory = cfg.buildSessionFactory();

	        // creating session object
	        Session session = factory.openSession();

	      
	      org.hibernate.Transaction tx=session.beginTransaction();
	      
	      
	      
	      

	  	
	  	String  query="from students";
	  	
	  	Query<students> q=session.createQuery(query);
	  		

	  	
	  	
	  	
	  	List<students> list=q.list();
	  	for(students students : list) {
	  		System.out.println("student ID = "+students.getStudentId()+  " studentName ="+students.getStudentName() +"  studentAddress = "+  students.getStudentCity() + "  studentAge ="+ students.getStudentage());
	  		
	  	}
	  	
	        
	       
	       
	      tx.commit();
	        session.close();

	}

}
