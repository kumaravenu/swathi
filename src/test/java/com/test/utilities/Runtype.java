package com.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runtype {

	FileInputStream f;
	XSSFWorkbook w;
	XSSFSheet s;
	String fileName = "C:\\Users\\Snath\\TestData.xlsx";
	String run;

	public String get_Testcase_Run(String Testcasename) throws IOException {
		f = new FileInputStream(fileName);

		w = new XSSFWorkbook(f);
		s = w.getSheet("Legend");
		int r = s.getLastRowNum();

		//System.out.println("Number of TestCases to run " + r);
		for (int i = 1; i <= r; i++) {

			if (s.getRow(i).getCell(0).getStringCellValue().equals(Testcasename)) {
				run = s.getRow(i).getCell(1).getStringCellValue();

			}
			;

		}

		return run;
	}
}
