package de.oose.mbean;


import java.lang.management.*; 
import javax.management.*; 
 
public class Main { 
 
   public static void main(String[] args) throws Exception { 
 
      MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
 
      ObjectName name = new ObjectName("de.oose.mbean:type=Hello"); 
 
      Hello mbean = new Hello(); 
 
      mbs.registerMBean(mbean, name); 
 
      System.out.println("Waiting forever..."); 
      Thread.sleep(Long.MAX_VALUE); 
   } 
} 
