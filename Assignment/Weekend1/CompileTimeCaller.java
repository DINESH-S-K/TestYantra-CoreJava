package com.assignment.corejava.Weekend1;

public class CompileTimeCaller {
	public static void main(String[] args) {
		System.out.println("Program Start");
		CompileTimeRecipient compileTimeRecipient = new CompileTimeRecipient();
		try {
			compileTimeRecipient.thread();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException is handled");
		}
		System.out.println("Program End");
	}

}
