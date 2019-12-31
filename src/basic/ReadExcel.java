package basic;

import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadExcel {
		public static void main(String[] args) throws Exception {
			File file = new File("C:\\Excel\\ExcelData.xlsx");
			FileInputStream fs = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			int lastRowNum = sheet.getLastRowNum();
			
			for(int i=0; i<=lastRowNum;i++) {
				XSSFRow row = sheet.getRow(i);
				short lastCellNum = row.getLastCellNum();
				System.out.print("row data ");
				for(int j=0;j<lastCellNum ; j++) {
					System.out.print(row.getCell(j));
					System.out.print("  ");
				}
				System.out.println("");
			}
			
			
		}

	}

