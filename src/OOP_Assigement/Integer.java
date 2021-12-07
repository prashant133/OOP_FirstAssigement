package OOP_Assigement;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int m,total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number total number of integers");
        int num= sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
            System.out.println("Enter the integer("+i+"):");
            m =sc.nextInt();
            total = total + m;//add the every number it gets..
        }
        System.out.println("the sum of the integer is :"+total);

    }
}
