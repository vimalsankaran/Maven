package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	
	public static void writedata() throws Throwable {

	File f= new File("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\Test1.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	
	book.createSheet("Data").createRow(0).createCell(0).setCellValue("Emp ID");
	book.getSheet("Data").getRow(0).createCell(1).setCellValue("Name");
	double num = 101;
	for(int i=1;i<=4;i++) {
		book.getSheet("Data").createRow(i).createCell(0).setCellValue(num);
		num=num+1;
		}
	book.getSheet("Data").getRow(1).createCell(1).setCellValue("Vimal");
	book.getSheet("Data").getRow(2).createCell(1).setCellValue("Vivek");
	book.getSheet("Data").getRow(3).createCell(1).setCellValue("Anand");
	book.getSheet("Data").getRow(4).createCell(1).setCellValue("Jeeva");
	
	FileOutputStream fos = new FileOutputStream(f);
	
	book.write(fos);
	book.close();
	
	System.out.println("Data Write Successfully Completed");
	
	}
	public static void main(String[] args) throws Throwable {
		writedata();
	}
}
