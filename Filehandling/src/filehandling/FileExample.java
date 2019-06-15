package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Himani\\classS\\inputfile.txt");
		try {
			FileReader fr=new FileReader(file);
			/* character by character  
			 * int a = 0;
			while((a=fr.read())!=-1)
			{
				System.out.print((char)a);
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}*/
			BufferedReader bf=new BufferedReader(fr);
			String s;
			while((s=bf.readLine()) != null)
			{
				System.out.println(s);
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println("fille");
		}
			
			
			
	}

}
