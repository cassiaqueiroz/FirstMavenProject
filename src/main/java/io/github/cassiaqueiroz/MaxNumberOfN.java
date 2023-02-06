package io.github.cassiaqueiroz;

import java.util.Scanner;

/**
 * This class finds the maximum number of n input numbers before input is '0'.
 */

public class MaxNumberOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==Write some numbers and press Enter after each one==");
        System.out.println("(Press number '0' and Enter when you want to stop.)");

        int number = sc.nextInt();
        int max = number;

        while (number != 0) {
            number = sc.nextInt();
            if (number > max) {
                max = number; //Max will always have the value of the maximum number seen so far.

            }
        }
        System.out.println("The maximum number you wrote was: " + max);

    }

}