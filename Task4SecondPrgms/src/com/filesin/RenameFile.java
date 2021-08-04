package com.filesin;

import java.io.File;
import java.io.IOException;
public class RenameFile {
	public static void fileRename(String oldFileName) {
		File oldFile=new File(oldFileName);
		File newFile=new File("c:\\java\\new.txt");
		if(oldFile.exists()) {
			if(oldFile.renameTo(newFile)) {
				System.out.println(oldFile.getName()+" renamed to "+newFile.getName());
			}
			else {
				System.out.println("oldfile was not renamed:");
			}		
		}
		else {
				System.out.println("File doesn't exist");
		}
	}
	public static void fileDelete() {
		File newFile=new File("c:\\java\\new.txt");
		if(newFile.delete()) {
			System.out.println(newFile+" got deleted");
		}
		else {
			System.out.println("Not deleted");
		}
	}
}
