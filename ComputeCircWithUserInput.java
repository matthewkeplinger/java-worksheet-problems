/*
 * Matt Keplinger
 * CSCI 1301
 * Circ calculation with user input on radius
 * Also includes user input via Scanner object
 * 06 June 2018
 */
import java.util.Scanner;

public class ComputeCircWithUserInput {
    public static void main(String[] args) {
        // declare variables for radius, circ(circumference), area, PI
        double area, circ, radius;
        final double PI = 3.14159;
        
        //make a scanner object
        Scanner input = new Scanner(System.in);
        
        // get/set radius value
        System.out.print("Enter a radius value: ");
        radius = input.nextDouble();
    
        
        //compute radius value in "circ" and output to user
        circ = (2 * PI * radius);
        
        //compute radius value in "area" and output
        area = (radius * radius * PI);
        
        //output value of radius and circ to user
        System.out.println("A circle with a radius of " 
                + radius + " has the circumference of " + circ + " and an area of " + area);
    }
    
}
