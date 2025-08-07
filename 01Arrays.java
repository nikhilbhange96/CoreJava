
import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		int [] marks = {98,97,95,94};
		System.out.println(marks[2]);
		//Arrays.sort(marks);
		System.out.println(marks[2]);
		
		//2D Arrays
		
		int [][] score = {{98,97,92},{87,99,94}};
		System.out.println(score[1][2]);
		
		//reverse an Array
		int l = marks.length;
		int n = Math.floorDiv(l,2);
		for( int i=0; i<n; i++) {
			
			int temp = marks [i];
			marks[i]= marks[l-i-1];
			marks[l-i-1]= temp;
		}
		for(int e:marks) {
			System.out.print(e+ " ");
			
			
		}
		System.out.println();
		int []arr = {1,3,5,2,6};
		int h = arr.length;
//		int b = Math.floorDiv(h, 2);
//		for (int i=0;i<b;i++) {
//			
		for(int i=0;i<h/2;i++) {
			//swap numbers
			int temp = arr[i];
			arr[i]= arr[h-i-1];
			arr[h-i-1]= temp;
			
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
			
	}
}

