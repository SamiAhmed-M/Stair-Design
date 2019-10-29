package com.stair.CoderX.StairDesign;

import java.util.Scanner;

/**
 * Create Stair Design
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Scanner object
    			Scanner myObj = new Scanner(System.in);
    			// User has to decide how many number of lines 
    			System.out.println("Please enter the number of lines or stair level");
    			int n = myObj.nextInt();
    			myObj.close();
    			Stair.stairDesign(n);
    }
}
