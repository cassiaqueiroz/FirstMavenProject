package io.github.cassiaqueiroz;

import java.util.Scanner;

public class MaxNumberOf2 {

    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Write a number and press enter:");

            x = sc.nextInt();

        System.out.print("Write another number and press enter:");

            y = sc.nextInt();

        sc.close();

        if (x > y) {


            System.out.print("Maximum Number:" + x);

        }else {

            System.out.print("Maximum Number:" + y);

        }

    }

}
