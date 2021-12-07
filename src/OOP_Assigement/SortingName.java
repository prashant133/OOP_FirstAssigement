package OOP_Assigement;
//Write a Java program for sorting a given list of names in ascending order?
import java.util.Scanner;

public class SortingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of name : ");
        int total_names = sc.nextInt();
        String names[] = new String[total_names];//holds the input given by the user
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the name : ");
        for(int i = 0;i<total_names;i++)//allow to take names as many as we want to
        {
         //store the name in the array names
            names[i] = sc2.nextLine();
        }
        String temp;
        for (int i = 0;i<total_names;i++)
        {
            for(int j = i+ 1 ;j <total_names ;j++)
            {
                if (names[i].compareTo(names[j])>0)
                {//swap the elements
                    temp = names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("the names in order are:");
        for(int i=0;i<total_names-1;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names[total_names-1]);
    }
}