package com.patientApp.TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.patientApp.Base.MavenGenericMethods;
import com.patientApp.Base.TestBase;

import Listener.ListenerTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@Listeners(ListenerTest.class)
public class MavenTestClass extends TestBase{
	
	MavenGenericMethods genericMethods = new MavenGenericMethods();
	
	/*@BeforeTest
	@Parameters({"platform","udid","systemPort"})
	public void AppSetUp() throws Exception
	{
		setup(null, null, null);
	}*/
	
/*	
	@Test(priority=1)
	public void signUpInApplication() throws Exception
	{
		genericMethods.OnboardingToConsultScreen(driver,"9999999999");
	}
*/
/*	
	@Test(priority=2)
	public void TestingPayTMpaymentForLabPackage() throws Exception
	{
		genericMethods.labPackageTestCase(driver);
		genericMethods.paymentWithPayTM(driver, "package");
	}

	
	@Test(priority=3)
	public void TestingPayTMpaymentForHealthPackage() throws Exception
	{
		genericMethods.healthPackageTestCase(driver, wait);
		genericMethods.paymentWithPayTM(driver, "package");
	}
		
	
		
	@Test(priority=4)
	public void creatingDoctorCardToPayTMPayment() throws Exception
	{
		genericMethods.creatingADoctorCard(driver);
		genericMethods.docCardToPaymentPage(driver);
		genericMethods.paymentWithPayTM(driver, "consultation");
	}
	
*/	
	@Test(priority=5)
	public void updatingTheProfile() throws Exception
	{	
		genericMethods.profileUpdateHam(driver, "Ajay singh", "9779166234", "Testing@gmail.com", "55");
	}
/*	
	@Test(priority=6)
	public void howDocsAppWorks() throws Exception
	{
		genericMethods.videoHowDocAppWorksHam(driver);
	}
*/	
/*	
	@Test(priority=7)
	public void myMedicalRecords() throws Exception
	{
		genericMethods.medicalRecordUploadbycamera(driver);
	}
*/
	
	@Test(priority=8)
	public void whatWeTreat() throws Exception
	{
		genericMethods.whatWeTreatHam(driver);
	}
	
	
/*	
	@Test(priority=9)
	public void givingLowRatingFlow() throws Exception
	{
		genericMethods.lowRatingHam(driver);
	}

	@Test(priority=10)
	public void givingAverageratingFlow() throws Exception
	{
		genericMethods.averageRatingHam(driver);
	}
		
	@Test(priority=11)
	public void givingHighratingFlow() throws Exception
	{
		genericMethods.highestRatingHam(driver);
	}
//------------------------------------------------------
	@Test(priority=12)
	public void contactUsFlow() throws Exception
	{
		genericMethods.contactUsHam(driver);
	}

	@Test(priority=13)
	public void updateApplicationFlow() throws Exception
	{
		genericMethods.updateApplication(driver);
	}
*/
	
 /*
	@Test(priority=14)
	public void changeLanguage() throws Exception
	{
		genericMethods.changeLanguageHam(driver);
	}
	
	@Test(priority=15)
	public void referAndearn() throws Exception
	{
		genericMethods.referAndEarnPageHam(driver);
	}
*/	
	
/*	
	@Test(priority=16)
	public void testingMasterCardPaymentForHealthPackage() throws Exception
	{
		genericMethods.healthPackageTestCase(driver, wait);
		genericMethods.paymentWithMasterCard(driver, "package");
	}
	
	
	@Test(priority=17)
	public void testingVisaCardPaymentForHealthPackage() throws Exception
	{
		genericMethods.healthPackageTestCase(driver, wait);
		genericMethods.paymentWithVisaCard(driver, "package");
	}
	
	@Test(priority=18)
	public void creatingDoctorCardToVisaCardPayment() throws Exception
	{
		genericMethods.creatingADoctorCard(driver);
		genericMethods.docCardToPaymentPage(driver);
		genericMethods.paymentWithVisaCard(driver, "consultation");
	}
	
	@Test(priority=19)
	public void creatingDoctorCardToMasterCardPayment() throws Exception
	{
		genericMethods.creatingADoctorCard(driver);
		genericMethods.docCardToPaymentPage(driver);
		genericMethods.paymentWithMasterCard(driver, "consultation");
	}
	
	@Test(priority=20)
	public void TestingVisaCradpaymentForLabPackage() throws Exception
	{
		genericMethods.labPackageTestCase(driver);
		genericMethods.paymentWithVisaCard(driver, "package");
	}
*/	
/*		
	
	@Test(priority=21)
	public void TestingMasterCardpaymentForLabPackage() throws Exception
	{
		genericMethods.labPackageTestCase(driver);
		genericMethods.paymentWithMasterCard(driver, "package");
	}	
	
	
	@Test(priority=22)
	public void doctorCardCreationToPaymentConfirmationFromDocProfile() throws Exception
	{
		genericMethods.creatingADoctorCard(driver);
		genericMethods.docProfileCallPayment(driver);
		genericMethods.paymentWithPayTM(driver, "consultation");
	}
	
	
	@Test(priority=23)
	public void doctorCardCreationToPaymentConfirmationFromDocCallButton() throws Exception
	{
		genericMethods.creatingADoctorCard(driver);
		genericMethods.docProfileToPayment(driver);
		genericMethods.paymentWithVisaCard(driver, "consultation");
	}
*/
}
