package com.output;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class OutputStre {
	public static void streamOutput(String str) {
			try {
	            OutputStream out = new FileOutputStream("c:\\java\\outputfile.txt");
	            byte[] Bytes = str.getBytes();
	            out.write(Bytes);
	            System.out.println("Data is written to the file.");
	            out.close();
	        }

	        catch (Exception e) {
	            e.getStackTrace();
	        }
	    }
}
