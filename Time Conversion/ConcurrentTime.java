import java.util.*;
import java.util.concurrent.TimeUnit;
class ConcurrentTime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter milliseconds: ");
		long milliseconds=sc.nextInt();
		//calculate-minutes
		long minutes=TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		System.out.println("Calculated Minutes: "+minutes);
		//calculate-seconds
		long seconds=TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println("Calculated Seconds: "+seconds);
	}
}
