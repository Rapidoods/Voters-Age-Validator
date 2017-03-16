package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int Age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");

        Age = sc.nextInt();

        if (Age >= 18)
            {
                System.out.println(Age + "year(s) old" + " Valid Age for Voting");
            }
        else
            {
                System.out.println(Age + "year(s) old" + " Not Valid Age for Voting");
            }

    }
}
