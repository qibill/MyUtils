package com.biosan.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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
	public static boolean checkExcelVaild(File file) {
		if (!file.exists()) {
			logger.error("文件不存在");
			return false;
		}
		if (!(file.isFile()
				&& (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
			logger.error("文件不是Excel");
			return false;
		}
		return true;
	}

	private static Object getValue(Cell cell) {
		if (cell == null) {
			return null;
		}
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case ERROR:
			return cell.getErrorCellValue();
		case _NONE:
			break;
		case NUMERIC:
			cell.setCellType(CellType.STRING);
			return cell.getStringCellValue();
		case STRING:
			return cell.getStringCellValue();
		case FORMULA:
			break;
		case BLANK:
			return null;
		default:
			break;
		}
		return null;
	}

	/**
	 * 读取Excel测试
	 */
	public static List<Map<String, Object>> readExcel(String pathname, String[] headName,
			Integer startRowNum, Integer endRowNum) {
		List<Map<String, Object>> list = new ArrayList<>();

		File file = new File(pathname); // 创建文件对象
		if (!checkExcelVaild(file)) {
			return list;
		}
		try {
			Workbook workbook = WorkbookFactory.create(file);

			logger.debug("此Excel文件有=====" + workbook.getNumberOfSheets() + "=====页");
			// 设置当前excel中sheet的下标：0开始
			Sheet sheet = workbook.getSheetAt(0); // 遍历第一个Sheet

			// 获取总行数
			int lastRowNum = sheet.getLastRowNum();
			logger.debug("此页有=====" + lastRowNum + "=====行");

			if (lastRowNum < startRowNum) {
				return list;
			}

			if (endRowNum == null) {
				endRowNum = lastRowNum;
			}else {
				endRowNum = lastRowNum < endRowNum ? lastRowNum : endRowNum;
			}
			for (int i = startRowNum; i < endRowNum + 1; i++) {
				Map<String, Object> map = new HashMap<>();
				Row row = sheet.getRow(i);
               
				if (row.getPhysicalNumberOfCells() == 0) {
					continue;
				}
				
				int endCellNum = row.getLastCellNum();
				endCellNum = endCellNum < headName.length ? endCellNum : headName.length;
				for (int j = 0; j < endCellNum; j++) {
					Cell cell = row.getCell(j);
					map.put(headName[j], getValue(cell));
				}
				list.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
		return list;
	}

	public static List<Map<String, Object>> readExcel(String pathname, String[] headName,
			Integer startRowNum) {
		return readExcel(pathname, headName, startRowNum, null);
	} 
}
