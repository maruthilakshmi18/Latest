package basic;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelList {

	public static void main(String[] args) throws Exception {
	File file=new File("C:\\Excel\\ExcelData.xlsx");
//	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet=wb.createSheet("WriteData");
	
	List<Row> rowList = getDBData();
	
	
	int lastRowNum = rowList.size();
	System.out.println(lastRowNum);
	
	
	
	for(int i=0; i<lastRowNum;i++) {
		XSSFRow row = sheet.createRow(i);
		System.out.println("row " + row);
		Row dbrow = rowList.get(i);
		List<Cell> dbcelllist = dbrow.getCellList();
		int lastCellNum = dbcelllist.size();
		
	
		System.out.print("row data ");
		for(int j=0;j<lastCellNum ; j++) {
			row.createCell(j).setCellValue(dbcelllist.get(j).getValue());
			
	
	
	
		}
		}
	
	
//	sheet.createRow(0).createCell(0).setCellValue("Pass");
//	sheet.createRow(1).createCell(0).setCellValue("Fail");
	
//	fis.close();
	FileOutputStream fout=new FileOutputStream(file);
	wb.write(fout);
	wb.close();
	
}


	private static List<Row> getDBData() {
		Row row1 = new Row();
		List<Cell> cellList = row1.getCellList();
		
		Cell cell1 = new Cell();
		cell1.setValue("pass");
		Cell cell2 = new Cell();
		cell2.setValue("pass");
		
		cellList.add(cell2);
		cellList.add(cell1);
		
		Row row2 = new Row();
		List<Cell> cellList1 = row2.getCellList();
		Cell cell3 = new Cell();
		cell3.setValue("pass");
		Cell cell4 = new Cell();
		cell4.setValue("pass");
		
		cellList1.add(cell3);
		cellList1.add(cell4);
		
		List<Row> rowList = new ArrayList<>();
		rowList.add(row1);
		rowList.add(row2);
		return rowList;
	}
}

