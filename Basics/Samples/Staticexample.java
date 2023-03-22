

package com.mycompany.staticexample;


public class Staticexample {
	
	 int num = 10;
	static  String str =  "Dhina";
         
        static  String two(){
             
             return str;
             
         }
public static void main(String args[])
	{
                Staticexample obj = new Staticexample();
               
              
                System.out.println( obj.num);
		System.out.println( two());
                 
		
	}
}
