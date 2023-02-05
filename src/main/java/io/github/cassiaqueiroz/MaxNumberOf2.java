package io.github.cassiaqueiroz;

import java.util.Scanner;

/**
 * This class finds the maximum number of two input numbers.
 */
public class MaxNumberOf2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write a number and press enter:");

        int x = sc.nextInt();

        System.out.print("Write another number and press enter:");

        int y = sc.nextInt();

        sc.close();

        if (x > y) {


            System.out.print("Maximum Number:" + x);

        } else {

            System.out.print("Maximum Number:" + y);

        }

    }

}
