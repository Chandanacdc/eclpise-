package interviewQtn;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int c=sumArray(a);
		System.out.println(c);
	}
	public static int sumArray(int b[]) {
		int sum=0;
		for(int i=0;i<b.length;i++) {
			 sum+=b[i];
		}
		return sum;
	}
}
