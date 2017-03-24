package course.implemnts.integers;

import java.util.Scanner;

public class IntegerMain extends PrintInteger{

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing implemented(PrintInteger) class and referring it to interface class object
		IntegerDemo id =new PrintInteger();
		// initializing implemented(SquareInteger) class and referring it to interface class object
		IntegerDemo id1=new SquareInteger();
		// Scanner object to take input from user
	   Scanner sc=new Scanner(System.in);
	   // display statement for user asking entry of input
		System.out.println("enter any integer value :");
	   // passing input from scanner object to local variable
		int value=sc.nextInt();
	   // displays input value
		id.setInteger(value);
	   // displays square of given input value
	   id1.setInteger(value);
		
	}

}
