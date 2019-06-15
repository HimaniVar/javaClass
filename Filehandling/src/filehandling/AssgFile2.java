package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class AssgFile2 extends MAssg {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Line number count you want to enter ");
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
		AssgFile2 obj=new AssgFile2();
		obj.writeLine(count);
	}
}

class MAssg {
	public void writeLine(int linecount) throws IOException
	{
		String s = null;
		System.out.println("Enter your line Pls");
		File f=new File("C:\\Himani\\classS\\outputfile.txt");
		FileWriter fwriter=new FileWriter(f,true);
		BufferedWriter bf=new BufferedWriter(fwriter);
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<linecount;++i)
		{
		 s=sc.nextLine();
		 bf.write(s);
		 bf.newLine();
			
		}
	bf.close();
		
		
	}
	
}



