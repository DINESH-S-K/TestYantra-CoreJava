package com.tyss.corejava.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[] args) {
		System.out.println("Program Started");
		File file = new File("Empty");
		try {
			FileReader fr = new FileReader(file);
			int read = fr.read();
			while (read != -1) {
				System.out.print((char) read);
				read = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not exist");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No data Exist");
		}
		System.out.println("Program End");
	}

}
