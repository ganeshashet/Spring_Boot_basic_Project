package com.Springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new ClassPathXmlApplicationContext("Springboot.xml");
    	Read read=(Read)con.getBean(Read.class);
    	
        //System.out.println( "Hello World!" );
        System.out.println("the Subject is = "+read.getSubject());
        
    }
}
