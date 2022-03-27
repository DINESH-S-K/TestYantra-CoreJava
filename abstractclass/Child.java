package com.tyss.abstractclass;

public class Child extends Parent {
  public Child(int x) {
	  super(x);
  }
@Override
  void m1() {
	  System.out.println("m1 is calling");
  }
}
