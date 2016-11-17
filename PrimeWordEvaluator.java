import java.io.*;
import java.util.*;

public class PrimeWordEvaluator{
   public static void main(String args[]){
      System.out.println("Enter a word: ");
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int total = 0;
      for(char c: s.toCharArray()){
         if((int)c>96)
            total += (int)c - 96;
         else if((int)c>64){
            total += (int)c - 64;
         }     
      }
      boolean isPrime = false;
      for(int z = 2;z<=total;z++){
         if(total%z==0)
            isPrime = true;
      }
      if(!isPrime)
         System.out.println(s + " is not a prime number.");
      else
         System.out.println(s + " is a prime number."); 
   }
}