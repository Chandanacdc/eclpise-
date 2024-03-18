package interviewQtn;

public class MinNumberMultiDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{1,3,6}
		//{4,8,9}
		//{1,4,9}
		int abc[][]= {{8,3,6},{4,8,9},{2,4,9}};
		int min=abc[0][0];
				for(int i=0;i<abc.length;i++) {
			for(int j=0;j<abc.length;j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
			}
			
		}System.out.println(min);
	}

}
