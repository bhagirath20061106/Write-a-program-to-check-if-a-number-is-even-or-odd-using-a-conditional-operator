package bhagirath;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
       if(num%2==0)
    	   System.out.print("Even");
       else
    	   System.out.print("Odd");
        scanner.close();
    }
}
