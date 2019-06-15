package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class AssgFile4 {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Himani\\classS\\inputfile.txt");
		FileReader fr=new  FileReader(f);
		BufferedReader bf= new BufferedReader(fr);
		File fo =new File("C:\\Himani\\classS\\inputoutfile.txt");
		FileWriter fw= new FileWriter(fo,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s;
		while((s=bf.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
		
	}


}
