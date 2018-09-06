package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class PaymentDetailsPagePO extends TestBase{
	
	//THIS COVER ALL THE OBJECTS FROM CONSULT A DOCTOR PAGE TO THE CREATION
	//OF THE DOCTOR CARD 
	//PAGE FACTORY ------- OBJECT REPOSITORY
	@FindBy(id="txt_doctor_name")
	WebElement DoctorName ;
	
	@FindBy(id="txt_doctor_info")
	WebElement DoctorDepartmentInfo ;
	
	@FindBy(id="txt_original_amount")
	WebElement OriginalAmount ;
	
	@FindBy(id="txt_docsapp_cash")
	WebElement WalletCash ;
	
	@FindBy(id="enter_coupon_code")
	WebElement HaveCouponButton ;
	
	@FindBy(id="btnpromocodeapply")
	WebElement CouponApplyButton ;
	
	@FindBy(id="txtPromoCode")
	WebElement CodeEnterField ;

	@FindBy(id="tv_speciality")
	WebElement SelectSpeciality ;
	
	@FindBy(id="coupon_unselect")
	WebElement CancelCouponButton ;
	
	@FindBy(id="txt_coupon_amount")
	WebElement CouponDiscountAmount ;
	
	@FindBy(id="txtpaymentnetamount")
	WebElement NetPayableAmount ;
	
	@FindBy(id="dialog_button")
	WebElement FindingBestDoctorDialogBox ;
	
	@FindBy(id="btn_proceed")
	WebElement ClickOnPayButton;
	
//*******************************************************************
	
	
	@FindBy(how=How.ID,using="txt_doctor_name")
	private  WebElement DoctorName11;
	public WebElement DoctorName1()
	{
		return DoctorName11;
	}
	
	@FindBy(how=How.ID,using="txt_doctor_info")
	private  WebElement DoctorDepartmentInfo11;
	public WebElement DoctorDepartmentInfo1()
	{
		return DoctorDepartmentInfo11;
	}
	
	@FindBy(how=How.ID,using="txt_original_amount")
	private  WebElement OriginalAmount11;
	public WebElement OriginalAmount1()
	{
		return OriginalAmount11;
	}
	
	@FindBy(how=How.ID,using="txt_docsapp_cash")
	private  WebElement WalletCash11;
	public WebElement WalletCash1()
	{
		return WalletCash11;
	}
	
	@FindBy(how=How.ID,using="enter_coupon_code")
	private  WebElement HaveCouponButton11;
	public WebElement HaveCouponButton1()
	{
		return HaveCouponButton11;
	}
	
	@FindBy(how=How.ID,using="btnpromocodeapply")
	private  WebElement CouponApplyButton11;
	public WebElement CouponApplyButton1()
	{
		return CouponApplyButton11;
	}
	
	@FindBy(how=How.ID,using="txtPromoCode")
	private  WebElement CodeEnterField11;
	public WebElement CodeEnterField1()
	{
		return CodeEnterField11;
	}
	
	@FindBy(how=How.ID,using="tv_speciality")
	private  WebElement SelectSpeciality11;
	public WebElement SelectSpeciality1()
	{
		return SelectSpeciality11;
	}
	
	@FindBy(how=How.ID,using="coupon_unselect")
	private  WebElement CancelCouponButton11;
	public WebElement CancelCouponButton1()
	{
		return CancelCouponButton11;
	}
	
	@FindBy(how=How.ID,using="txt_coupon_amount")
	private  WebElement CouponDiscountAmount11;
	public WebElement CouponDiscountAmount1()
	{
		return CouponDiscountAmount11;
	}
	
	@FindBy(how=How.ID,using="txtpaymentnetamount")
	private  WebElement NetPayableAmount11;
	public WebElement NetPayableAmount1()
	{
		return NetPayableAmount11;
	}
	
	@FindBy(how=How.ID,using="dialog_button")
	private  WebElement FindingBestDoctorDialogBox11;
	public WebElement FindingBestDoctorDialogBox1()
	{
		return FindingBestDoctorDialogBox11;
	}
	
	@FindBy(how=How.ID,using="btn_proceed")
	private  WebElement ClickOnPayButton11;
	public WebElement ClickOnPayButton1()
	{
		return ClickOnPayButton11;
	}
	
	@FindBy(how=How.ID,using="checkbox_select")
	private  WebElement WalletCheckBoxButton11;
	public WebElement WalletCheckBoxButton1()
	{
		return WalletCheckBoxButton11;
	}
	
	
	//WE CAN ADD BUTTON FOR THE HOME PAGE ALSO 
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public PaymentDetailsPagePO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
