package interviewQtn;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int ar[]=new int[n+2];
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n-2;i++) {
			int temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+" ");
		}
		

	}

}
