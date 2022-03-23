package com.tyss.interfaceclass;

public class Citizen implements Calculator {
	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public double mul(int x, int y) {
		return x*y;
	}

	@Override
	public double div(int x, int y) {
		return x/y;
	}

}
