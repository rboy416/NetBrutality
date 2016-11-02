

public class Sum{
	public static void first(int n){
		int to3 = (n-n%3)/3, to5 = (n-n%5)/5, to15 = (n-n%15)/15;
		int sum3 = (3*(to3+1)*to3)/2, sum5 = (5*(to5+1)*to5)/2, sum15 = (15*(to15+1)*to15)/2;
		System.out.println(sum3+sum5-sum15);
	}
	public static void second(int n){
		int f0 = 1, f1 = 1, f = 1, sum = 0;
		for (int i = 1; i<n; i++){
			f1 = f;
			f += f0;
			f0 = f1;
			
			
			if (f%2==1){
				n++;
				continue;
			}
			else{
				sum += f;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		first(2015);
		second(2017);
	}
}