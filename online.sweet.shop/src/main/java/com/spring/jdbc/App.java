package com.spring.jdbc;

/**
 * Hello world!
 */
import java.io.*;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.SweetDao;
import com.spring.jdbc.entites.Admin;
import com.spring.jdbc.entites.Sweets;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "\n \t \t \t Welcome to Harsha's Sweet Online Application!!!!\n" );
        //Spring JDBC --> jdbc template =-====> implementation code
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("config.xml");
        
        SweetDao sweetDao=context.getBean("sweetDao",SweetDao.class );
        
     
        
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
        
        System.out.println("1.Im a Admin \t 2.Im a Customer");
        
        int choose=Integer.parseInt(br.readLine());
        
        
        if(choose==1) {
        
        boolean login=true;
        System.out.println("Welcome to Admin Page");
        
        System.out.println("Enter User name");
        String uname=br.readLine();
        
        System.out.println("Enter Password");
        String pass=br.readLine();
         
        try {
        Admin admin=sweetDao.getAdmin(uname, pass);
        System.out.println(admin);
      
        }
        catch(Exception e)
        {
        	  login=false;
        	System.out.println("Error in Password or usernames");
        }
     ///////////////   
        if(login==true) {
        	boolean loop=true;
        	while(loop) {
        		System.out.println("Press 1 to  Display Sweets");
    			System.out.println("Press 2 to  Add Sweets");
    			System.out.println("Press 3 to  Delete sweets");
    			System.out.println("Press 4 to  update the price of sweet");
    			System.out.println("Press 5 to  exit");
    			int num=Integer.parseInt(br.readLine());
    			
    			switch(num){
    			
    			case 1:{
    				
    				List<Sweets> sweet = sweetDao.getAllSweets();
    		        for(Sweets display: sweet) 
    		        	System.out.println(display);
    		        
    		        System.out.println("==================================");
    				
    			break;
    				
    			}
    			case 2:{
    				
    				System.out.println("Enter new Sweet Name");
    				String sweetname=br.readLine();
    				System.out.println("Enter" +sweetname +"Sweet Price ");
    				int price=Integer.parseInt(br.readLine());
    				
    				 Sweets sweet = new Sweets();
    				
    				 sweet.setSweetsname(sweetname);
    				 sweet.setPrice(price);
    		        int insert=sweetDao.insert(sweet);
    		        System.out.println("New sweet record inserted : " + insert);
    		        System.out.println("==================================");
    				break;
    			}
    			case 3:{
    				
    				System.out.println("Enter Sweet Id to delete the sweet record");
    				int id=Integer.parseInt(br.readLine());
    				int insert=sweetDao.delete(id);
    				 System.out.println("Sweet record deleted : " + insert);
      		        System.out.println("==================================");
    				break;
    			}
    			case 4:{
    				System.out.println("Enter Sweet Id to update the sweet price");
    				int id=Integer.parseInt(br.readLine());
    				System.out.println("Enter the updated price for this sweet");
    				int price=Integer.parseInt(br.readLine());
    				
    				 Sweets sweet = new Sweets();
    				 
    				 sweet.setSweetid(id);
    				 sweet.setPrice(price);
    				 int insert=sweetDao.update(sweet);
    				 System.out.println("Sweet price record Changed : " + insert);
      		        System.out.println("==================================");
    				break;
    				 
    				
    			}
    			case 5:{
    				System.out.println("Thank You");
    				loop=false;
    				break;
    			}
    			default :{
    				System.out.println("enter your Choice Correctly From the list Given Below");
    				
    			}
	
    			}
        	}
        }
       }
        else if(choose==2) {
        	System.out.println("welcome Customer");
        	
        	
        	
        }
        else {
        	System.out.println("");
        }
        
        
    
    ((ClassPathXmlApplicationContext)context).close();
    
    
}
}
