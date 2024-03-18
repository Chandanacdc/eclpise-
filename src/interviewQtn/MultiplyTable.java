package interviewQtn;

public class MultiplyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=multiply(5,10);
		System.out.println(result);
	}
	public static int multiply(int a,int b) {
		int sum=0;
		int i=0;
		while(i<b) {
			sum+=a;
			i++;
		}
		return sum;
	}
}
