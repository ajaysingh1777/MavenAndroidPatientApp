package com.patientApp.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.patientApp.PO.ConsultAdoctorPO;
import com.patientApp.PO.DocsAppHomePO;
import com.patientApp.PO.HamburgerMenu;
import com.patientApp.PO.HealthPackagePO;
import com.patientApp.PO.LabPackagePO;
import com.patientApp.PO.OneClickSignupPO;
import com.patientApp.PO.PaymentDetailsGatewayPO;
import com.patientApp.PO.PaymentDetailsPagePO;
import com.patientApp.PO.SelectLanguagePO;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class MavenGenericMethods 
{	
	ConsultAdoctorPO consultAdoctorPO;
	DocsAppHomePO docsAppHomePO;
	HamburgerMenu hamburgerMenu;
	LabPackagePO labPackagePO;
	SelectLanguagePO selectLanguagePO;
	OneClickSignupPO oneClickSignupPO;
	PaymentDetailsGatewayPO paymentDetailsGatewayPO;
	PaymentDetailsPagePO paymentDetailsPagePO;
	HealthPackagePO healthPackagePO;
	
	WebDriverWait wait;
	
	
		public static Logger log = Logger.getLogger(MavenGenericMethods.class);
	
		/*This method will help to scroll vertical and also cane be altered to swipe horizontal*/
		public void swipe_Vertical(AndroidDriver<MobileElement> driver) throws Exception 
		{
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		log.info("Testing");
		log.info("is going on");
		
		int width = size.width/2;
		System.out.println(width);
		
		int startPoint = (int)(size.height*0.8);
		System.out.println(startPoint);
		
		int endPoint = (int)(size.height *0.2);
		System.out.println(endPoint);
		
		Thread.sleep(3000);
		
		TouchAction action = new TouchAction(driver);
		action.press(width, startPoint).waitAction(Duration.ofMillis(2000)).moveTo(width, endPoint).release().perform();		
		}
	
		/*THIS WILL COVER THE ONBOARDING TO THE PAYMENT page need to be verified */		
		public void firstTimeUserToConsult(AndroidDriver<WebElement> driver,WebDriverWait wait) throws Exception 
	{	
		//click on English
		if(driver.findElement(By.id("text_english")).isDisplayed())
		{
		driver.findElement(By.id("text_english")).click();
		//CLICK ON AGREE AND PROCEED
		driver.findElement(By.id("btn_proceed")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Entering the Mobile Number
		driver.findElement(By.id("com.docsapp.patients:id/txt_phone_no")).sendKeys("9781909676");
		// Entering the Name
		driver.findElement(By.id("com.docsapp.patients:id/txt_name")).sendKeys("Testing001");
		// Entering the Email Id 
		driver.findElement(By.id("com.docsapp.patients:id/txt_email")).clear();
		driver.findElement(By.id("com.docsapp.patients:id/txt_email")).sendKeys("chouhan.ajay1707@gmail.com");
		// click on the back button
		driver.pressKeyCode(AndroidKeyCode.BACK);
		//AGREE AND PROCEED BUTTON 
		driver.findElement(By.id("com.docsapp.patients:id/btn_verify_proceed")).click();
		//ENTER THE OTP
		driver.findElement(By.id("com.docsapp.patients:id/txt_otp")).sendKeys("1357");
		wait = new WebDriverWait(driver,60);
		// Explicit Wait
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.docsapp.patients:id/askq_husband")));
		// Click on Husband
		driver.findElement(By.id("com.docsapp.patients:id/askq_husband")).click();
		// Enter the Patient Age
		driver.findElement(By.id("com.docsapp.patients:id/age")).clear();
		driver.findElement(By.id("com.docsapp.patients:id/age")).sendKeys("35");
		// Select the Patient Gender
		driver.findElement(By.id("com.docsapp.patients:id/maleImage")).click();
		// Enter text in the Health Issue
		driver.findElement(By.id("com.docsapp.patients:id/query")).sendKeys("Headache");
		// Click on the Back Button
		driver.pressKeyCode(AndroidKeyCode.BACK);
		// Click on the Specialty
		driver.findElement(By.id("com.docsapp.patients:id/spinnerSpeciality")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ListView")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//select the specialty
		try {
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[@index='6']/android.widget.TextView[@text='Hair and Scalp problems']")).click();
		}catch(Exception e) {	
		}
		try {
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[@text='Hair and Scalp problems']")).click();
		}catch(Exception e) {
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Click on the Submit Button
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.TextView[@text='SUBMIT']")).click();
		// Click on the okay Dialog Box
		driver.findElement(By.id("com.docsapp.patients:id/dialog_button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// entering the text 
		driver.findElement(By.id("com.docsapp.patients:id/et_message_box")).sendKeys("Testing");
		driver.findElement(By.id("com.docsapp.patients:id/iv_send")).click();
		//CHECKING FOR THE PAYBUTTON
		try {
			driver.findElement(By.id("com.docsapp.patients:id/btn_clickToPay")).isDisplayed();
			driver.findElement(By.id("com.docsapp.patients:id/btn_clickToPay")).click();	
		}catch(Exception e) {
			driver.findElement(By.id("com.docsapp.patients:id/et_message_box")).sendKeys("Testing");
			driver.findElement(By.id("com.docsapp.patients:id/iv_send")).click();
		}
		try {
			driver.findElement(By.id("com.docsapp.patients:id/btn_clickToPay")).isDisplayed();
			driver.findElement(By.id("com.docsapp.patients:id/btn_clickToPay")).click();	
		}catch(Exception e) {
		}
		
		//ON THE PAYMENT DETAILS PAGE 
		//CLICK ON THE CHECK BOX OF DOCS APP CASH 
		driver.findElement(By.id("com.docsapp.patients:id/img_docsapp_checked")).click();
		//CLICK ON THE PROCEED TO PAY BUTTON 
		driver.findElement(By.id("com.docsapp.patients:id/btn_proceed")).click();
		
		//PAYMENT METHOD NEED TO BE CALLED 
		
		}
	}
	
		//This method will land you to the Home screen even if the Onboarding comes from sign in
		public void OnboardingToConsultScreen(AndroidDriver<MobileElement> driver,String number) throws Exception
			{	
			selectLanguagePO = new SelectLanguagePO();
			oneClickSignupPO = new OneClickSignupPO();
			consultAdoctorPO = new ConsultAdoctorPO();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,15);
			//EXPLICIT WAIT
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text_english")));
			log.info("******************OnboardingToConsultScreen****************");
				try {
					//click on English
					try {
						log.info("checking that the select language page is displayed or not");
					//	boolean status = driver.findElement(By.id("text_english")).isDisplayed();
						boolean status = selectLanguagePO.English1().isDisplayed();
						log.info("click on the english button and on the proceed button");
					//	driver.findElement(By.id("text_english")).click();
						selectLanguagePO.English1().click();
						//CLICK ON AGREE AND PROCEED
					//	driver.findElement(By.id("btn_proceed")).click();
						selectLanguagePO.agreeAndProceed1().click();
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						//HARD CODE SLEEP
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Thread.sleep(2000);
					//EXPLICIT WAIT
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_phone_no")));
					log.info("Entering the Mobile Number");
					// Entering the Mobile Number
					oneClickSignupPO.MobileNumber1().sendKeys(number);
					// Entering the Name
					log.info("ENTERING THE PATIENT NAME");
					//driver.findElement(By.id("txt_name")).sendKeys("Testing001");
					oneClickSignupPO.YourName1().sendKeys("Testing001");
					//AGREE AND PROCEED BUTTON 
					log.info("CLICK ON THE PROCEED BUTTON");
					//driver.findElement(By.id("btn_verify_proceed")).click();
					oneClickSignupPO.agreeAndProceed1().click();
					//WAITING FOR THE OTP
					Thread.sleep(8000);
					oneClickSignupPO.OtpEntryButton1().clear();
					log.info("entering the OTP 1357 in the field ");
					oneClickSignupPO.OtpEntryButton1().sendKeys("1357");
					//EXPLICIT WAIT
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("askq_me")));

					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				}catch(Exception e) {
					log.info("CONSULT A DOCTOR PAGE IS DISPLAYED");
					consultAdoctorPO.MyselfButton1().isDisplayed();
					log.info("CLICK ON THE BACK BUTTON TO BRING THAT TO THE DOCS APP HOME SCREEN");
					driver.pressKeyCode(AndroidKeyCode.BACK);
					e.printStackTrace();
										}		
			//Sample try
			try {
				driver.pressKeyCode(AndroidKeyCode.BACK);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//NOT HAM
		//NEED TO CHECKED AGAIN BECAUSE OF THE REVAMP
		//THIS WILL COVER THE FLOW OF HEALTH PACKAGE FROM HOME SCREEN TO PAYMENT DETAILS PAGE
		public void healthPackageTestCase(AndroidDriver<MobileElement> driver,WebDriverWait wait) throws Exception
		{	
			healthPackagePO = new HealthPackagePO();
			docsAppHomePO = new DocsAppHomePO();
			paymentDetailsPagePO = new PaymentDetailsPagePO();
			
			log.info("******************healthPackageTestCase****************");

			// ******    Home Screen Check need to be added    *****
			wait=new WebDriverWait(driver, 15);
			//Thread.sleep(3000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("layout_homescreentabproductsicon")));
			log.info("Click on the Store icon on the home screen");
			docsAppHomePO.StoreButton1().click();			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("img_lpd_catalogue_thumb")));
			//Thread.sleep(3000);
			log.info("click on the Complete Care Unlimited package");
			healthPackagePO.DocsAppGoldBasic().click();
			//Thread.sleep(3000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_lpd_detail_book")));	
			log.info("click on the Book now button");
			healthPackagePO.BookNowbutton1().click();
			//driver.findElement(By.id("txt_lpd_detail_book")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_proceed")));
			log.info("CLICK ON PROCEED TO PAY ON THE PAYMEN DETAILS PAGE");
			paymentDetailsPagePO.ClickOnPayButton1().click();
			log.info("In this we are not checking the net amount and the wallet cash");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tv_card_no")));
			//*********CALLING THE PAYMENT METHOD	
		 }
		
		//NOT HAM
		//NEED TO CHECKED AGAIN BECAUSE OF THE REVAMP
		//THIS WILL COVER THE FLOW OF Lab PACKAGE FROM HOME SCREEN TO PAYMENT DETAILS PAGE
		public void labPackageTestCase(AndroidDriver<MobileElement> driver) throws Exception
		{
			labPackagePO = new LabPackagePO();
			docsAppHomePO = new DocsAppHomePO();
			paymentDetailsPagePO = new PaymentDetailsPagePO();
			
			wait = new WebDriverWait(driver, 10);
		
			// ******    Home Screen Check need to be added    *****
			//enter explicit wait
			//Thread.sleep(3000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.findElement(By.id("button_homescreenlabtesticon")).click();
			docsAppHomePO.LabTestButton1().click();
			log.info("CLICK ON THE FULL BODY HEALTH PACKAGE");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_help")));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			labPackagePO.StandardFullBodyCheckUp1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("linear_lpd_cta_book")));
			log.info("CLICK ON THE BOOK NOW BUTTON");
			labPackagePO.BookNowButton1().click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("click on the 8AM - 9AM slot");
			labPackagePO.SecondTimeSlot1().click();
			//driver.findElement(By.id("txt_lpd_time3")).click();
			log.info("CLICK ON THE SELECT ADDRESS ON BOOK TEST PAGE");
			labPackagePO.SelectAddressButton1().click();
			Thread.sleep(2000);
			try {
				log.info("CLICK ON THE ADD ADDRESS TAB");
				labPackagePO.AddNewAddress1().click();
				Thread.sleep(2000);
				log.info("ENTERING THE PINCODE");
				labPackagePO.EnterPincode1().sendKeys("111111");
				log.info("ENTERING THE ADDRESS LINE 1");
				labPackagePO.EnterAddressLine11().sendKeys("Testing");
				log.info("ENTERING THE ADDRESS LINE 2");
				labPackagePO.EnterAddressLine21().sendKeys("Testing");
				log.info("ENTERING THE LANDMARK OPTION");
				try {
					labPackagePO.LandMark1().sendKeys("Test");
				}catch (Exception e) {
					driver.hideKeyboard();
					labPackagePO.LandMark1().sendKeys("Test");
				}
				log.info("ENTERING THE CITY");
				try {
					labPackagePO.EnterCityName1().sendKeys("Test");
				}catch (Exception e) {
					driver.hideKeyboard();
					labPackagePO.EnterCityName1().sendKeys("Test");
				}
				log.info("CLICK ON THE TICK BUTTON ");
				labPackagePO.SaveProfileButton1().click();
				Thread.sleep(2000);
				log.info("CLICK ON DELIVER HERE");
				labPackagePO.DeliverHereButton1().click();
			} catch (Exception e1) {
				
				log.info("CLICK ON DELIVER HERE");
				labPackagePO.DeliverHereButton1().click();
				e1.printStackTrace();
			}
			Thread.sleep(2000);
			log.info("CLICK ON PAY NOW ON CONFIRM ORDER PAGE");
			labPackagePO.PayNowConfirmOrderButton1().click();
			Thread.sleep(2000);
			log.info("Uncheck the Wallet cash");
			paymentDetailsPagePO.WalletCheckBoxButton1().click();
			log.info("CLICK ON PROCEED TO PAY ON THE PAYMEN DETAILS PAGE"); 
			paymentDetailsPagePO.ClickOnPayButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tv_card_no")));
			
		 }
		
		//note - updated the payment ids, page assert are yet to be updated  
		//NEED TO CHECKED AGAIN BECAUSE OF THE REVAMP
		//THIS WILL COVER THE FLOW OF Lab PACKAGE FROM HOME SCREEN TO PAYMENT DETAILS PAGE
		public void paymentWithVisaCard(AndroidDriver<MobileElement> driver,String PaidFor) throws Exception
		{	
			
			log.info("Entering the number in the text Visa Card field"); 		
			wait = new WebDriverWait(driver, 20);
			
			//Now starts the Payment page 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("click on the card");
			try {
				driver.findElement(By.id("tv_card_no")).click();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("entering the card number");
			driver.findElement(By.id("edit_text_card_number")).sendKeys("4012001037141112");
			log.info("entering the expiry date");
			driver.findElement(By.id("edit_text_expiry")).sendKeys("05/20");
			log.info("entering the CVV number");
			driver.findElement(By.id("edit_text_card_cvv")).sendKeys("123");
			Thread.sleep(3000);
			log.info("Uncheck the save card");
			driver.findElement(By.id("save_card_checkbox")).click();
			log.info("click on the pay button");
			driver.findElement(By.id("btn_paymentCardNow")).click();
			
			//driver.findElement(By.id("btn_paymentCardNow")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(PaidFor);
			log.info("Payment is done for = " +PaidFor);
			if(PaidFor=="package")
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")));
				String actualpackageResult=driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")).getText();
				System.out.println(actualpackageResult);
				String expectedPackageResult = "Payment Success!";
				Assert.assertEquals(actualpackageResult, expectedPackageResult);
			}
			
			if(PaidFor=="consultation")
			{	
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dialog_button")));
				String expectedConsultresult = "Payment Done";
				String actualConsultresult = driver.findElement(By.id("dialog_title")).getText();
				System.out.println(actualConsultresult);
				Assert.assertEquals(actualConsultresult, expectedConsultresult);
				log.info("click on the OK button of the payment done");
				driver.findElement(By.id("dialog_button")).click();
				Thread.sleep(3000);
			}
		}
		
		//note - updated the payment ids, page assert are yet to be updated  
		//NEED TO CHECKED AGAIN BECAUSE OF THE REVAMP
		//THIS WILL COVER THE FLOW OF Lab PACKAGE FROM HOME SCREEN TO PAYMENT DETAILS PAGE
		public void paymentWithMasterCard(AndroidDriver<MobileElement> driver , String PaidFor) throws Exception
		{	
			wait = new WebDriverWait(driver, 20);
			log.info("Entering the number in the text Visa Card field"); 		
			
			//Now starts the Payment page 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("click on the card");
			try {
				driver.findElement(By.id("tv_card_no")).click();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("entering the card number");
			Thread.sleep(2000);
			driver.findElement(By.id("edit_text_card_number")).sendKeys("5123456789012346");
			log.info("entering the expiry date");
			driver.findElement(By.id("edit_text_expiry")).sendKeys("05/20");
			log.info("entering the CVV number");
			driver.findElement(By.id("edit_text_card_cvv")).sendKeys("123");
			Thread.sleep(3000);
			log.info("Uncheck the save card");
			driver.findElement(By.id("save_card_checkbox")).click();
			log.info("click on the pay button");
			driver.findElement(By.id("btn_paymentCardNow")).click();
			/*try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			//driver.findElement(By.id("btn_paymentCardNow")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(PaidFor);
			log.info("Payment is done for = " +PaidFor);
			if(PaidFor=="package")
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")));
				String actualpackageResult=driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")).getText();
				System.out.println(actualpackageResult);
				String expectedPackageResult = "Payment Success!";
				Assert.assertEquals(actualpackageResult, expectedPackageResult);
			}
			
			if(PaidFor=="consultation")
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dialog_button")));
				String expectedConsultresult = "Payment Done";
				String actualConsultresult = driver.findElement(By.id("dialog_title")).getText();
				System.out.println(actualConsultresult);
				Assert.assertEquals(actualConsultresult, expectedConsultresult);
				log.info("click on the OK button of the payment done");
				driver.findElement(By.id("dialog_button")).click();
				Thread.sleep(3000);
			}
		}
		
		//This method do the payments with the PayTM gateway 
		public void paymentWithPayTM(AndroidDriver<MobileElement> driver , String PaidFor) throws Exception
		{
			paymentDetailsGatewayPO = new PaymentDetailsGatewayPO();
			wait = new WebDriverWait(driver,20);
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("click on the Paytm for the payment"); 		
			//Now starts the Payment page 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			paymentDetailsGatewayPO.PayTMButton1().click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("entering the test mobile number");
			try {
				Thread.sleep(3000);
				paymentDetailsGatewayPO.EnterPaytmMobNoPayTM1().clear();
				paymentDetailsGatewayPO.EnterPaytmMobNoPayTM1().sendKeys("7777777777");
				log.info("click on the proceed button");
				paymentDetailsGatewayPO.PayTMpayProceedButton1().click();
				Thread.sleep(3000);
				log.info("entering the OTP");
				paymentDetailsGatewayPO.PayTMOTPField1().sendKeys("489871");
				log.info("click on the Verify button");
				paymentDetailsGatewayPO.PayTMVerifyButton1().click();
				
				//Check for the Paytm Balance Update 
				String CurrntPayTMbalance = paymentDetailsGatewayPO.PayTMWalletBalance1().getText();
				System.out.println(CurrntPayTMbalance);
				
				if(CurrntPayTMbalance == "INR 0.00")
				{	
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					Thread.sleep(5000);
				}

			}catch (Exception e) {
				// TODO: handle exception
			}
		
			log.info("click on the PAY NOW button");
			paymentDetailsGatewayPO.PayTMpayNowButton1().click();
			log.info("waiting for the confirmation of the payment");
		
			System.out.println(PaidFor);
			if(PaidFor=="package")
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")));
				String actualpackageResult=driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Payment Success!']")).getText();
				System.out.println(actualpackageResult);
				String expectedPackageResult = "Payment Success!";
				Assert.assertEquals(actualpackageResult, expectedPackageResult);
			}
			
			if(PaidFor=="consultation")
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dialog_button")));
				String expectedConsultresult = "Payment Done";
				String actualConsultresult = driver.findElement(By.id("dialog_title")).getText();
				System.out.println(actualConsultresult);
				Assert.assertEquals(actualConsultresult, expectedConsultresult);
				log.info("click on the OK button of the payment done");
				driver.findElement(By.id("dialog_button")).click();
				Thread.sleep(3000);
			}
		/*	
			String actualresult = "Payment Done";
			String ExpectedResult = null;
			try {
				ExpectedResult = driver.findElement(By.id("dialog_title")).getText();
				System.out.println(ExpectedResult);
				log.info("click on the OK button of the payment done");
				driver.findElement(By.id("dialog_button")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
			// this we have to aligh as per method call depending upon the result
			// consult have different flow and packages have different
			Assert.assertEquals(actualresult, ExpectedResult);
		*/
		
		}
		
		//THIS WILL COVER TO CREATING A DOCTOR CARD FROM TALK TO DOCTOR BUTTON
		//NEED TO CHECKED AGAIN BECAUSE OF THE REVAMP
		public void creatingADoctorCard(AndroidDriver<MobileElement> driver) throws Exception
		{	
			docsAppHomePO = new DocsAppHomePO();
			consultAdoctorPO = new ConsultAdoctorPO();
			wait = new WebDriverWait(driver, 10);
			//HARD CODE WAIT
			Thread.sleep(4000);
			log.info("******************creatingADoctorCard****************");
			// CHECKING FOR THE TALK TO DOCTOR BUTTON
			try	{
				log.info("CHECKING THAT THE TALK TO DOCTOR IS DISPLAYED");
				docsAppHomePO.TalkToDoctorButton1().isDisplayed();
				//driver.findElement(By.id("linear_ask_query")).isDisplayed();
				log.info("CLICK ON THE TALK TO THE DOCTOR BUTTON");
				docsAppHomePO.TalkToDoctorButton1().click();
			 	}catch(Exception e){
					System.out.println("button not visible");
				}
			// Click on Husband
			log.info("CLICK ON THE HUSBAND OPTION");
			Thread.sleep(2000);
			consultAdoctorPO.HusbandButton1().click();
			log.info("ENTERING THE PATIENT AGE");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			consultAdoctorPO.AgeButton1().clear();
			consultAdoctorPO.AgeButton1().sendKeys("35");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			consultAdoctorPO.maleImage1().click();
			log.info("ENTERING HEADACHE IN THE HEALTH CONCERN");
			consultAdoctorPO.HealthConcernTextButton1().sendKeys("Headache");
			log.info("SELECTING THE GENERAL MEDICINE SPECIALITY");
			consultAdoctorPO.SelectSpeciality1().click();
			Thread.sleep(2000);
			//click on General Medicine
			consultAdoctorPO.GeneralMedicine1().click();
			Thread.sleep(2000);
			//click on start consult 
			log.info("CLICK ON THE START CONSULT");
			consultAdoctorPO.StartConsultationButton1().click();
			// Click on the okay Dialog Box
			Thread.sleep(3000);
			log.info("CLICK ON THE DIALOG BOX");
			consultAdoctorPO.FindingBestDoctorDialogBox1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iv_send")));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// entering the text 
			log.info("ENTERING FORCE TEXT IN THE CHAT SCREEN TO GET THE DOCTOR CARD");
			consultAdoctorPO.DoctorChatPage1().sendKeys("Testing");
			consultAdoctorPO.SendMessageButton1().click();
			try {
				driver.hideKeyboard();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {	
				boolean docCardStatus = consultAdoctorPO.DocCardClickToPayButton1().isDisplayed();
				System.out.println("Status of doctor Card is  " +docCardStatus);
				}catch(Exception e) {
				log.info("ENTERING FORCE TEXT SECOND TIME IN THE CHAT SCREEN TO GET THE DOCTOR CARD");
				consultAdoctorPO.DoctorChatPage1().sendKeys("Testing");
				consultAdoctorPO.SendMessageButton1().click();
				
			System.out.println("create card 1");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(8000);
			boolean docCardStatus = consultAdoctorPO.DocCardClickToPayButton1().isDisplayed();
			System.out.println("create card 2");
			System.out.println("Status of doctor Card is  " +docCardStatus);
									}
			//BRINGING BACK TO THE HOME SCREEN
			//log.info("CLICK ON THE BACK BUTTON TO BRING BACK FROM CHAT SCREEN TO THE HOME SCREEN");
			//driver.pressKeyCode(AndroidKeyCode.BACK);
			//Thread.sleep(2000);
			//This code for handling the exit screen
			/*try {
				//checking if the Dialog screen is displayed
				boolean exitScreenStatus = driver.findElement(By.id("com.docsapp.patients:id/feedback_option_5")).isDisplayed();
				System.out.println("Ststus of Exit Screen Displayed  = " +exitScreenStatus);
				//click on the Other option
				driver.findElement(By.id("com.docsapp.patients:id/feedback_option_5")).click();
				//click on the Submit Button
				driver.findElement(By.id("com.docsapp.patients:id/feedback_submit")).click();
				//on the Other , enter the text and click on the submit button
				driver.findElement(By.id("com.docsapp.patients:id/txt_repeat_exit_comment")).sendKeys("Testing");
				//click on the submit button
				driver.findElement(By.id("com.docsapp.patients:id/btn_repeat_exit1_cta")).click();
				//click on the OK I WILL WAIT and screen will go 
				driver.findElement(By.id("com.docsapp.patients:id/btn_repeat_level3_wait")).click();
				Thread.sleep(3000);
				} catch (Exception e) {
							e.printStackTrace();
										}
			driver.pressKeyCode(AndroidKeyCode.BACK);*/
			//adding this code to swipe and check for the payment page 
			swipe_Vertical(driver);
		}
		
		//NOT HAM
		//THIS WILL COVER THE FLOW TO THE PAYMENT WHEN GO THROUGH PROFILE PAGE
		public void docProfileToPayment(AndroidDriver<MobileElement> driver) throws Exception
		{	
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//CLICK ON THE DOCTOR PROFILE
			driver.findElement(By.id("civ_doctor")).click();
			log.info("click on the doctor profile");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(3000);
			//CLICK ON PAY TO START CONSULTATION 
			driver.findElement(By.id("txt_dr_pay")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(3000);
			log.info("click on the pay to start consultation");
			//CLICK ON PROCEED TO PAY ON THE PAYMENT DETAILS PAGE
			driver.findElement(By.id("btn_proceed")).click();
			//PAYMENT METHOD NEED TO BE CALLED 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		//NOT HAM
		//THIS METHODS COVERS DOC PROFILE CALL TO PAYMENT PAGE
		public void docProfileCallPayment(AndroidDriver<MobileElement> driver) throws Exception
		{	
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			//CLICK ON THE CALL BUTTON AFTER DOC CARD CREATION 
			driver.findElement(By.id("menu_call")).click();
			log.info("click on the profile call button");
			try {
				//CLICK ON THE YES'CALL BUTTON ON THE CONFIRM CALL CONSULTATION
				driver.findElement(By.id("btn_call_doctor_cta1")).click();
				log.info("click on Yes call button");	
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.id("btn_call_doctor_cta1")).click();
				log.info("click on The Pay Now Button");
				}catch (Exception e) {
					driver.findElement(By.id("btn_call_doctor_cta1")).click();
					log.info("click on Yes call button");	
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					driver.findElement(By.id("btn_call_doctor_cta1")).click();
					log.info("click on The Pay Now Button");
								}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//CLICK ON PROCEED TO PAY ON THE PAYMENT DETAILS PAGE
			driver.findElement(By.id("btn_proceed")).click();
			log.info("click on the proceed to pay button");
			//PAYMENT METHOD NEED TO BE CALLED 
			Thread.sleep(3000);
		}
		
		//NOT HAM
		//THIS METHODS COVERS DOC PROFILE CALL TO PAYMENT PAGE
		public void docCardToPaymentPage(AndroidDriver<MobileElement> driver) throws Exception
		{
			consultAdoctorPO = new ConsultAdoctorPO();
			paymentDetailsPagePO = new PaymentDetailsPagePO();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("CLICK ON THE DOC CARD PAY BUTTON");
			consultAdoctorPO.DocCardClickToPayButton1().click();
			//driver.findElement(By.id("btn_clickToPay")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_proceed")));
			paymentDetailsPagePO.NetPayableAmount1().getText();
			String Amount =	paymentDetailsPagePO.NetPayableAmount1().getText();
			//String Amount =	driver.findElement(By.id("txtpaymentnetamount")).getText();
			log.info("the amount is" +Amount);
			//UNCHECK THE USE DOCSAPP CASH
			paymentDetailsPagePO.WalletCheckBoxButton1().click();
			log.info("uncheck the docsapp Cash");
			Thread.sleep(2000);
			//FETCHING THE NET AMOUNT	
			String NewAmount =	paymentDetailsPagePO.NetPayableAmount1().getText();
			//String NewAmount =	driver.findElement(By.id("txtpaymentnetamount")).getText();
			log.info("The Net Amount is " +NewAmount);
			/*	
			//ENTERING THE COUPON
			driver.findElement(By.id("enter_coupon_code")).click();
			driver.findElement(By.id("txtPromoCode")).sendKeys("ashish999");
			log.info("applying the Coupon code");
			driver.findElement(By.id("btnpromocodeapply")).click();
			String CouponAppliedAmount =driver.findElement(By.id("txtpaymentnetamount")).getText();
			log.info("The Amount After coupon code applying id " +CouponAppliedAmount);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//CANCELLING THE COUPON APPLIED 
			driver.findElement(By.id("coupon_unselect")).click();
			log.info("cancelling the Coupon Applied");
			String CouponDeletedAmount =	driver.findElement(By.id("txtpaymentnetamount")).getText();
			log.info("The Amount after Coupon code Uncheck" +CouponDeletedAmount);
			//CLICK ON THE "PROCEED TO PAY BUTTON" ON THE PAYMENT DETAILS PAGE	
*/			
			paymentDetailsPagePO.ClickOnPayButton1().click();
			log.info("click on the proceed button");
		}
		
		//This method update the profile of the user defined on the given parameters
		public void profileUpdateHam(AndroidDriver<MobileElement> driver,String Name,String Number,String EMailID,String Age) throws Exception
		{	
			hamburgerMenu = new HamburgerMenu();

			wait = new WebDriverWait(driver, 10);
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************profileUpdateHam****************");
			log.info("CLICK ON THE HAMBURGER MENU");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//CLICK ON THE MY PROFILE 
			log.info("CLICK ON THE MY PROFILE");
			hamburgerMenu.MyProfileButton1().click();
			Thread.sleep(2000);
			//CLICK ON EDIT FULL NAME
			log.info("UPDATING THE NAME");
			hamburgerMenu.ProfileFullName1().clear();
			hamburgerMenu.ProfileFullName1().sendKeys(Name);
			Thread.sleep(2000);
			//CLICK ON EDIT Phone Number
			log.info("ENTERING THE MOBILE NUMBER");
			hamburgerMenu.ProfilePhoneNumber1().clear();
			hamburgerMenu.ProfilePhoneNumber1().sendKeys(Number);
			Thread.sleep(2000);
			//CLICK ON EDIT email address
			log.info("ENTERING THE EMAIL ID");
			hamburgerMenu.ProfileEmailAddress1().clear();
			hamburgerMenu.ProfileEmailAddress1().sendKeys(EMailID);
			Thread.sleep(2000);
			//CLICK ON EDIT AGE
			log.info("ENTERING THE AGE");
			hamburgerMenu.ProfileAge1().clear();
			hamburgerMenu.ProfileAge1().sendKeys(Age);
			Thread.sleep(2000);
			//CLICK ON CHANGE GENDER
			String Gender = hamburgerMenu.ProfileGender1().getText();
			//String Gender = driver.findElement(By.id("tvGender")).getText();
			System.out.println(Gender);
			hamburgerMenu.ProfileGenderChangerButton1().click();
			//driver.findElement(By.id("buttonGenderEdit")).click();
			String ChangeGender = driver.findElement(By.id("tvGender")).getText();
			System.out.println(ChangeGender);
			log.info("APPLYING THE ASSERTION");
			Assert.assertNotSame(Gender, ChangeGender);
			//CLICK ON THE SAVE BUTTON 
			log.info("CLICK ON THE SAVE BUTTON");
			hamburgerMenu.ProfileSaveButton1().click();
			Thread.sleep(5000);
			//click for going to the home page
			log.info("CLICK ON THE BACK BUTTON TO BRING ON THE HOME PAGE");
			try {
				driver.pressKeyCode(AndroidKeyCode.BACK);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//ASSERTION NEED TO BE ADDED
		public void referAndEarnPageHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			log.info("******************referAndEarnPageHam****************");
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));	
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON THE HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on the Refer & Earn 
			log.info("CLICK ON THE REFER AND EARN");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='1']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_refer_n_earn")));
			String FindHowToEarn = driver.findElement(By.id("btn_refer_n_earn")).getText();
			System.out.println(FindHowToEarn);	
		}
		
		//This Method POM object is yet to be implemented 
		//One Review is pending
		public void videoHowDocAppWorksHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();

			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************videoHowDocAppWorksHam****************");
			//driver.pressKeyCode(AndroidKeyCode.BACK);
			log.info("CLICK ON THE HAMBURGER MENU");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			log.info("CLICK ON HOW DOCS APP WORKS");
			//Click on HowDocAppWorksHam 
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='2']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iv_how_docsapp_works")));
			driver.findElement(By.id("iv_play_video")).click();
			Thread.sleep(5000);
			log.info("VALIDATING ASSERTION");
			boolean CrossVisible = false ;
			CrossVisible = driver.findElement(By.id("close_dialog")).isDisplayed();
			System.out.println(CrossVisible);
			//CLICK ON THE VIDEO CROSS BUTTON
			log.info("VALIDATING THE ASSERTION");
			driver.findElement(By.id("close_dialog")).click();
			Assert.assertEquals(CrossVisible, true);
		}
		
		//NEED TO ADD THAT CHANGE BACK TO ENGLISH OR NOT AND ONE REVIEW
		public void changeLanguageHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			log.info("******************changeLanguageHam****************");
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON THE HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on Change Language
			log.info("CLICK ON THE CHANGE LANGUAGE");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='3']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text_english"))); 
			//CLICK ON THE HINDI TEXT
			log.info("CLICK ON THE HINDI TEXT");
			driver.findElement(By.id("text_hindi")).click();
			//CLICK ON PROCEED BUTTON
			log.info("CLICK ON THE PROCEED BUTTON");
			driver.findElement(By.id("btn_proceed")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			String helpButton="सहायता";
			//fetching the hindi text from the help button 
			String ActualhelpText = driver.findElement(By.id("helpChat")).getText();
			log.info("VALIDATING THE ASSERTION");
			System.out.println(ActualhelpText);
			Assert.assertEquals(ActualhelpText, helpButton);
			
			
			log.info("***************CHANGING BACK TO THE ENGLISH LANGUAGE***************");
			Thread.sleep(5000);
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON THE HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on Change Language
			log.info("CLICK ON THE CHANGE LANGUAGE");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='3']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text_english"))); 
			//CLICK ON THE ENGLISH TEXT
			log.info("CLICK ON THE ENGLISH TEXT");
			driver.findElement(By.id("text_english")).click();
			//CLICK ON PROCEED BUTTON
			log.info("CLICK ON THE PROCEED BUTTON");
			driver.findElement(By.id("btn_proceed")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
		}
		
		
		//MORE ACCURATE ON THE EDGE CASES NEED TO BE ADDED
		public void medicalRecordUploadbycamera(AndroidDriver<MobileElement> driver) throws Exception
		{	
			log.info("******************medicalRecordUploadbycamera****************");
		
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on My Medical record
			log.info("CLICK ON THE MEDICAL RECORDS");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='4']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add_record_button")));
			//CLICK ON ADD A RECORD
			log.info("CLICK ON ADD A RECORD");
			driver.findElement(By.id("add_record_button")).click();
			Thread.sleep(3000);
			//click on camera 
			log.info("CLICK ON CAMERA OPTION");
			driver.findElement(By.id("txtVw_uploadFromCamera")).click();
			Thread.sleep(5000);
			//Click on the Camera shutter button
			log.info("CLICK ON THE CAMERA SHUTTER");
			driver.findElement(By.id("com.android.camera:id/v6_shutter_button_internal")).click();
			Thread.sleep(5000);
			//Click on the Tick Mark
			driver.findElement(By.id("com.android.camera:id/v6_btn_done")).click();
			Thread.sleep(4000);
			//Click on the Upload
			log.info("CLICK ON THE UPLOAD");
			driver.findElement(By.id("upload_record_text")).click();
			Thread.sleep(6000);
			
			String UploadText = "Bill added by you";
			System.out.println(UploadText);
			log.info("VALIDATING THE ASSERTION");
			String ActualUploadText = driver.findElement(By.id("record_title")).getText();
			Assert.assertEquals(ActualUploadText, UploadText);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			Thread.sleep(5000);
			if(driver.findElement(By.id("add_record_button")).isDisplayed())
			{
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}
		}

		
		//A REVIEW IS PENDING
		public void orderMedicineHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			log.info("******************orderMedicineHam****************");
//			
			wait = new WebDriverWait(driver, 10);	
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("CLICK ON THE HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			Thread.sleep(2000);
			
			//Click on Order Medicine
			log.info("CLICK ON THE ORDER MEDICINE TAB");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='5']")).click();
			Thread.sleep(5000);
			boolean addressMsgDisplayed = driver.findElement(By.id("com.docsapp.patients:id/ll_chat_message")).isDisplayed();
			if(addressMsgDisplayed)
				{	
					log.info("");
					driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[@index='1']")).click();
					Thread.sleep(3000);
					//SELECTING PIN CODE 
					driver.findElement(By.id("com.docsapp.patients:id/address_pincode_et")).sendKeys("111111");
					//ENTERING ADDRESS LINE 1 
					driver.findElement(By.id("com.docsapp.patients:id/address_line_1_et")).sendKeys("Testing");
					//ENTERING THE ADDRESS LINE 2
					driver.findElement(By.id("com.docsapp.patients:id/address_line_2_et")).sendKeys("Testing");
					try {
							driver.findElement(By.id("com.docsapp.patients:id/address_landmark_et")).isDisplayed();
							driver.findElement(By.id("com.docsapp.patients:id/address_landmark_et")).sendKeys("Testing");
						}catch (Exception e) {
							driver.pressKeyCode(AndroidKeyCode.BACK);
							Thread.sleep(2000);
							driver.findElement(By.id("com.docsapp.patients:id/address_landmark_et")).sendKeys("Testing");		
												}
					try {
						driver.findElement(By.id("com.docsapp.patients:id/et_city")).isDisplayed();
						driver.findElement(By.id("com.docsapp.patients:id/et_city")).sendKeys("Testing");
						}catch (Exception e) {
							driver.pressKeyCode(AndroidKeyCode.BACK);
							Thread.sleep(2000);
							driver.findElement(By.id("com.docsapp.patients:id/et_city")).sendKeys("Testing");		
												}
					Thread.sleep(2000);
					//CLICK ON THE SAVE ADDRESS BUTTON
					driver.findElement(By.id("com.docsapp.patients:id/save_profile")).click();
					Thread.sleep(2000);
					boolean actualMessageInBuyMedTab = driver.findElement(By.id("com.docsapp.patients:id/tv_message")).isDisplayed();
					Assert.assertEquals(actualMessageInBuyMedTab, true);	
					//Click on the BackButton 
					driver.pressKeyCode(AndroidKeyCode.BACK);		
				}
			}
		
		//CHECK AGAIN
		//A REVIEW IS PENDING , plus there is a obstruction that select address tab is not shown after chat
		public void chatSupportHam(AndroidDriver<MobileElement> driver) throws Exception
		{	
			log.info("******************chatSupportHam****************");
			Thread.sleep(2000);
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON THE HAMBURGER MENU");
			driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on CHAT SUPPORT
			log.info("CLICK ON THE CHAT SUPPORT");
			driver.findElement(By.xpath("//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='7']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_call_customer_support")));
			log.info("VALIDATING THE ASSERTION");
			String ActualText = driver.findElement(By.id("com.docsapp.patients:id/button_call_customer_support")).getText();
			String ExpectedText = "Call Us";
			System.out.println(ActualText);
			System.out.println(ExpectedText);
			Assert.assertEquals(ActualText, ExpectedText);
		}
			
		//Asserion appplied on the first three more can be added
		public void whatWeTreatHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();

			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************whatWeTreatHam****************");
			//CLICK ON THE HAMBURGER MENU 
			log.info("CLICK ON THE HAMBURGER MENU");
			hamburgerMenu.HamburgerButton1().click();
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvsidebarprofileEmail")));
			//Click on WHAT WE TREAT 
			//checking gynecology
			log.info("VALIDATING THE ASSERTION");
			hamburgerMenu.WhatWeTreatButton1().click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")));
			String ActualGyneText = hamburgerMenu.GynecologyTextButton1().getText();
			String ExpectedGyneText = "Gynecology";
			System.out.println(ActualGyneText);
			System.out.println(ExpectedGyneText);
			Assert.assertEquals(ActualGyneText, ExpectedGyneText);
			//checking Pregnancy Issues
			Thread.sleep(2000);
			String ActualPregIssueText = hamburgerMenu.PregnancyIssuesTextButton1().getText();
			String ExpectedPregIssueText = "Pregnancy Issues";
			System.out.println(ActualPregIssueText);
			System.out.println(ExpectedPregIssueText);
			Assert.assertEquals(ActualPregIssueText, ExpectedPregIssueText);
			//checking Pregnancy Issues
			//Thread.sleep(2000);
			String ActualInfertelityText = hamburgerMenu.InfertilityIssuesTextButton1().getText();
			//Thread.sleep(2000);
			String ExpectedInfertilityText = "Infertility";
			System.out.println(ActualInfertelityText);
			System.out.println(ExpectedInfertilityText);
			Assert.assertEquals(ActualInfertelityText, ExpectedInfertilityText);
			//CLICK ON THE BACK BUTTON
			try {
				driver.pressKeyCode(AndroidKeyCode.BACK);
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*In this methode we are opening the Hamburger menu and going to the rating tab and providing low rating (2) */
		public void lowRatingHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();
			
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************lowRatingHam****************");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			//Click on RATE APPLICATION
			try {
				log.info("CLICK ON THE RATING");
				hamburgerMenu.RateAppButton1().isDisplayed();
				hamburgerMenu.RateAppButton1().click();
					}catch (Exception e) {
						swipe_Vertical(driver);
						hamburgerMenu.RateAppButton1().click();
											}
			Thread.sleep(2000);
			String Rating = hamburgerMenu.LowRatingButton1().getText();
			System.out.println(Rating);
			hamburgerMenu.LowRatingButton1().click();
			Thread.sleep(3000);
			hamburgerMenu.CommentBoxButton1().sendKeys("Testing");
			try {
				hamburgerMenu.SubmitButton1().isDisplayed();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					}catch (Exception e) {
						driver.hideKeyboard();
					}
			log.info("VALIDATINF THE ASSERTION");
			boolean ActualSubmitButton = hamburgerMenu.SubmitButton1().isEnabled();
			System.out.println(ActualSubmitButton);
			Assert.assertEquals(ActualSubmitButton, true);
			hamburgerMenu.SubmitButton1().click();
		}
		
		/*In this methode we are opening the Hamburger menu and going to the rating tab and providing low rating (7) */
		public void averageRatingHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
	
			log.info("******************averageRatingHam****************");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));	
			//Click on RATE APPLICATION
			try {
				log.info("CLICK ON THE RATING");
				hamburgerMenu.RateAppButton1().isDisplayed();
				hamburgerMenu.RateAppButton1().click();
					}catch (Exception e) {
						swipe_Vertical(driver);
						hamburgerMenu.RateAppButton1().click();
											}
			Thread.sleep(2000);
			String Rating = hamburgerMenu.AverageRatingButton1().getText();
			System.out.println(Rating);
			hamburgerMenu.AverageRatingButton1().click();
			Thread.sleep(3000);
			hamburgerMenu.CommentBoxButton1().sendKeys("Testing");
			try {
				hamburgerMenu.SubmitButton1().isDisplayed();
				Thread.sleep(2000);
					}catch (Exception e) {
						driver.hideKeyboard();
					}
			log.info("VALIDATING THE ASSERTION");
			boolean ActualSubmitButton = hamburgerMenu.SubmitButton1().isEnabled();
			System.out.println(ActualSubmitButton);
			Assert.assertEquals(ActualSubmitButton, true);
			hamburgerMenu.SubmitButton1().click();
		}
		
		/*In this methode we are opening the Hamburger menu and going to the rating tab and providing Highest rating (9) and validate that it is taking us to the playstore for more rating or not */
		public void highestRatingHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************highestRatingHam****************");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));	
			//Click on RATE APPLICATION
			try {
				log.info("CLICK ON THE RATING");
				hamburgerMenu.RateAppButton1().isDisplayed();
				hamburgerMenu.RateAppButton1().click();
					}catch (Exception e) {
						swipe_Vertical(driver);
						hamburgerMenu.RateAppButton1().click();
											}
			Thread.sleep(2000);
			String Rating = hamburgerMenu.HighestRecordButton1().getText();
			System.out.println(Rating);
			hamburgerMenu.HighestRecordButton1().click();
			Thread.sleep(3000);
			boolean platStoreButtonEnable = hamburgerMenu.RateOnPlatStoreButton1().isEnabled();
			System.out.println( platStoreButtonEnable);
			hamburgerMenu.RateOnPlatStoreButton1().click();
			Thread.sleep(8000);
			String ActualPLayStoreTitle = hamburgerMenu.PlayStoreTittleButton1().getText();
			System.out.println(ActualPLayStoreTitle);
			String ExpectedPlayStoretitle = "DocsApp - Consult Doctor Online 24x7 on Chat/Call" ;
			log.info("VALIDATING THE ASSERTION");
			Assert.assertEquals(ActualPLayStoreTitle, ExpectedPlayStoretitle);
		}

		
		/*In this method we are click on contact us from Hamburger menuand checking that the call us button is enabled or not*/ 
		public void contactUsHam(AndroidDriver<MobileElement> driver) throws Exception
		{
			hamburgerMenu = new HamburgerMenu();
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************contactUsHam****************");
			//CLICK ON THE HAMBURGER MENU 
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));	
			try {
				log.info("CLICK ON THE CONTACT US");
				String text = hamburgerMenu.ContactUsButton1().getText();
				System.out.println(text);
				hamburgerMenu.ContactUsButton1().isDisplayed();
				hamburgerMenu.ContactUsButton1().click();
					}catch (Exception e) {
						swipe_Vertical(driver);
						Thread.sleep(2000);
						hamburgerMenu.ContactUsButton1().click();
											}
			Thread.sleep(2000);
			boolean actualCallButtonStatus = hamburgerMenu.NumberButton1().isEnabled();
			System.out.println("call button status is 	" + actualCallButtonStatus);
			log.info("VALIDATING THE ASSERTION");
			Assert.assertEquals(actualCallButtonStatus, true);
		}
		
		/*In this method we are click on contact us from Hamburger menuand checking that the call us button is enabled or not*/ 
		public void updateApplication(AndroidDriver<MobileElement> driver) throws Exception
		{	
			hamburgerMenu = new HamburgerMenu();
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));
			
			log.info("******************updateApplication****************");
			hamburgerMenu.HamburgerButton1().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button_homescreenlabtesticon")));	
			//Click on UPDATE APPLICATION 
			try {
				log.info("CLICK ON THE UPDATE APPLICATION");
				String text = hamburgerMenu.UpdateButton1().getText();
				System.out.println(text);
				hamburgerMenu.UpdateButton1().isDisplayed();
				hamburgerMenu.UpdateButton1().click();
					}catch (Exception e) {
						swipe_Vertical(driver);
						Thread.sleep(2000);
						hamburgerMenu.UpdateButton1().click();
											}
			Thread.sleep(8000);
			log.info("VALIDATING THE ASSERTION");
			String ActualPLayStoreTitle = hamburgerMenu.PlayStoreDocsAppTittle1().getText();
			System.out.println(ActualPLayStoreTitle);
			String ExpectedPlayStoretitle = "DocsApp - Consult Doctor Online 24x7 on Chat/Call" ;	
			Assert.assertEquals(ActualPLayStoreTitle, ExpectedPlayStoretitle);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		}

		
		
		/*//This method is configured to sent email of the reports to the desired destination
		public void triggerEmail() throws Exception
		{
			  // Create the attachment
			  EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath("C:\\Users\\DocsApp\\eclipse-workspace\\projectAndroidPatient\\test-output\\PatientApp.html");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  attachment.setDescription("Sample");
			  attachment.setName("Sample1");

			  // Create the email message
			  MultiPartEmail email = new MultiPartEmail();
			  email.setSmtpPort(587);
			  email.setSSLOnConnect(true);
			  email.setHostName("smtp.gmail.com");
			  email.setAuthenticator(new DefaultAuthenticator("chouhan.ajay1777@gmail.com", "9779166234"));
			  email.addTo("chouhan.ajay1707@gmail.com", "John Doe");
			  email.setFrom("chouhan.ajay1777@gmail.com", "Me");
			  email.setSubject("The picture");
			  email.setMsg("Here is the picture you wanted");

			  // add the attachment
			  email.attach(attachment);

			  // send the email
			  email.send();
		
		}*/
		
		
	
		
		
		
		
		
		
}
