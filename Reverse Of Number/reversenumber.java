import java.util.*;
class reversenumber{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        while(n>0){
            int r = n%10;
            System.out.print(r);
            n=n/10;
        }
        if(n<0){
           System.out.println("Please! Enter positive number.");
        }
    }
}

 
