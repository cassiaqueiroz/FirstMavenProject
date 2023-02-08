package io.github.cassiaqueiroz;

import java.util.Scanner;

public class FiveNumberMultiplier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float multiplier = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Write a number: ");
            float number = sc.nextFloat();
            multiplier *= number;

        }

        System.out.println("Result of the multiplication of numbers written: " + multiplier);

    }

}
