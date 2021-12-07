package OOP_Assigement;

import java.util.Scanner;

/*Write a Java program that prompts the user for
 an integer and then prints out all the prime numbers up to that Integer?*\


/* note
prime number are those which are divisible by itself and leave the remainder 0
and which is divisible by 1 and leave the remainder 0
 */

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count;


        for(int i = 2 ;i<=num;i++)
        {
            count = 0;
            for(int j =2;j<i;j++)
            {
                if(i%j==0)
                count += 1 ;
                System.out.println("in");
            }
        if (count == 0){
            System.out.println(i);
        }
        }



    }
}
