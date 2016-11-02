import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class  FibonacciSequence{
   public static void main(String[] args){
      Queue<BigInteger> fibNumbs = new LinkedList<BigInteger>();
      boolean maxValue = false; 
      BigInteger fin = new BigInteger("1");
      BigInteger two = new BigInteger("2");
      fibNumbs.add(new BigInteger("0"));
      fibNumbs.add(new BigInteger("1"));
      BigInteger y;
      BigInteger z;
      int x = 0;
      while(!maxValue){
         y = fibNumbs.remove();
         z = fibNumbs.peek();
         BigInteger a = y.add(z);
         fibNumbs.add(a);
         if(a.mod(two).intValue()==0){
            fin = fin.add(a);
            x++;
            }
         if(x==2015)
            maxValue = true;
      }
      System.out.println(fin.toString().length());
   }
}