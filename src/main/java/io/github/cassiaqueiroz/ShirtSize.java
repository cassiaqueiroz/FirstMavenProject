package io.github.cassiaqueiroz;

import javax.xml.transform.stream.StreamSource;

public class ShirtSize {

    public static void main(String[] args) {

           /* Old syntax */

            char size;

            size = 'M';

            /* Obs.: Using “Switch”, we put an expression between parenthesis,
             not a condition (as we do when we use “If”);

             We use "break" to interrupt the execution of a block of statements.*/

            switch (size) {

                case 'P':

                    System.out.println ("Shirt A");

                    break;

                case 'M':

                    System.out.println("Shirt B");

                    break;

                case 'G':

                    System.out.println("Shirt C");

                    break;

                default:

                    System.out.println("There’s no shirt");

            }


    }

}


