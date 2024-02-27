/**
 * This program tells the user the amount of energy 
 * based on the mass they input
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-26
 */

// imports
import java.util.Scanner;

public final class Einstein {
  public static void main(String[] args) {
    try {
      final double SPEED_OF_LIGHT = 299792458;
      
      Scanner userInput = new Scanner(System.in);
      // prompts the user to enter input.
      System.out.println(" Enter the mass (kg)of a object :");
      // Gets the users input
      Double mass = userInput.nextDouble();
      if (mass <= 0) {
        // If it is less than or to 0 it tells the user and than end the program.
        System.out.println("You can not enter zero or a negative number");
    } else {
        //Takes the users mass and * by the SPEED_OF_LIGHT to the power of 2.
        double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
        System.out.println("Your energy is " + energy + "J");
      }
    } catch (Exception e) {
      // error checks for letters.
      System.out.println("You can not enter letters " + e.getMessage());
    }
  }
}
