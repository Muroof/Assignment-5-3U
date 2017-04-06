
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // Ask player for a word
        System.out.println("Enter a word:");
        // Word input
        String word = input.nextLine();

        // Spaces to shield word from second player
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // creating a integer for amount of letters in the word
        int length = word.length();
        // using the integer to display correct amount of underscores
        String underscore = "_";
        for (int a = 1; a < length; a++) {
            underscore = underscore + " _";


        }

        // prints out underscores
        System.out.println(underscore);


        // gives the player 5 guesses
        int correct = length;
        int lives = 5;

        // loop while they have guesses 
        while (correct > 0 && lives > 0) {

            // asking the player for their guess
            System.out.println("Player Two: Enter in your guess, you have " + lives + " lives left.");
            // store their guess and store as a char
            String guess1 = input.nextLine();
            char letter1 = guess1.charAt(0);
            // space
            System.out.println("");



            // stores letter1 as an integer 
            int letter1Position = word.indexOf(letter1);
            // greater than 0 means the letter is in the word
            if (letter1Position >= 0) {

                while (letter1Position >= 0) {

                    String firstHalf = underscore.substring(0, letter1Position);

                    String lastHalf = underscore.substring(letter1Position + 1, length);

                    underscore = firstHalf + letter1 + lastHalf;




                }
            }








        }











    }
}
