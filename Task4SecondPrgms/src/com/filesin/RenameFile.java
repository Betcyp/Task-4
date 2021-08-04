package com.filesin;

import java.io.File;
import java.io.IOException;
public class RenameFile {
	public void newCreate() {
		try {
			File f1=new File("c:\\java\\blessy.txt");
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

	public void fileRename(String oldFileName) {
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
	public void fileDelete() {
		File newFile=new File("c:\\java\\new.txt");
		if(newFile.delete()) {
			System.out.println(newFile+" got deleted");
		}
		else {
			System.out.println("Not deleted");
		}
	}
}
