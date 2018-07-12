package com.biosan.utils;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Description: Excel操作
 * 
 * @author qibill
 */
public class ExcelUtil {

	private static final Logger logger = Logger.getLogger(ExcelUtil.class);

	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";

	/**
	 * 判断文件是否是excel
	 * 
	 * @throws Exception
	 */
	public static void checkExcelVaild(File file) throws Exception {
		if (!file.exists()) {
			throw new Exception("文件不存在");
		}
		if (!(file.isFile()
				&& (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
			throw new Exception("文件不是Excel");
		}
	}

	private static Object getValue(Cell cell) {
		Object obj = null;
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			obj = cell.getBooleanCellValue();
			break;
		case ERROR:
			obj = cell.getErrorCellValue();
			break;
		case NUMERIC:
			obj = cell.getNumericCellValue();
			break;
		case STRING:
			obj = cell.getStringCellValue();
			break;
		default:
			break;
		}
		return obj;
	}

	public static <T> Map<String, List<? extends T>> readExcel(String path, Class clzz) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<T> list = new LinkedList<T>();
		Map<String, List<? extends T>> map = new HashMap<String, List<? extends T>>();
		File file = new File(path);
		FileInputStream fis = null;
		Workbook workBook = null;
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				workBook = WorkbookFactory.create(fis);
				int numberOfSheets = workBook.getNumberOfSheets();
				for (int s = 0; s < numberOfSheets; s++) { // sheet工作表
					Sheet sheetAt = workBook.getSheetAt(s);
					String sheetName = sheetAt.getSheetName(); // 获取工作表名称
					int rowsOfSheet = sheetAt.getPhysicalNumberOfRows(); // 获取当前Sheet的总列数
					System.out.println("当前表格的总行数:" + rowsOfSheet);
					for (int r = 0; r < rowsOfSheet; r++) { // 总行
						Row row = sheetAt.getRow(r);
						if (row == null) {
							continue;
						} else {
							int rowNum = row.getRowNum();
							System.out.println("当前行:" + rowNum);
							int numberOfCells = row.getPhysicalNumberOfCells();
							for (int c = 0; c < numberOfCells; c++) { // 总列(格)
								Cell cell = row.getCell(c);
								
								if (cell == null) {
									continue;
								}
								
								int cellType = cell.getCellType();
								switch (cellType) {
								case Cell.CELL_TYPE_STRING: // 代表文本
									String stringCellValue = cell.getStringCellValue();
									System.out.print(stringCellValue + "\t");
									break;
								case Cell.CELL_TYPE_BLANK: // 空白格
									String stringCellBlankValue = cell.getStringCellValue();
									System.out.print(stringCellBlankValue + "\t");
									break;
								case Cell.CELL_TYPE_BOOLEAN: // 布尔型
									boolean booleanCellValue = cell.getBooleanCellValue();
									System.out.print(booleanCellValue + "\t");
									break;
								case Cell.CELL_TYPE_NUMERIC: // 数字||日期
									boolean cellDateFormatted = DateUtil.isCellDateFormatted(cell);
									if (cellDateFormatted) {
										Date dateCellValue = cell.getDateCellValue();
										System.out.print(sdf.format(dateCellValue) + "\t");
									} else {
										double numericCellValue = cell.getNumericCellValue();
										System.out.print(numericCellValue + "\t");
									}
									break;
								case Cell.CELL_TYPE_ERROR: // 错误
									byte errorCellValue = cell.getErrorCellValue();
									System.out.print(errorCellValue + "\t");
									break;
								case Cell.CELL_TYPE_FORMULA: // 公式
									int cachedFormulaResultType = cell.getCachedFormulaResultType();
									System.out.print(cachedFormulaResultType + "\t");
									break;

								}
							}
							System.out.println(" \t ");
						}
						System.out.println("");
					}
				}
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件不存在!");
		}
		return map;
	}

	/**
	 * 读取Excel测试，兼容 Excel 2003/2007/2010
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String pathname = "D:/uploaddata/123.xlsx";
		try {
			// 同时支持Excel 2003、2007
			File excelFile = new File(pathname); // 创建文件对象
			Workbook workbook = WorkbookFactory.create(excelFile);
			// Workbook workbook = WorkbookFactory.create(is); // 这种方式
			// Excel2003/2007/2010都是可以处理的

			int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
			logger.debug("此Excel文件有=====" + sheetCount + "=====页");
			/**
			 * 设置当前excel中sheet的下标：0开始
			 */
			Sheet sheet = workbook.getSheetAt(0); // 遍历第一个Sheet

			// 获取总行数
			logger.debug("此页有=====" + sheet.getLastRowNum() + "=====行");

			// 为跳过第一行目录设置count
			int count = 0;
			for (Row row : sheet) {
				try {
					// 跳过第一和第二行的目录
					if (count < 2) {
						count++;
						continue;
					}

					// 如果当前行没有数据，跳出循环
					if (row.getCell(0).toString().equals("")) {
						return;
					}

					// 获取总列数(空格的不计算)
					int columnTotalNum = row.getPhysicalNumberOfCells();
					System.out.println("总列数：" + columnTotalNum);

					System.out.println("最大列数：" + row.getLastCellNum());

					// for循环的，不扫描空格的列
					// for (Cell cell : row) {
					// System.out.println(cell);
					// }
					int end = row.getLastCellNum();
					for (int i = 0; i < end; i++) {
						Cell cell = row.getCell(i);
						if (cell == null) {
							System.out.print("null" + "\t");
							continue;
						}

						Object obj = getValue(cell);
						System.out.print(obj + "\t");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
