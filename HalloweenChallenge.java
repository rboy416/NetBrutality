import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class HalloweenChallenge{
   public static void main(String[] args){
      BigInteger sum  = new BigInteger("0");
      for(int x = 0;x<=2000000016;x++){
         if(x%31==0)
            sum = sum.add(BigInteger.valueOf(x));
         else if(x%13==0)
            sum = sum.add(BigInteger.valueOf(x));
         //System.out.println(sum.toString());
      }
      System.out.println("Sum = " + sum.toString());
   }
}