package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static int totalRow;

	public List<Map<String, String>> getData(String ExcelFilePath, String Sheetname)
			throws EncryptedDocumentException, IOException {
		// Workbook workbook = WorkbookFactory.create(new File(ExcelFilePath));
		Sheet sheet = getSheetByName(ExcelFilePath, Sheetname);
		return readsheet(sheet);
	}

	private Sheet getSheetByName(String excelFilePath, String sheetname)
			throws EncryptedDocumentException, IOException {
		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetname);
		return sheet;
	}

	private Workbook getWorkBook(String excelFilePath) throws EncryptedDocumentException, IOException {
		return WorkbookFactory.create(new File(excelFilePath));
	}

	public List<Map<String, String>> getData(String ExcelFilePath, int SheetNumber)
			throws EncryptedDocumentException, IOException {
		Sheet sheet = getSheetByIndex(ExcelFilePath, SheetNumber);
		return readsheet(sheet);

	}

	private Sheet getSheetByIndex(String excelFilePath, int sheetNumber)
			throws EncryptedDocumentException, IOException {
		Sheet sheet = getWorkBook(excelFilePath).getSheetAt(sheetNumber);
		return sheet;
	}

	private List<Map<String, String>> readsheet(Sheet sheet) {
		Row row;
		Cell cell;

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
			row = sheet.getRow(currentRow);
			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
				cell = row.getCell(currentColumn);
				String ColumnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();
				columnMapdata.put(ColumnHeaderName, cell.getStringCellValue());
			}
			excelRows.add(columnMapdata);
		}
		return excelRows;
	}

	public int countRow() {
		return totalRow;
	}
//	String Filepath = "/DSAlgo_Project/src/test/resources/Properties/ExcelData.xlsx";
//	FileInputStream fis =  new FileInputStream(Filepath);
//	public List<Map<String, String>> getData (String Filepath, String Sheetname) throws Exception, IOException{
//		XSSFSheet sheet = getSheetByName(Filepath, Sheetname);
//		return readsheet(sheet);
//	}
//	
//	public List<Map<String, String>> getData(String Filepath, int Sheetnumber) {
//		Sheet sheet = getSheetByIndex(Filepath,Sheetnumber);
//		return readsheet(sheet);
//	}
//
//	private Sheet getSheetByIndex(String filepath, int sheetnumber) {
//		XSSFSheet sheet = getWorkBook(filepath).getsheetAt(sheetnumber);
//		return sheet;
//	}
//
//	private XSSFSheet getSheetByName(String filepath, String sheetname) {
//		XSSFSheet sheet = getWorkBook(filepath);
//		return sheet;
//	}
//	
//
//	private List<Map<String, String>> readsheet(Sheet sheet) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	private XSSFSheet getWorkBook(String filepath) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
