package interviewQtn;

public class Sorting {
	public static void main(String args[]) {
		int temp;
		int ar[]= {3,1,6,4,9,8};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int b:ar) {
			System.out.print(b+" ");
		}
	}
}
