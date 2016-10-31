import java.util.*;
import java.io.*;

public class  FibonacciSequence{
   public static void main(String[] args){
      Queue<Integer> fibNumbs = new LinkedList<Integer>();
      ArrayList<Integer> finalNumbs = new ArrayList<Integer>();
      boolean maxValue = false;
      int fin = 0;
      int x = 1;
      fibNumbs.add(x);
      int y;
      int z;
      while(!maxValue);
         x++;
         fibNumbs.add(x);
         int y = fibNumbs.remove();
         int z = fibNumbs.peek();
         int a = y+z;
         if(a%2 == 0){
            fin += a;
            }
      }
   }
}