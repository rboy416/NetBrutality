import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Factorial{
   public static void main(String[] args){
   BigInteger x = new BigInteger("0");
   BigInteger factorial = new BigInteger("1");
   BigInteger fin = new BigInteger("0");
   ArrayList<Integer> numbs = new ArrayList<Integer>();
   boolean numreach = false;
   while(!numreach){
      x = x.add(new BigInteger("1"));
      factorial = factorial.multiply(x);
      fin = fin.add(factorial);
      
      //System.out.println(factorial+" "+fin+" "+x);
      if(x.intValue()==2015)
         numreach = true;
      }
      System.out.println(fin.toString().length());
      //System.out.println(x);
   }
}