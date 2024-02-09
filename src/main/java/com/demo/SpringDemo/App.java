package com.demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.core.Bike;
import com.demo.core.Car;
import com.demo.core.Tyre;
import com.demo.core.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring.xml");
 
    	
    	Tyre t= (Tyre)context.getBean("tyre");
    	System.out.println(t);
    	System.out.println("t1.hashCode()===" + t.hashCode());
    	
    
//    	Vehicle v = (Vehicle)context.getBean("veh");
//    	v.drive();
//    	System.out.println(v.hashCode());
//    	
//    	Vehicle v1 = (Vehicle)context.getBean("veh");
//    	v1.drive();
//    	System.out.println(v1.hashCode());
//    	
//    	Vehicle v2 = (Vehicle)context.getBean("veh");
//    	v2.drive();
//    	System.out.println(v2.hashCode());
    	
    	
 
    	
    			
    }
}
