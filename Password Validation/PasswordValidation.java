import java.util.*;
public class PasswordValidation{
	public static final int PasswordLength=6;
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Valid Password Must Contain:\n"+"1.A letter and number.\n"+"2.Atleast 2 digits.\n"+"3.Must be of 6 Character.\n");
		System.out.println("Enter password: ");
		String s=sc.nextLine();
		
		if(ValidPassword(s)){
			System.out.println("Password is valid: "+s);
		}
		else{
			System.out.println("Password is not valid: "+s);
		}
	}
	public static boolean ValidPassword(String password){
		if(password.length() < PasswordLength){return false;}
		int charCount=0;
		int numCount=0;
		for(int i=0; i< password.length(); i++){
			char ch = password.charAt(i);
			
			if(isNumeric(ch)){numCount++;}
			else if(isLetter(ch)){charCount++;}
			else return false;
		}
		return (charCount >= 2 && numCount >= 2);
	}
	public static boolean isLetter(char ch){
		ch=Character.toUpperCase(ch);
		return(ch >= 'A' && ch <= 'Z');
	}
	public static boolean isNumeric(char ch){
		return(ch >= '0' && ch <='9');
	}
}
