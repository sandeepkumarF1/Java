import java.util.*;
class DiamondPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int i,j,k;
		System.out.println("Diamond Pattern:-");
		for(i=1; i<=n; i++){
			for(j=n; j>i; j--){
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
			for(i=n-1; i>=1; i--){
			for(j=n; j>i; j--){
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
