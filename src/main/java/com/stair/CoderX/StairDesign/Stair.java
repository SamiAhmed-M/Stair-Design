package com.stair.CoderX.StairDesign;

public class Stair {
 
	public static void stairDesign(int n)
	{
		// number of lines / rows & columns controller
		for (int i=1;i<=n;i++) {
			// number of space controllers
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			// number of symbols controller
			for (int z=1;z<=i;z++) {
				System.out.print("=");
			}
			
			// new line
			System.out.println();
		}
	}
}
