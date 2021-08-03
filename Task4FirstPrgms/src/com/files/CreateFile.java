package com.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void createNewFile() {
	try {
		File f1=new File("c:\\java\\msf.txt");
		if(f1.createNewFile()) {
			System.out.println("File is created: "+f1.getName());
		}
		else {
			System.out.println("File already exists: ");
		}
	}
	catch(IOException e){
		System.out.println("An error is occured:");
			e.printStackTrace();
		}
	}
}
