import java.util.*;
class arraySort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}



		System.out.println("Before Sorting");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nAfter Sorting");
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp =0;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
			System.out.print(arr[i]+" ");
		}
	}
}
