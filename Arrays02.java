import java.util.*;

class Arrays02{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int n= sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Length of Array is:"+arr.length);
		int []arr2=new int[n];
		System.arraycopy(arr,0,arr2,0,arr.length);
		System.out.println("Copied array is:");
		for(int i=0; i<n; i++){
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		int []a=new int[arr.length];
		a=(int [])arr.clone();
		System.out.println("Cloned Array is:");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted Array is:");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int []b=new int[arr.length];
		b=Arrays.copyOfRange(arr,1,4);
		try{
		for(int i:b){
			System.out.print(b[i]+" ");
		}
		}
		catch(Exception e)
		{}
		System.out.println();
		Arrays.fill(a,7);
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();


	}
}