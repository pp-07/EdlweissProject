package Testcase;

import org.testng.TestNG;

import ExtentReport.Report;

public class TestRunner {
	static TestNG testng;
	public static void main(String[] args) {
		

	testng = new  TestNG();
	testng.setTestClasses(new Class[] {Application_Test.class});
 
    testng.run();
	}

}
