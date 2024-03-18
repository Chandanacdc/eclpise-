package interviewQtn;

import java.util.Arrays;

public class AdjucentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum difference between adjucent array
		 int a[]={1,4,8,15,17}; //3,4,7,2
		 int result=adjucentDiff(a);
		 System.out.println(result);
	}
	public static int adjucentDiff(int b[]) {
		int diff=0;
		for(int i=0;i<b.length-1;i++) {
			if(b[i+1]-b[i]>diff) {
				diff=b[i+1]-b[i];
			}
		}
		return diff;
	}
}


