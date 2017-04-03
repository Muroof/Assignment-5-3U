
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
        for (int a = 1; a < length; a++){
            underscore = underscore + " _";
        }
         
        // prints out underscores
        System.out.println(underscore);
        
        
        // gives the player 5 guesses
        int correct = length;
        int guesses = 5;
        
        // loop while they have guesses 
        while (correct > 0 && guesses > 0) {
            
        // asking the player for their guess
        System.out.println("Player Two: Enter in your guess, you have " + guesses +  " guesses left.");
        // store their guess and store as a char
        String guess1 = input.nextLine();
        char letter1 = guess1.charAt(0);
        // space
        System.out.println("");
        
        
        // creates a intger for first letter in guess
        int letterPos = word.indexOf(letter1);
            
        if (letterPos >= 0) {
            
        }
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
