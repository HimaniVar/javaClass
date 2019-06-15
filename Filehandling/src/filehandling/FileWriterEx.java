package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {
		File f=new File("C:\\Himani\\classS\\outputfile.txt");
		try {
			/* no next line concept
			 * FileWriter fw=new FileWriter(f);
			
			fw.write("himani");
			
			fw.write("varshney");
			fw.close();*/
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("himani");
			bw.newLine();
			bw.write("var");
			fw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
			
	}
	
	

}
