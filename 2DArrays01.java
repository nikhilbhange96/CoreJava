import java.util.*;

class Arrays03{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int r=sc.nextInt();
		
		int arr[][]=new int[r][];
		for(int i=0; i<r; i++){
			System.out.println("Enter row size "+i+" of column");
			int c= sc.nextInt();
			arr[i]=new int[c];
			System.out.println("Enter " + c + " elements for row " + i + ":");
			for(int j=0; j<c; j++){
				
				arr[i][j]=sc.nextInt();
			}
		}
		//arr[0]=new int[]{4,5};
		//arr[1]=new int[]{6,7,8};
		//arr[2]=new int[]{1,2,3,4};
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
}