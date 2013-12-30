package mainPackage;

import java.util.Scanner;

public class mainClass {
	
	
	public static Scanner sc = new Scanner(System.in);
	/*This names our scanner, and tells the program to read the System.in, or the
	 * system input, or what the user imputed for the base and height.
	 */
	
	public static void main(String[] args){
		//This is our new void. A "Void" is a term for a section that won't return something like a boolean.
		
		double base;
		double height;
		//Named our two variables that the user can alter.
		
		System.out.println("Hello! Welcome to the Triangle Area Finder!");
		//This greets our User to our program!
		
		System.out.print("\nWhat is the base of your triangle?:");
		//This asks the user to enter what is the base of his/her triangle.
		base = sc.nextDouble();
		//This tells the system to read what the user has inputed for his/her base value.
		
		System.out.print("\nWhat is the height of your triangle?:");
		//Again, asks for the height of the triangle
		height = sc.nextDouble();
		//And again, tells the system to read the user's input on his/her height.
		
		/*We can now add the Equation for the area of the triangle.
		 * To make things so much easier, we can divide the equation into two parts.
		 * One part being "Base x Height = preArea", and the other being "preArea / 2"
		 */
		
		 double preArea = base * height;
		 //This is the first half of our equation.
		 
		 double area = preArea / 2;
		 
		 System.out.println("\nYour area is: " + area + "\n Thanks for using our Triangle Area Finder!");
		 //This tells the user what the area is of his/her triangle!
		 
		 //done!
	}
}
