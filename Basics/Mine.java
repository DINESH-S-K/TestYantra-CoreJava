package com.tyss.corejava;
import java.util.Scanner;
public class Mine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c =0;
		String str = sc.nextLine();
		sc.close();
		for(int i = 0;i<str.length();i++)
		{
			char t =str.charAt(i);
			if(t==' ')
			{
				c++;
			}
			
		}
		if(c==0)
			System.out.println("No space");
		else 
			System.out.println(c);

	}

}
