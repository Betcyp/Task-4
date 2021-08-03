package com.directories;
import java.io.File;

public class CreateDirectory {
		public static void directory() {
		File dir=new File("c:\\Directory");
		if(!dir.exists()) {
			if(dir.mkdir()) {
				System.out.println("Directory got created");
			}
			else {
				System.out.println("directory not created");
			}
		}
	}
}
