package basicsexceptional;

import java.io.File;
import java.io.FileReader;

public class Ex5 {
	public static void main(String[] args)throws Exception {
		File f1=new File("C:\\Users\\USER\\Desktop\\Text.txt");
		FileReader fr=new FileReader(f1);
		
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}		
	}
}
