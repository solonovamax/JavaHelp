package reddit.javahelp.u;

import java.util.Scanner;


/**
 * Reddit Thread: https://www.reddit.com/r/javahelp/comments/ezl685/okay_im_really_confused_on_this_code_im_working/
 */
public class TheBoboGuy {
    
    public static void main(String[] args) {
        Scanner keyboard     = new Scanner(System.in);
        String  name         = "";
        int     age          = 0;
        String  theBigShow   = "";
        String  ticketChosen = "";
        String  description  = "";
        String  ticketType   = "";
        boolean military     = false;
        boolean disability   = false;
        boolean threeDMovie  = false;
        double  price        = 0.0;
        
        System.out.println("Welcome to the Alamo Drafthouse Cinema at Woodbridge");
        System.out.println("Let us help you find your ticket price");
        System.out.println("Please enter your name:");
        
        name = keyboard.nextLine();
        
        System.out.println(name + " please choose from the following");
        System.out.println("Enter B4 for a movie release before 4pm");
        System.out.println("Enter A4 for a movie release after 4pm");
        System.out.println("Enter TBS for the big show");
        
        ticketChosen = keyboard.nextLine();
        ticketChosen = ticketChosen.toUpperCase();
        
        if (ticketChosen.equals("B4")) {
            System.out.println("Here are ticket prices for movies before 4 pm.*");
            System.out.println("Adults (12 - 54): $12.00*");
            System.out.println("Seniors (55 and up) and Guests with disabilities: $10.50*");
            System.out.println("Military (w/ ID): $11.00*");
            System.out.println("Children (under 12): $10.00*");
            System.out.println("3D Movie - $15.00 regardless of age or military or disability status:");
        }
        
        if (ticketChosen.equals("A4")) {
            System.out.println("Here are ticket prices for movies after 4 pm.*");
            System.out.println("Adults (12 - 54): $14.00*");
            System.out.println("Seniors (55 and up) and Guests with disabilities: $11.50*");
            System.out.println("Military (w/ ID): $13.00*");
            System.out.println("Children (under 12): $10.50*");
            System.out.println("3D Movie - $17.00 regardless of age or military or disability status:");
        }
        
        if (ticketChosen.equals("TBS")) {
            System.out.println("Here are ticket prices for movies for The Big Show.*");
            System.out.println("Adults (12 - 54): After 4pm $18.00*");
            System.out.println("Adults (12 - 54): Before 4pm $16.00");
            System.out.println("Seniors/Military/Children/Guests with disabilities: $15.00*");
            System.out.println("3D - $15.00 Before 4 PM and $17.00 After 4 PM");
            System.out.println("3D prices are not reduced for age or disability or military status");
        }
        
        System.out.println("Please enter the age:");
        age = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Do you have a disability (Yes or No)");
        disability = getBool(keyboard.nextLine());
        
        if (age >= 18 && age < 62) {
            System.out.println("Are you in the military? (Yes or No)");
            military = getBool(keyboard.nextLine());
        }
        
        if (age >= 12 && age < 18) {
            System.out.println("Are your parent in the military (Yes or No)");
            military = getBool(keyboard.nextLine());
        }
        
        System.out.println("Are you going to watch a 3D movie? (Yes or No)");
        threeDMovie = getBool(keyboard.nextLine());
        
        if (ticketChosen.equalsIgnoreCase("B4")) { //Section for all B4 tickets
            description = "Before 4pm. Regular Price"; //Default description
            price = 12.00; //Default price
            if (military) {
                description += "Before 4pm. Military discount applied."; //Military description
                price = 11.00; //Military Price
            }
            if (disability || age > 54) {
                description += "Before 4pm. Disability discount applied."; //Disability description
                price = 10.50; //Disability price
            }
            
            if (age < 12) {
                description = "Before 4pm. Child ticket applied"; //Child description
                price = 10.00; //Child price
            }
            if (threeDMovie) {
                description = "Before 4pm. 3D movie price."; //3D description
                price = 15.00; //3D price
            }
        }
        
        System.out.println(name + " ticket confirmation");
        System.out.println("Ticket Type: " + description);
        System.out.println("Price: " + price);
        System.out.println("Silence your smart phone and put it away.");
        System.out.println("Eat, drink, watch, and enjoy the show.....");
        System.out.println("but be quiet so that others can enjoy the show too!");
        System.out.println("Please come again " + name);
    }
    
    public static boolean getBool(String s) {
        if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("t") ||
            s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")) { return true; }
        if (s.equalsIgnoreCase("false") || s.equalsIgnoreCase("f") ||
            s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n")) { return false; }
        
        throw new IllegalArgumentException("Must be a yes or no.");
    }
}
