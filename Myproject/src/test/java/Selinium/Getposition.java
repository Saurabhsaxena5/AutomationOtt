package Selinium;

public class Getposition {
	
	static int sum=0;

	public static void main(String[] args) {
		test(1);

	}
	
	public static void test(int n) {
		if(n<=3) {
			sum=sum+n;
			test(n+1);
		}
		else {
			System.out.println("The sum is:"+sum);
		}
	}
}
