package com.inetbanking.utilities;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting {
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeSuite
    public void setupExtentReport() {
        extent = new ExtentReports();
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
  //      extent.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void setupTestMethod() {
        test = extent.createTest(getCurrentMethodName());
    }

    @AfterMethod
    public void tearDownTestMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test failed: " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test skipped: " + result.getThrowable());
        } else {
            test.log(Status.PASS, "Test passed");
        }
    }

    @AfterSuite
    public void tearDownExtentReport() {
        extent.flush();
    }

    private String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}