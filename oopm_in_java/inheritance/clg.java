package oopm_in_java.inheritance;
import java.util.*;
public class clg {
   
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum =0;
        while(num>0){
            sum +=num%10;
            num = num/10;
        }
        if(n%sum == 0){
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }
    }
}
    

