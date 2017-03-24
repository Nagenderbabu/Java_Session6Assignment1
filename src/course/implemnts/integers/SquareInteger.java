package course.implemnts.integers;

public class SquareInteger implements IntegerDemo {

	// // overriding abstract method
	@Override
	// implementing abstract method to print the square of integer 
	public void setInteger(int number) {
		// TODO Auto-generated method stub
	 number=number*number;
		System.out.println("Square of the given integer is :"+" "+number);
		
	}



}
