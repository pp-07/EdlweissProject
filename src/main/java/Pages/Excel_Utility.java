package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
 FileInputStream fi;
 FileOutputStream fo;
 XSSFWorkbook workbook;
 XSSFSheet sheet;
 XSSFRow row;
 XSSFCell cell;
 CellStyle style ;
 String path;
 
 public Excel_Utility(String path){
	 this.path=path;
 }
 
public int getRowCount(String sheetname) throws IOException {
	fi= new FileInputStream(path);
	workbook = new XSSFWorkbook (fi);
	sheet =workbook.getSheet(sheetname);
	
	int rowcount =sheet.getLastRowNum();
	
	workbook.close();
	fi.close();
	return rowcount;

	}
 
public int getCellCount(String sheetname,int rownum) throws IOException {
	fi= new FileInputStream(path);
	workbook = new XSSFWorkbook (fi);
	sheet =workbook.getSheet(sheetname);
	
	row =sheet.getRow(rownum);
	int cellcount =row.getLastCellNum();
	
	workbook.close();
	fi.close();
	return cellcount;
	
} 
 
 public String getCellData(String sheetname,int rownum,int colnum) throws IOException {
	    fi= new FileInputStream(path);
		workbook = new XSSFWorkbook (fi);
		sheet =workbook.getSheet(sheetname);
		row =sheet.getRow(rownum);
		
		cell=row.getCell(colnum);
		DataFormatter formatter =new DataFormatter();
		String data;
		data = formatter.formatCellValue(cell);
		
		workbook.close();
		fi.close();
		return data;
	 
 }




}
