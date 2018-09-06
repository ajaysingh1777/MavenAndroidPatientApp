package com.patientApp.Base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
	
	@BeforeMethod
//	@Parameters({"platform","udid","systemPort"})
//  public void setup(String platform, String udid, String systemPort) throws Exception {
	
	public void setup() throws Exception {	
//	String[] platformInfo = platform.split(" ");
//	System.out.println(platformInfo);
			
	DesiredCapabilities capabilities= DesiredCapabilities.android();	
//	capabilities.setCapability("full-reset", "False");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
	capabilities.setCapability("device","Android");
	capabilities.setCapability("skipUnlock", true);
//	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformInfo[0]);
//	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformInfo[1]);
	capabilities.setCapability("newCommandTimeout",60);
//	capabilities.setCapability("newCommandTimeout", "45000");
//	capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
//	capabilities.setCapability(MobileCapabilityType.UDID, udid);
//	capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
	capabilities.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
	capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	capabilities.setCapability("appPackage", "com.docsapp.patients.debug");
	capabilities.setCapability("appActivity", "com.docsapp.patients.app.MainActivity");
	//com.docsapp.patients.app.MainActivity
//	capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
//	capabilities.setCapability("ap
	URL url= new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver<MobileElement>(url, capabilities);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	Thread.sleep(5000);

}
	@AfterMethod
	public void tearDown()
	{
		driver.closeApp();
	}
	
	
	
	
}	
	
