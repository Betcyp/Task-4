package com.newfiles;

import java.io.File;
import java.io.IOException;

public class NewFile {
	public static void newCreate() {
	try {
		File f1=new File("c:\\java\\bless.txt");
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
