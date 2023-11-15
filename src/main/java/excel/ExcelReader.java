package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String getCellInfo(Sheet sheet, int rowNumber, int colNumber) throws IOException {

		Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(colNumber);

        DataFormatter dataFormatter = new DataFormatter();
		return dataFormatter.formatCellValue(cell);

	}



	public void getExcelInfo(String excelName, String sheetName) throws IOException {

		File excelfile = new File("E:\\result\\" + excelName + ".xlsx");

		FileInputStream fis = new FileInputStream(excelfile);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName); // Changed getSheetAt to getSheet in order to use String
		/// For loop
		int rows = sheet.getLastRowNum();
		int cols = 0;
		String cellContent = "";
		System.out.println("");
		for(int r=0;r<=rows;r++)
		{
			cols = sheet.getRow(rows).getLastCellNum();
			for(int c=0;c<=cols;c++){
				cellContent = getCellInfo(sheet, r, c);
				System.out.print(cellContent);
				System.out.print( " | " );
			}
			System.out.println("");
		}


	}
}


