/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


public class UserInput {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        //declare an integer variable, use system.out.print for same line input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // system.out.println is ugly and puts user input on the next line. its sloppy. 
        System.out.println("Enter a whole number: ");
        int number2 = input.nextInt();
        
        //show output, concatenate number and number2 into a string to show user their inputs
        System.out.println("The values entered are " + number + " and " + number2);
    }
    
}
