package com.java.exception;

import java.io.IOException;

public class test2{  
	
   public static void main(String args[]) throws IOException{//declare exception  
	   
     M m=new M();  
     
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  