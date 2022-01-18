package com.rajesh.spcore;

import java.io.File;

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
        System.out.println( "App Starts" );
       
        ApplicationContext appctx= new ClassPathXmlApplicationContext("app.xml"); 
        
        //BasePart part=new MfgPart();
        BasePart part=(BasePart) appctx.getBean("mfg");  //default name for this non qualified , decapitalized value.. i.e. just class name in small caps
        //System.out.println( "Bean exists ="+appctx.getId().toString() );
        part.create();
        
        Engpart engpart=(Engpart) appctx.getBean("eng");
        System.out.println( "Main method part."+engpart.getMatsup() );
        
        Material matr=(Material)appctx.getBean("material");
        System.out.println( matr );
    }
}
