package com.usersout;
import java.util.Scanner;

import com.output.OutputStre;
public class OutputMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string: ");
	    String str=sc.nextLine();
	    sc.close();
		OutputStre ob=new OutputStre();
		ob.streamOutput(str);
	}
}
