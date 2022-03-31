package com.tyss.corejava.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dinesh {
	public static void main(String[] args) {
		Gokul gokul = new Gokul();
	    File file = new File("File");
	    String task;
		try {
			  task = gokul.task(file);
			  System.out.println(task);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not exist");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No data Exist");
		}
		
	}

}
