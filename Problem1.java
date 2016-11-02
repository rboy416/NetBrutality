import java.math.BigInteger;

public class Problem1 {
	public static void main(String[] args){
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i<2000000016; i++){
			if (i%13==0 || i%31==0){
				sum = sum.add(BigInteger.valueOf(i));
				//System.out.println(BigInteger.valueOf(i));
			}
		}
		System.out.println("The sum is: " + sum.toString());
	}
}