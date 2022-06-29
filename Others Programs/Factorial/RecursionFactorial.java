import java.util.*;
class RecursionFactorial{
	static int factorial(int num){
	if(num==0 || num==1){
		return 1;
	}
	else{
		return (num*factorial(num-1));
	}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int fact=1;
		fact=factorial(num);
		System.out.println("Factorial of number is: "+fact);
	}
}
