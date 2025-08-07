import java.util.*;

class Array01{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//Arrays.sort(arr);
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int l=0;
		int s=Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
			if(arr[i]>l){
				l=arr[i];
				
			}
			
		}
		System.out.println("Largest Element is:"+l);
		for(int i=0; i<n; i++){
			if(arr[i]<s){
				s=arr[i];
				
			}
			
		}
		System.out.println("Smallest Element is:"+s);
		
		int sum=0;
		for(int i=0; i<n; i++){
			sum+=arr[i];
		}
		System.out.println("Second largest Element is:"+arr[n-2]);
		System.out.println("Second Smallest Element is:"+arr[1]);
		
		System.out.println("Sum is:"+sum);
		int target=5;
		for(int i=0; i<n;i++){
			if(arr[i]==target){
				System.out.println("Target  found at index:"+i);
			}
			
		}
		int secondlarge=0;
		int secondsmallest=0;
		for(int i=0; i<n; i++){
			if(arr[i]<l){
				secondlarge=arr[i];
			}
		}
		
		
		for(int i=0; i<n; i++){
			if(arr[i]>s){
				secondsmallest=arr[i];
				
			}
			
		}
		
	}
}