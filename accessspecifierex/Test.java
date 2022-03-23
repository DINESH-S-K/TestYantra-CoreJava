package com.tyss.accessspecifierex;

import com.tyss.accessspecifier.AccessSpecifier;

public class Test extends AccessSpecifier {
	public static void main(String[] args) {
	AccessSpecifier accessSpecifier = new AccessSpecifier();
	System.out.println(accessSpecifier.a);
	accessSpecifier.add(5, 6);
	
	Test test = new Test();
	System.out.println(test.c);
	test.mul(6, 7);
	}

}
