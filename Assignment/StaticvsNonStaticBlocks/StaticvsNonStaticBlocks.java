package com.assignment.corejava.StaticvsNonStaticBlocks;

public class StaticvsNonStaticBlocks {
		//  public static void main(String[] args) {
//			System.out.println("Program Started");
//			try{
//				throw new ArithmeticException();
//			}catch(Exception e) {
//				//e.printStackTrace();
//			}
//			System.out.println("Program end");
		//}
		//}
//			    static int b;
//			    public static void show()
//			    {
//			        System.out.println("Static method "+ b);
//			    }
//			    static
//			    {
//			        b = 5;
//			        show();
//			    }
//			    public static void main(String arg[])
//			    {
//			        System.out.println("Main method");
//			    }
//			}
//			    static int b;
//			    public static void show()
//			    {
//			        System.out.println("Static method");
//			    }
//			    static
//			    {
//			        b = 5;
//			        System.out.println("Value of b : " + b);
//			        show();
//			    }
//			    static 
//			    {
//			        b = 10;
//			        System.out.println("Value of b : " + b);
//			        show();
//			    }
//			    
//			    public static void main(String arg[])
//			    {
//			        System.out.println("Main method");
//			    }
//			}
			    static
			    {
			        System.out.println("Executing static block");
			    }
			    {
			        System.out.println("Executing non-static block");
			    }
			    StaticvsNonStaticBlocks()
			    {
			        System.out.println("Executing Constructor");
			    }
			    
			    
			    public static void main(String arg[])
			    {
			        StaticvsNonStaticBlocks obj = new StaticvsNonStaticBlocks();
			        System.out.println("Executing Main method");
			    }
			}
