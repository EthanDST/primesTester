//program to test if the input is prime
import java.util.*;  //this is an important package in Java
  
class primesTester { 
      
    // first, a function to check if a number n is prime or not 
    static boolean isPrime(int n) 
    { 
        // case is n is 1 or non-positive 
        if (n <= 1) 
            return false; 
       
        // need only check factors from 2 up to square root of n
        // for simpliciy test here up to n
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
      
    // calls the created function to test the input
    public static void main(String[] args)  
    { 
         if(isPrime(11))  
         System.out.println(" true") ; 
          
         else 
         System.out.println(" false"); 
           
    } 
} 
