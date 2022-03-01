package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


        System.out.println("\nTASK3\n");

        /*
        Requirement:
        Write a program that asks user to enter 5 numbers 
        between 1 to 10 (1 and 10 are included)
        They will get some points based on numbers they 
        entered. So, their points will be calculated as below
        1st  number will be multiplied by 5 and added as points
        2nd number will be multiplied by 4 and added as points
        3rd number will be multiplied by 3 and added as points
        4th number will be multiplied by 2 and added as points
        5th number will be multiplied by 1 and added as points
        If user enters any number that is not in the range, 
        then user will not get any points from that number
        
        Test data:
        3 7 2 1 8
        Expected result:
        59
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 5 numbers");
        int n1 = s.nextInt(), n2 = s.nextInt(), n3 = s.nextInt(), n4 = s.nextInt(), n5 = s.nextInt();
        
        int points = 0;
        
        if (n1 >= 1 && n1 <= 10){
            points += n1 * 5;
        }

        if (n2 >= 1 && n2 <= 10){
            points += n2 * 4;
        }

        if (n3 >= 1 && n3 <= 10){
            points += n3 * 3;
        }

        if (n4 >= 1 && n4 <= 10){
            points += n4 * 2;
        }

        if (n5 >= 1 && n5 <= 10){
            points += n5;
        }

        System.out.println(points);
    }
}
