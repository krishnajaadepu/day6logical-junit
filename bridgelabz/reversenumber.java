package com.bridgelabz;
/*  In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.*/

import java.util.*;
public class reversenumber {
	
	public static void performReverse(int number) {
		 int rev = 0;  
	        int temp = number;  
	        while(number != 0)     
	        {    
	            //Calculating reminder  
	            int rem = number % 10;   
	            //multiplying variable reverse by 10 and adding the reminder into it  
	            rev = rev * 10 + rem;    
	            //Divide the number  
	            number = number/10;    
	        }    
	        System.out.println(rev+" is the reverse of the number "+temp);    
	    }     
	  
	    public static void main(String[] args) {   
	      
	        //Getting number from the user  
	        Scanner sc = new Scanner(System.in);   
	        int number = sc.nextInt();  
	      
	        //Calling performReverse() method to perform reverse  
	        performReverse(number);  
		}  
		}  