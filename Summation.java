import java.util.*;
import java.io.*;

public class Summation{
   public static void main(String[] args){
   int total = 0;
      for(int x = 0;x<2015;x++){
         if(x % 3 == 0){
            total += x;
         }
         else if(x%5 == 0){
            total += x;
         }
      }
      System.out.println(total);   
   }
}  