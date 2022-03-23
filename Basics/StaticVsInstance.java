package com.tyss.corejava;

public class StaticVsInstance {
	static int x;
	int y;
	public static void main(String[] args) {
		StaticVsInstance staticVsInstance = new StaticVsInstance();
		staticVsInstance.x = 10;
		staticVsInstance.y =20;
		
		StaticVsInstance staticVsInstance1 = new StaticVsInstance();
		staticVsInstance1.x = 100;
		staticVsInstance1.y =200;
		
		StaticVsInstance staticVsInstance2 = new StaticVsInstance();
		staticVsInstance2.x = 1000;
		staticVsInstance2.y =2000;
		
		System.out.println(staticVsInstance.x + " "+staticVsInstance1.x + " "+staticVsInstance2.x);
		
		System.out.println(staticVsInstance.y + " "+staticVsInstance1.y + " "+staticVsInstance2.y);
	}

}
