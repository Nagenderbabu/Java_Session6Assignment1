package course.implemnts.integers;

import java.util.Scanner;

public class IntegerMain extends PrintInteger{

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IntegerDemo id =new PrintInteger();
		IntegerDemo id1=new SquareInteger();
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer value :");
	   int value=sc.nextInt();
	   id.setInteger(value);
	   id1.setInteger(value);
		
	}

}
