package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RevamoPOM {
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='₹ 999']")
	private  WebElement StandardFullBodyCheckUp11;
	public WebElement StandardFullBodyCheckUp1()
	{
		return StandardFullBodyCheckUp11;
	}

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
