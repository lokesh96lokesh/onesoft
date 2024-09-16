package javaSample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckFile {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\Documents\\assasa.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1){
		System.out.println((char)(temp));
		}
	}

}
