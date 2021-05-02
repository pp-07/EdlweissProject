package Testcase;

import org.testng.annotations.Test;

import Pages.Excel_Utility;
import Pages.Application_Page;
import Pages.TestBase;

import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class Application_Test extends TestBase {
	Application_Page obj = new Application_Page(driver);

	@BeforeClass
	public void beforeclass() {
		initialization();

	}

	@DataProvider(name = "Cycle1")
	public Object[][] getData1() throws IOException {

		Excel_Utility util = new Excel_Utility(prop.getProperty("datapath"));
		int totalrows = util.getRowCount(prop.getProperty("Sender1SheetName"));
		int totalcols = util.getCellCount(prop.getProperty("Sender1SheetName"), 1);
		Object arr1[][] = new Object[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				arr1[i - 1][j] = util.getCellData(prop.getProperty("Sender1SheetName"), i, j);
			}
		}
		return arr1;
	}

	@DataProvider(name = "Cycle2")
	public Object[][] getData2() throws IOException {

		Excel_Utility util = new Excel_Utility(prop.getProperty("datapath"));
		int totalrows = util.getRowCount(prop.getProperty("Sender2SheetName"));
		int totalcols = util.getCellCount(prop.getProperty("Sender2SheetName"), 1);
		Object arr2[][] = new Object[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				arr2[i - 1][j] = util.getCellData(prop.getProperty("Sender2SheetName"), i, j);
			}
		}
		return arr2;
	}

	@DataProvider(name = "Cycle3")
	public Object[][] getData3() throws IOException {

		Excel_Utility util = new Excel_Utility(prop.getProperty("datapath"));
		int totalrows = util.getRowCount(prop.getProperty("Sender3SheetName"));
		int totalcols = util.getCellCount(prop.getProperty("Sender3SheetName"), 1);
		Object arr3[][] = new Object[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				arr3[i - 1][j] = util.getCellData(prop.getProperty("Sender3SheetName"), i, j);
			}
		}
		return arr3;
	}

	@DataProvider(name = "Cycle4")
	public Object[][] getData4() throws IOException {

		Excel_Utility util = new Excel_Utility(prop.getProperty("datapath"));
		int totalrows = util.getRowCount(prop.getProperty("Sender4SheetName"));
		int totalcols = util.getCellCount(prop.getProperty("Sender4SheetName"), 1);
		Object arr4[][] = new Object[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				arr4[i - 1][j] = util.getCellData(prop.getProperty("Sender4SheetName"), i, j);
			}
		}
		return arr4;
	}

	@DataProvider(name = "Cycle5")
	public Object[][] getData5() throws IOException {

		Excel_Utility util = new Excel_Utility(prop.getProperty("datapath"));
		int totalrows = util.getRowCount(prop.getProperty("Sender5SheetName"));
		int totalcols = util.getCellCount(prop.getProperty("Sender5SheetName"), 1);
		Object arr5[][] = new Object[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				arr5[i - 1][j] = util.getCellData(prop.getProperty("Sender5SheetName"), i, j);
			}
		}
		return arr5;
	}

	@Test(dataProvider = "Cycle1")
	public void testa(String Loginid, String password, String sender, String receiver, String subject, String message)
			throws InterruptedException, IOException {
		Application_Page obj = new Application_Page(driver);
		obj.mailtest(Loginid, password, sender, receiver, subject, message);
	}

	@Test(dataProvider = "Cycle2")
	public void testb(String Loginid, String password, String sender, String receiver, String subject, String message)
			throws InterruptedException, IOException {

		obj.mailtest(Loginid, password, sender, receiver, subject, message);
	}

	@Test(dataProvider = "Cycle3")
	public void testc(String Loginid, String password, String sender, String receiver, String subject, String message)
			throws InterruptedException, IOException {

		obj.mailtest(Loginid, password, sender, receiver, subject, message);
	}

	@Test(dataProvider = "Cycle4")
	public void testd(String Loginid, String password, String sender, String receiver, String subject, String message)
			throws InterruptedException, IOException {

		obj.mailtest(Loginid, password, sender, receiver, subject, message);
	}

	@Test(dataProvider = "Cycle5")
	public void teste(String Loginid, String password, String sender, String receiver, String subject, String message)
			throws InterruptedException, IOException {

		obj.mailtest(Loginid, password, sender, receiver, subject, message);
	}

	@AfterClass
	public void teardown() {

		driver.close();

	}

}
