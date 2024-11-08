package com.inetbanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.bytedeco.javacpp.opencv_core.Scalar;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting11 extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	private static ExtentReports extent;
	public static ExtentTest logger;
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	
	public void Onstart(ITestContext testContext)
	{
		String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());  //timestamp
		String repName="Test-Report -"+timeStamp+".html";
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test.output/"+repName);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent=new ExtentReports();
		//ExtentReports extent = new ExtentReports("path/to/report.html", true);
		if (extent != extent)
{
	
	    extent.attachReporter(htmlReporter);
	    extent.setSystemInfo("Host name", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("User", "LP");
}  
	    htmlReporter.config().setDocumentTitle("InetBanking test project");
	    htmlReporter.config().setReportName("Functional test report");
	    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlReporter.config().setTheme(Theme.DARK);
	}
	public void onTestSuccess(ITestResult tr)
	{
//		logger=extent.createTest(tr.getName());
//		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
		test.set(extent.createTest(tr.getName(), tr.getMethod().getMethodName()));
        test.get().log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

	}
	public void onTestFailure(ITestResult tr)
	{
//		logger=extent.createTest(tr.getName());
//		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		test.set(extent.createTest(tr.getName(), tr.getMethod().getMethodName()));
        test.get().log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

		
		String screenshotPath=System.getProperty("user.dir")+ "\\Screenshots\\"+tr.getName()+".png";
		
		File f =new File(screenshotPath);
		
		if(f.exists())
		{
			try {
//				logger.fail("Screenshot is below:"+ logger.addScreenCaptureFromPath(screenshotPath));
                test.get().fail("Screenshot is below:" + test.get().addScreenCaptureFromPath(screenshotPath));

			}catch (IOException e)
			{
				e.printStackTrace();
			}
	}}
	
	
	public void ontestSkipped(ITestResult tr)
	{
//		logger=extent.createTest(tr.getName());
//		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
		test.set(extent.createTest(tr.getName(), tr.getMethod().getMethodName()));
        test.get().log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
//	public void onFinish(ITestContext testContext)
//	{
//		extent.flush();
//	}
	public void onFinish(ITestContext context) {
	    if (this.extent != null) {
	        this.extent.flush();
	    } else {
	        // log a message or throw an exception, depending on your requirements
	        System.out.println("Extent report is null");
	    }
	}

}
