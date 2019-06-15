package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AssgFile3 {

	public static void main(String[] args) throws IOException {
		int initialLinenumber,maxLinenumber;
		
		System.out.println("Enter initialLinenumber Number");
		Scanner sc=new Scanner(System.in);
		initialLinenumber=sc.nextInt();
		System.out.println("Enter maxLinenumber Number");
		maxLinenumber=sc.nextInt();
		readLine(initialLinenumber,maxLinenumber);
		
	}
	
	public static void readLine(int initialLinenumber,int maxLinenumber) throws IOException
	{
		
		File f=new File("C:\\Himani\\classS\\inputfile.txt");
		FileReader fr;
		int count=0;
		String s;
		try {
			fr = new FileReader(f);
			BufferedReader bf=new BufferedReader(fr);
			
			
			while(bf.readLine()!=null )
			{ count++;
				
				if(count>initialLinenumber&&count<=maxLinenumber)
				{
				 System.out.println(bf.readLine());
				}
				
			}
			bf.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
