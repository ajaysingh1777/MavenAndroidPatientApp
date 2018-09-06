package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class PaymentDetailsGatewayPO extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	//THIS WILL COVER THE DEBIT CARD / CREDIT CARD
	@FindBy(id="tv_card_no")
	WebElement PayWithCardButton ;
	
	@FindBy(id="edit_text_card_number")
	WebElement CardNumberButton ;
	
	@FindBy(id="edit_text_expiry")
	WebElement ExpiryDateButton ;
	
	@FindBy(id="edit_text_card_cvv")
	WebElement CvvButton ;
	
	@FindBy(id="save_card_checkbox")
	WebElement SaveCardButton ;
	
	@FindBy(id="btn_paymentCardNow")
	WebElement PayNowButton ;
	
	@FindBy(id="tv_pay_amount")
	WebElement HeaderPayableAmount ;
	
	@FindBy(id="et_cvv")
	WebElement SavedCardCVVnumber ;
	
	
	//THIS WILL COVER THE PAYTM GATEWAY
	@FindBy(xpath="//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[@text='Paytm wallet']")
	WebElement PayTMButton ;
	
	@FindBy(id="mobile_number_text")
	WebElement EnterPaytmMobNoPayTM ;
	
	@FindBy(id="otp")
	WebElement PayTMOTPField ;
	
	@FindBy(id="paytm_pay_now")
	WebElement PayTMpayNowButton ;
	
	
//*************************************************************************
	
	@FindBy(how=How.ID,using="tv_card_no")
	private  WebElement PayWithCardButton11;
	public WebElement PayWithCardButton1()
	{
		return PayWithCardButton11;
	}
	
	@FindBy(how=How.ID,using="edit_text_card_number")
	private  WebElement ExpiryDateButton11;
	public WebElement ExpiryDateButton1()
	{
		return ExpiryDateButton11;
	}
	
	@FindBy(how=How.ID,using="edit_text_card_cvv")
	private  WebElement CvvButton11;
	public WebElement CvvButton1()
	{
		return CvvButton11;
	}
	
	@FindBy(how=How.ID,using="save_card_checkbox")
	private  WebElement SaveCardButton11;
	public WebElement SaveCardButton1()
	{
		return SaveCardButton11;
	}
	
	@FindBy(how=How.ID,using="btn_paymentCardNow")
	private  WebElement PayNowButton11;
	public WebElement PayNowButton1()
	{
		return PayNowButton11;
	}
	
	@FindBy(how=How.ID,using="tv_pay_amount")
	private  WebElement HeaderPayableAmount11;
	public WebElement HeaderPayableAmount1()
	{
		return HeaderPayableAmount11;
	}
	
	@FindBy(how=How.ID,using="et_cvv")
	private  WebElement SavedCardCVVnumber11;
	public WebElement SavedCardCVVnumber1()
	{
		return SavedCardCVVnumber11;
	}
	
	//THIS WILL COVER THE PAYTM GATEWAY
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[@text='Paytm wallet']")
	private  WebElement PayTMButton11;
	public WebElement PayTMButton1()
	{
		return PayTMButton11;
	}
	
	@FindBy(how=How.ID,using="mobile_number_text")
	private  WebElement EnterPaytmMobNoPayTM11;
	public WebElement EnterPaytmMobNoPayTM1()
	{
		return EnterPaytmMobNoPayTM11;
	}
	
	@FindBy(how=How.ID,using="otp")
	private  WebElement PayTMOTPField11;
	public WebElement PayTMOTPField1()
	{
		return PayTMOTPField11;
	}
	
	@FindBy(how=How.ID,using="paytm_pay_now")
	private  WebElement PayTMpayNowButton11;
	public WebElement PayTMpayNowButton1()
	{
		return PayTMpayNowButton11;
	}
	
	@FindBy(how=How.ID,using="proceed")
	private  WebElement PayTMpayProceedButton11;
	public WebElement PayTMpayProceedButton1()
	{
		return PayTMpayProceedButton11;
	}
	
	@FindBy(how=How.ID,using="btn_epay_verify")
	private  WebElement PayTMVerifyButton11;
	public WebElement PayTMVerifyButton1()
	{
		return PayTMVerifyButton11;
	}
	
	@FindBy(how=How.ID,using="paytm_wallet_balance")
	private  WebElement PayTMWalletBalance11;
	public WebElement PayTMWalletBalance1()
	{
		return PayTMWalletBalance11;
	}
	
	//WE CAN ADD BUTTON FOR THE HOME PAGE ALSO 
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public PaymentDetailsGatewayPO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
