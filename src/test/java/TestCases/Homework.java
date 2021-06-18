package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.pageobjects.Base;
import com.test.utilities.Runtype;
import com.test.utilities.Testcase_Runtype;

public class Homework extends Base {

	@Test(dataProvider = "data", priority = 1)
	public void Names(HashMap<String, String> hm) {
		System.out.println(hm.get("FirstName") + " " + hm.get("LastName"));

	}

	@Test(dataProvider = "data", priority = 2)
	public void DOB(HashMap<String, String> hm) {
		System.out.println(hm.get("LastName") + " " + hm.get("BirthMonth"));
	}

	@DataProvider(name = "data")
	public Object[][] readData(Method M) throws IOException {

		String file = "target/TestData.xlsx";

		String testName = M.getName();

		Runtype run = new Runtype();
		String runmode = run.get_Testcase_Run(testName);
		System.out.println("Reading data from " + testName + "::::" + "Run_mode " + runmode);
		FileInputStream f = new FileInputStream(file);
		XSSFWorkbook w = new XSSFWorkbook(f);
		// if (runmode == "Yes"){
		XSSFSheet s = w.getSheet(testName);
		// }
		// else System.exit(0);

		int r = s.getLastRowNum();

		Object[][] obj = new Object[r][1];
		HashMap<String, String> H = null;
		for (int i = 0; i < r; i++) {
			// if (runmode == "Yes")
			H = new HashMap<String, String>();
			for (int j = 0; j < s.getRow(i).getLastCellNum(); j++) {
				// System.out.println(s.getRow(0).getCell(j).getStringCellValue() + " "
				// + s.getRow(i + 1).getCell(j).getStringCellValue());
				H.put(s.getRow(0).getCell(j).getStringCellValue(), s.getRow(i + 1).getCell(j).getStringCellValue());

			}
			obj[i][0] = H;
		}
		return obj;

	}

}