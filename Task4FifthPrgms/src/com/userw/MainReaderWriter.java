package com.userw;
import java.io.IOException;
import java.util.Scanner;

import com.writeread.ReaderWriter;

public class MainReaderWriter {
	public static void main(String[] args) throws IOException
    {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string: ");
	    String str=sc.nextLine();
	    sc.close();
	    ReaderWriter objt=new ReaderWriter();
	    objt.writerFile(str);
	    objt.readerFile();
    }
}