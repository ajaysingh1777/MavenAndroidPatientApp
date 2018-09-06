package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class OneClickSignupPO extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	
	@FindBy(id="txt_phone_no")
	WebElement MobileNumber ;
	
	@FindBy(id="txt_name")
	WebElement YourName ;
	
	@FindBy(id="btn_verify_proceed")
	WebElement agreeAndProceed ;
	
	@FindBy(id="txt_email")
	WebElement EmailId ;
	
	@FindBy(id="txt_otp")
	WebElement OtpEntryButton ;
	
	@FindBy(id="btn_verify_otp_retry")
	WebElement OtpRetryButton ;
	
	@FindBy(id="btn_verify_later")
	WebElement OtpVerifylaterButton ;
//***********************************************************	
	@FindBy(how=How.ID,using="txt_phone_no")
	private  WebElement MobileNumber11;
	public WebElement MobileNumber1()
	{
		return MobileNumber11;
	}
	
	@FindBy(how=How.ID,using="txt_name")
	private  WebElement YourName11;
	public WebElement YourName1()
	{
		return YourName11;
	}
	
	@FindBy(how=How.ID,using="btn_verify_proceed")
	private  WebElement agreeAndProceed11;
	public WebElement agreeAndProceed1()
	{
		return agreeAndProceed11;
	}
	
	@FindBy(how=How.ID,using="txt_email")
	private  WebElement EmailId11;
	public WebElement EmailId1()
	{
		return EmailId11;
	}
	
	@FindBy(how=How.ID,using="txt_otp")
	private  WebElement OtpEntryButton11;
	public WebElement OtpEntryButton1()
	{
		return OtpEntryButton11;
	}
	
	@FindBy(how=How.ID,using="btn_verify_otp_retry")
	private  WebElement OtpRetryButton11;
	public WebElement OtpRetryButton1()
	{
		return OtpRetryButton11;
	}
	
	@FindBy(how=How.ID,using="btn_verify_later")
	private  WebElement OtpVerifylaterButton11;
	public WebElement OtpVerifylaterButton1()
	{
		return OtpVerifylaterButton11;
	}
	
	
	
	
	
	//Initializing the Page Objects :
	//driver error will go away when it will extend the base class
	public OneClickSignupPO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
