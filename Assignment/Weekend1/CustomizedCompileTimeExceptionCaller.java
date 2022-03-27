package com.assignment.corejava.Weekend1;

public class CustomizedCompileTimeExceptionCaller {
  public void Mymethod() {
	try {
		throw new CustomizedCompileTimeExceptionRecipient("My Exception Handled");
	}catch(CustomizedCompileTimeExceptionRecipient e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}
