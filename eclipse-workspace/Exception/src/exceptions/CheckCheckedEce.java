package exceptions;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckCheckedEce {
	public static void main(String[] args ) throws IOException {
		//try {
		File f=new File("D:\\Example.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		//}
		//catch(FileNotFoundException fe) {
			//fe.printStackTrace();
		//}
		//System.out.println("not file");
	}

}
