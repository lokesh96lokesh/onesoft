package sample.sample;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UseExcel {
	public static void main(String[] args) {
		ArrayList<Excel> p=new ArrayList<>();
		p.add(new Excel("loki",26,"jaya"));
		p.add(new Excel("dheena",28,"dg"));
		p.add(new Excel("surya",22,"mgr"));
		p.add(new Excel("anu",22,"valliamai"));
		p.add(new Excel("uma",23,"queens"));
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("student");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Name");
		header.createCell(1).setCellValue("Age");
		header.createCell(2).setCellValue("college");
		
		int a = 1;
		
		for(int i=0;i<p.size();i++) {
			Row head = sheet.createRow(a++);
			Excel e = p.get(i);
			head.createCell(0).setCellValue(e.getName());
			head.createCell(1).setCellValue(e.getAge());
			head.createCell(2).setCellValue(e.getCollege());
			
		}
		
		try {
			OutputStream fileOut = new FileOutputStream("C:\\Excel\\workbook.xls");
			 wb.write(fileOut);
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("File saved :-)  go -> and see in folder ");

		
	}
}
