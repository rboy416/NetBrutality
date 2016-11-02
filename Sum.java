import java.math.BigInteger;

public class Sum{
	public static void first(int n){
		int to3 = (n-n%3)/3, to5 = (n-n%5)/5, to15 = (n-n%15)/15;
		int sum3 = (3*(to3+1)*to3)/2, sum5 = (5*(to5+1)*to5)/2, sum15 = (15*(to15+1)*to15)/2;
		System.out.println(sum3+sum5-sum15);
	}
	public static void second(int n){
		BigInteger f0 = BigInteger.valueOf(1), f1 = BigInteger.valueOf(1), f = BigInteger.valueOf(1), sum = BigInteger.ZERO;
		for (int i = 1; i<n; i++){
			f1 = f;
			f = f.add(f0);
			f0 = f1;
			
			System.out.println(f + "\n");
			if (f.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)){
				System.out.println("n: " + n + " i: " + i);
				n++;
				continue;
			}
			else{
				sum = sum.add(f);
			}
		}
		System.out.println(sum);
		String endSum = sum.toString();
		System.out.println("9: " + Character.getNumericValue('9'));
		int digitSum = 0;
		for (int j = 0; j<endSum.length(); j++){
			char c = endSum.charAt(j);
			digitSum += Character.getNumericValue(c);
		}
		System.out.println(digitSum);
	}
	public static void main(String[] args){
		first(2015);
		second(2017);
	}
}