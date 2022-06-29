import java.util.*;
class NormalTimeConversion{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter milliseconds: ");
		long milliseconds=sc.nextInt();
		//calculate-minutes
		long minutes=(milliseconds/1000)/60;
		System.out.println("Calculated minutes: "+minutes);
		//calculate-seconds
		long seconds=(milliseconds/1000)%60;
		System.out.println("Calculated seconds: "+seconds);
	}
}
