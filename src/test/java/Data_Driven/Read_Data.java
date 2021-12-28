package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void read_particular_data() throws Throwable {

		File f= new File("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\Test1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet1= book.getSheetAt(0);
		
		Row r = sheet1.getRow(4);
		
		Cell c = r.getCell(0);
		
		Cell c1=r.getCell(2);
		
		CellType ct = c.getCellType();
		
		CellType ct1= c1.getCellType();
		
		System.out.println("Read Particular Data:");
		System.out.println();
		
		if(ct.equals(CellType.STRING)) {
			
			String cvalue = c.getStringCellValue();
			System.out.println("String Value: "+cvalue);
		}
		else if(ct.equals(CellType.NUMERIC)) {
			
			double cellvalue = c.getNumericCellValue();
			
			int cvalue = (int) cellvalue;
			
			System.out.println("Numeric Value: "+cvalue);
		}
		
	if(ct1.equals(CellType.STRING)) {
			
			String cvalue = c1.getStringCellValue();
			System.out.println("String Value: "+cvalue);
		}
		else if(ct1.equals(CellType.NUMERIC)) {
			
			double cellvalue = c1.getNumericCellValue();
			
			int cvalue = (int) cellvalue;
			
			System.out.println("Numeric Value: "+cvalue);
		}
	System.out.println();
	System.out.println("________________________________________________________");
			
	}
	public static void read_all() throws Throwable {


        File f= new File("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\Test1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet1= book.getSheetAt(0);
		
		int numrows = sheet1.getPhysicalNumberOfRows();
		System.out.println();
		System.out.println("Read all Data:  ");
		System.out.println();
		
		for (int i=0; i<numrows; i++) {
			
			Row r = sheet1.getRow(i);
			
			int numcells = r.getPhysicalNumberOfCells();
			
			for(int j=0;j<numcells;j++) {
				
				Cell c= r.getCell(j);
				
				CellType ct = c.getCellType();
				
				if(ct.equals(CellType.STRING)) {
					
					String cvalue = c.getStringCellValue();
					System.out.println("String Value: "+cvalue);
				}
				else if(ct.equals(CellType.NUMERIC)) {
					
					double cellvalue = c.getNumericCellValue();
					
					int cvalue = (int) cellvalue;
					
					System.out.println("Numeric Value: "+cvalue);
				}
			}
		}  
		
	}
	public static void main(String[] args) throws Throwable {
		
		read_particular_data();
		read_all();
	}
}
