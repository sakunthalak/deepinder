package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	
	
	File file=new File(filePath+"\\"+fileName);
	FileInputStream inputStream=new FileInputStream(file);
	Workbook guru99Workbook=null;
	String fileExtensionName = fileName.substring(fileName.indexOf("."));
	 if(fileExtensionName.equals(".xlsx")){
		 guru99Workbook = new XSSFWorkbook(inputStream);
	 }
	 else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }
	//Read sheet inside the workbook by its name

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();

	    }

	    

	    }

	    

	    //Main function is calling readExcel function to read data from excel file

	    public static void main(String[] args) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    	Excel objExcelFile = new Excel();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir");
System.out.println(filePath);
	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"testData.xlsx","Sheet1");

	    }

	
	
	
		
//		public static String[][] getData(String fileName, String sheetName) throws IOException {
//			File file = new File(fileName);
//			FileInputStream ips = new FileInputStream(file);  //FileOutputStream for writing the data on excel sheet
//			Workbook Wb = new XSSFWorkbook(ips);
//			Sheet Sh = Wb.getSheet(sheetName);
//			int rowNum = Sh.getLastRowNum() + 1;
//			int colNum = Sh.getRow(0).getLastCellNum();
//			String[][] data = new String[rowNum][colNum];
//
//			for (int i = 0; i < rowNum; i++) {
//				Row row = Sh.getRow(i);
//				for (int j = 0; j < colNum; j++) {
//					Cell cell = row.getCell(j);				
//					String value = new DataFormatter().formatCellValue( cell);
//					data[i][j] = value;
//				}
//			}
//			return data;
		}

	
	


