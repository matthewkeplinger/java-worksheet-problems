/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computearea;

import static java.lang.System.in;

/**
 *
 * @author matth
 */
public class ComputeArea {

    public static void main(String[] args) {
        //Declare variables for radius, area
        double radius;
        double area = 0;
        
        //get user input for radius value
        System.out.println("Enter a radius value: ");
        radius = in.nextLine();
        
        //Output area calculation to console
        System.out.println("A circle with the radius of" + radius + "has the area of" + area);
    }
    
}
