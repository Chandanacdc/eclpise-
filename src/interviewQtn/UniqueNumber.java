package interviewQtn;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find unique number
		int a[] = { 3, 4, 5, 4, 5, 5, 4, 3, 3, 9 };
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					k++;
				}

			}
			System.out.print(a[i]+"");
			System.out.println(k);
			if(k==1) {
				System.out.println("Unique Number: "+a[i]);
			}
		}}

	}

}
