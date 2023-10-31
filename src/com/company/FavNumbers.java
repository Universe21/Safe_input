package com.company;

import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favourite_int = SafeInput.getInt(in, "Enter your favorite integer");

        double favourite_Double = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite Integer recieved: " + favourite_int);

        System.out.println("Your favorite Double recieved: " + favourite_Double);



    }



}


