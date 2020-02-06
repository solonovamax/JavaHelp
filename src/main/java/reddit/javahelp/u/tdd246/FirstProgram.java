package reddit.javahelp.u.tdd246;

import java.util.Scanner;


/**
 * Reddit Thread: https://www.reddit.com/r/javahelp/comments/ewjiuh/new_with_programming_homework_help/
 */
public class FirstProgram {
    /*
     * The starting point for the program. This method
     * calls on the other three methods as needed
     */
    public static void main(String[] args) {
        //Declaring local variables for later use
        String  firstName, lastName;
        int     targetNumber, userGuess, countGuesses;
        int     triangleHeight;
        Scanner keyboardReader = new Scanner(System.in);
        
        //Get user's name
        System.out.println("Enter first and last name: ");
        firstName = keyboardReader.next();
        lastName = keyboardReader.next();
        
        //Display a marquee with a personal greeting
        printBorder('*', 30);
        greet(firstName);
        printBorder('*', 30);
        
        // Explain how to play the game
        explainGame(firstName);
        
        // Set up the game
        targetNumber = (int) (1 + 50 * Math.random());
        
        for (countGuesses = 1; countGuesses <= 5; countGuesses++) {
            printBorder('*', 30);
            System.out.print("Enter guess #" + countGuesses + ": ");
            userGuess = keyboardReader.nextInt();
            
            //The user made the right guess.
            if (userGuess == targetNumber) {
                System.out.println("Good job " + firstName + ", ");
                System.out.println("you got it in " + countGuesses + " tries.");
                break;
            }
            //Give advice - Let the user know if his guess is higher or lower than the target number.
            else {
                if (userGuess < targetNumber) {
                    System.out.println("Too low. Guess higher.");
                } else {
                    System.out.println("Too high. Guess lower.");
                }
            }
        }
        // The user could not guess the number in 5 trials
        if (countGuesses > 5) {
            System.out.println("Hard luck! " + firstName + " ");
        }
        // Some artworks:
        printBorder('#', 30);
        System.out.println("And now, a triangle of money!");
        
        triangleHeight = 8;
        // Display a triangle
        for (int i = 0; i < triangleHeight; i++) { //master triangle loop. The i < triangleHeight will check if it's the right size.
            for (int j = 0; j < i; j++) {//this is the loop that generates the width of the triangle. If i is 2 (the height), then it will have 2 $ symbols. (j < i)
                System.out.print("$ "); //make a $ symbol
            }
            System.out.println(); //new line, for next part of triangle.
        }
    }//end main method
    
    //Prints a personalized welcome message.
    public static void greet(String name) {
        System.out.println("Hello " + name + ", ");
        System.out.println("Welcome to my first CSE 174 program!");
        System.out.println("Enjoy the show!");
        System.out.println("  Sincerely,\n Duy Tran");
        
    }//end greet method
    
    //Prints a personalized game introduction.
    
    public static void explainGame(String name) {
        System.out.println("Let's play a game, " + name + "...");
        System.out.println("I'm thinking of a number from 1 to 50.");
        System.out.println("See if you can guess it in fewer than 5 tries");
    }//end explainGame method
    
    //Prints a border by repeating the specified symbol
    public static void printBorder(char symbol, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(symbol);
        }
        System.out.println(); //moves to the next line
    }//end printBorder method
}//end class