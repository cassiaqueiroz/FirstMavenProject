package io.github.cassiaqueiroz;

import javax.xml.transform.stream.StreamSource;

public class ShirtSize {

    public static void main(String[] args) {

           /* Old syntax */

            char size;

            size = 'M';

            /* Using “Switch”, we put an expression between parenthesis,
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

            /* New syntax */

            char kidSize = 'M';

             /* In the new syntax, "switch" is used as an expression that returns a value assigned
             to a variable (shirtColor).
             Each case is followed by the "->" operator and the expression to be returned.
             "Break" is not necessary.*/

            String shirtColor = switch (kidSize) {
                case 'P' -> "Red Shirt";
                case 'M' -> "Yellow Shirt";
                case 'G' -> "White Shirt";
                default -> "There's no shirt";
            };

            System.out.println(shirtColor);


    }

}


