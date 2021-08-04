package com.usersrename;

import com.filesin.RenameFile;

public class RenameMain {
	public static void main(String[] args) {
		String oldFileName=args[0];
		RenameFile re=new RenameFile();
		re.fileRename(oldFileName);
		re.fileDelete();
	}
}
