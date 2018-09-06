package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;



public class LabPackagePO extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	
	
//***********************************************************************
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='₹ 600']")
	private  WebElement StandardFullBodyCheckUp11;
	public WebElement StandardFullBodyCheckUp1()
	{
		return StandardFullBodyCheckUp11;
	}
	
	@FindBy(how=How.ID,using="menu_help")
	private  WebElement HELPbutton11;
	public WebElement HELPbutton1()
	{
		return HELPbutton11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_detail_got_questions")
	private  WebElement GotQuestionsButton11;
	public WebElement GotQuestionsButton1()
	{
		return GotQuestionsButton11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_nos_tests")
	private  WebElement NoOfLabTests11;
	public WebElement NoOfLabTests1()
	{
		return NoOfLabTests11;
	}
	
	@FindBy(how=How.ID,using="txt_lps_detail_original_price")
	private  WebElement PackageOriginalPrice11;
	public WebElement PackageOriginalPrice1()
	{
		return PackageOriginalPrice11;
	}
	
	@FindBy(how=How.ID,using="txt_lps_detail_price")
	private  WebElement PackageDiscountPrice11;
	public WebElement PackageDiscountPrice1()
	{
		return PackageDiscountPrice11;
	}
	
	@FindBy(how=How.ID,using="txt_lps_detail_discount")
	private  WebElement PercentageDiscount11;
	public WebElement PercentageDiscount1()
	{
		return PercentageDiscount11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_detail_desc")
	private  WebElement PackageDescription11;
	public WebElement PackageDescription1()
	{
		return PackageDescription11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_detail_book")
	private  WebElement BookNowButton11;
	public WebElement BookNowButton1()
	{
		return BookNowButton11;
	}
	
	@FindBy(how=How.ID,using="img_lpd_change_date")
	private  WebElement ChangeDate11;
	public WebElement ChangeDate1()
	{
		return ChangeDate11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_time2")
	private  WebElement FirstTimeSlot11;
	public WebElement FirstTimeSlot1()
	{
		return FirstTimeSlot11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_time3")
	private  WebElement SecondTimeSlot11;
	public WebElement SecondTimeSlot1()
	{
		return SecondTimeSlot11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_time4")
	private  WebElement ThirdTimeSlot11;
	public WebElement ThirdTimeSlot1()
	{
		return ThirdTimeSlot11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_date_time_cta")
	private  WebElement SelectAddressButton11;
	public WebElement SelectAddressButton1()
	{
		return SelectAddressButton11;
	}
	
	@FindBy(how=How.ID,using="address_add_layout")
	private  WebElement AddNewAddress11;
	public WebElement AddNewAddress1()
	{
		return AddNewAddress11;
	}
	
	@FindBy(how=How.ID,using="address_pincode_et")
	private  WebElement EnterPincode11;
	public WebElement EnterPincode1()
	{
		return EnterPincode11;
	}
	
	@FindBy(how=How.ID,using="address_line_1_et")
	private  WebElement EnterAddressLine111;
	public WebElement EnterAddressLine11()
	{
		return EnterAddressLine111;
	}
	
	@FindBy(how=How.ID,using="address_line_2_et")
	private  WebElement EnterAddressLine211;
	public WebElement EnterAddressLine21()
	{
		return EnterAddressLine211;
	}
	
	@FindBy(how=How.ID,using="address_landmark_et")
	private  WebElement LandMark11;
	public WebElement LandMark1()
	{
		return LandMark11;
	}
	
	@FindBy(how=How.ID,using="et_city")
	private  WebElement EnterCityName11;
	public WebElement EnterCityName1()
	{
		return EnterCityName11;
	}
	
	@FindBy(how=How.ID,using="address_mobile_et")
	private  WebElement EnterMobileNumber11;
	public WebElement EnterMobileNumber1()
	{
		return EnterMobileNumber11;
	}
	
	@FindBy(how=How.ID,using="save_profile")
	private  WebElement SaveProfileButton11;
	public WebElement SaveProfileButton1()
	{
		return SaveProfileButton11;
	}
	
	@FindBy(how=How.ID,using="deliver_here")
	private  WebElement DeliverHereButton11;
	public WebElement DeliverHereButton1()
	{
		return DeliverHereButton11;
	}
	
	//CONFIRM ORDER PAGE 
	
	@FindBy(how=How.ID,using="txt_lpd_confirm_price")
	private  WebElement ConfirmOrderPackagePrice11;
	public WebElement ConfirmOrderPackagePrice1()
	{
		return ConfirmOrderPackagePrice11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_confirm_original_price")
	private  WebElement ConfirmOrderPackageOriginalPrice11;
	public WebElement ConfirmOrderPackageOriginalPrice1()
	{
		return ConfirmOrderPackageOriginalPrice11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_confirm_discount")
	private  WebElement ConfirmOrderPackageDiscountPercent11;
	public WebElement ConfirmOrderPackageDiscountPercent1()
	{
		return ConfirmOrderPackageDiscountPercent11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_confirm_change_address")
	private  WebElement ConfirmOrderChangeAddress11;
	public WebElement ConfirmOrderChangeAddress1()
	{
		return ConfirmOrderChangeAddress11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_confirm_change_date_time")
	private  WebElement ConfirmOrderChangeDate11;
	public WebElement ConfirmOrderChangeDate1()
	{
		return ConfirmOrderChangeDate11;
	}
	
	@FindBy(how=How.ID,using="radiobtn_lpd_confirm_payment_cod")
	private  WebElement ConfirmOrderCashOnDeliveryButton11;
	public WebElement ConfirmOrderCashOnDeliveryButton11()
	{
		return ConfirmOrderCashOnDeliveryButton11;
	}
	
	@FindBy(how=How.ID,using="txt_cpd_confirm_pay_now")
	private  WebElement PayNowConfirmOrderButton11;
	public WebElement PayNowConfirmOrderButton1()
	{
		return PayNowConfirmOrderButton11;
	}
	
	
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public LabPackagePO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}