package com.bridgelabz;


/*Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.*/

public class Primenumber {
		//Creating check() method to ensure whether the given number is prime number or not  
	    static Boolean check(int number){    
	        int i,m=0;        
	        m=number/2;   
	          
	        //Returning false when the number is either 0 or 1 because 0 and 1 cannot be prime numbers   
	        if(number==0||number==1){    
	            return false;        
	        }else{  
	            //When the number is not 0 and 1  
	            for(i=2;i<=m;i++){        
	                if(number%i==0){        
	                    return false;        
	                }           
	            }        
	            return true;   
	        }//end of else    
	    }    
	    public static void main(String args[]){      
	        for(int i=0; i<=50; i++){  
	            if(check(i)){  
	                System.out.println(i+" is a Prime number");  
	            }  
	        }  
	}

}
