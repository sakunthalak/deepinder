package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
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

		        System.out.println();}

		    }

	
		    
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		ReadExcel objExcelFile = new ReadExcel();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src\\selenium";;
	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"\\testData.xlsx","excelguru");


	}

}
