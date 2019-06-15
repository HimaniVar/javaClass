package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AssgFile1 {
	public static void main(String[] args) throws IOException {
		int linenumber;
		
		System.out.println("Enter Line Number");
		Scanner sc=new Scanner(System.in);
		linenumber=sc.nextInt();
		readLine(linenumber);
		
	}
	
	public static void readLine(int linenumber) throws IOException
	{
		String myline = null;
		File f=new File("C:\\Himani\\classS\\inputfile.txt");
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader bf=new BufferedReader(fr);
			String s;
			
			for(int i=0;i<linenumber;++i)
			{
				 myline=bf.readLine();
				
			}
			System.out.println(myline);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
