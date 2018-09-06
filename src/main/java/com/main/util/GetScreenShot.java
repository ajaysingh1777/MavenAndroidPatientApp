package com.main.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.patientApp.Base.*;



public class GetScreenShot extends TestBase{
	
	public static boolean CaptureScreenShot(String screenShotName)
	{
/*	
	System.out.println("Inside GetScreenShot");
	
	SimpleDateFormat sdf =new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	Date date = new Date();
	String filename = sdf.format(date);
	System.out.println("Step 1");
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println("Step 2");
	String Dest = System.getProperty("user.dir")+"/Snapshots/" +screenShotName + filename + ".png";
	System.out.println("Step 3");
	File Destination = new File(Dest);
	System.out.println("Step 4");
		try {
			FileUtils.copyFile(scrFile,Destination);
			System.out.println("Step 5");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Step 6");
		}
	//	FileUtils.copyFile(scrFile,new File("C:\\Users\\DocsApp\\eclipse-workspace\\MavenAndroidPatientAppProject\\Snapshot\\"+screenShotName+filename+".jpg"));
		
	System.out.println("ScreenShot  Captured");
*/	
	//THIS IS FOR THE AWS MOBILE FARM
		 {	
			SimpleDateFormat sdf =new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			Date date = new Date();
			String filename = sdf.format(date);
		    String screenshotDirectory = System.getenv("WORKING_DIRECTORY");
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", screenShotName+filename)));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
