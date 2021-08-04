package com.writeread;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class ReaderWriter {

	    public void writerFile(String str) throws IOException {
	  
	        // attach a file to FileWriter 
	        FileWriter fw=new FileWriter("c:\\java\\next1.txt");
	  
	        // read character wise from string and write 
	        // into FileWriter 
	        for (int i = 0; i < str.length(); i++)
	            fw.write(str.charAt(i));
	  
	        System.out.println("Writing successful");
	        //close the file 
	        fw.close();
	    }
	    public void readerFile() throws IOException {  
	        int character;
	        FileReader fr=null;
	        try
	        {
	           fr = new FileReader("c:\\java\\next1.txt");
	          
	        }
	        catch (FileNotFoundException fe)
	        {
	            System.out.println("File not found");
	        }
	        while ((character=fr.read())!=-1)
	           System.out.print((char)character);
	        fr.close();
	    }
}

	
