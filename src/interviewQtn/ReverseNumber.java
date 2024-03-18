package interviewQtn;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=543,reverse=0;
		while(n!=0) {
			int digit=n%10;//3//4//5
			reverse=digit+reverse*10;//3//4+30=34//5+340=345
			n=n/10;//54//5
		}
		System.out.println(reverse);
	}
}
