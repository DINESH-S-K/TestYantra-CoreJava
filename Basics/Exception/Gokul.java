package com.tyss.corejava.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gokul {
	public String task(File file) throws IOException,FileNotFoundException{
		String s ="";
		FileReader fileReader = new FileReader(file);
		int read = fileReader.read();
		while (read != -1) {
			s = s + ((char) read); 
			read = fileReader.read();
		}
		return s;
	}

}
