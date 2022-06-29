import java.util.*;
class Fibonnacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of fibonnacci series: ");
		int count=sc.nextInt();
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		for(int i=0; i<=count; ++i){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
