package com.tyss.corejava.Exception;

import java.util.Scanner;

public class ArrayIndexOutOFBoundsException {
	public static void main(String[] args) {
		try{
			Scanner scanner = new Scanner(System.in);
//			System.out.println(scanner);
//			
//			ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
//			System.out.println(arrayIndexOutOfBoundsException);
//			
//			Exception exception  = new Exception();
//			System.out.println(exception);
//			
//			Exception exception1  = new ArrayIndexOutOfBoundsException();
//			System.out.println(exception1);
			
			System.out.print("Enter First Number :");
			int number1 = scanner.nextInt();
			System.out.print("Enter Second Nimber :");
			int number2 = scanner.nextInt();
			int res  = number1/number2;
		    int[] a;
		    a  = new int[res];
		    a[4] = 20;
			System.out.println(a[4]);
			
		   }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){ 
			   if(e instanceof ArrayIndexOutOfBoundsException)
			   {
				   e.printStackTrace();
				   System.out.println("The index is your accessing is not present");
			   }
			   if(e instanceof ArithmeticException)
			   {
				   System.out.println("Give proper number2");   
			   }
		   }
//		    }catch(ArrayIndexOutOfBoundsException e){
		    	
		// Exception exception  = new ArrayIndexOutOfBoundsException(); Upcasting
		//}catch(Exception e){
//			System.out.println("The index is your accessing is not present");
//		    }catch(ArithmeticException e) {
//		    	System.out.println("Give proper number2");
//		    }
		System.out.println("Program end");
	}
}
