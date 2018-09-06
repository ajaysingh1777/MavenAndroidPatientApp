package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class HamburgerMenu extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")
	WebElement HamburgerButton ;
	
	//COVERING  MY PROFILE PAGE
	
	@FindBy(id="tvsidebarprofileEmail")
	WebElement MyProfileButton ;
	
	@FindBy(id="tvUserId")
	WebElement UserID ;
	
	@FindBy(id="medical_record_button")
	WebElement ProfileMedicalRecords ;
	
	@FindBy(id="etFullName")
	WebElement ProfileFullName ;
	
	@FindBy(id="etPhoneNumber")
	WebElement ProfilePhoneNumber ;
	
	@FindBy(id="etEmailAddress")
	WebElement ProfileEmailAddress ;
	
	@FindBy(id="etAge")
	WebElement ProfileAge ;
	
	@FindBy(id="tvGender")
	WebElement ProfileGender ;
	
	@FindBy(id="buttonGenderEdit")
	WebElement ProfileGenderChangerButton ;
	
	@FindBy(xpath="//android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[@index='0']")
	WebElement ProfileSaveButton ;
	
	//DocsApp Refer And Earn Page
	@FindBy(xpath="@FindBy(id=\"buttonGenderEdit\")\r\n" + 
			"	WebElement ProfileGenderChangerButton ;")
	WebElement ReferAndEarButton ;
	
	//DocsApp Change Language Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='3']")
	WebElement ChangeLanguageButton ;
	
	@FindBy(id="text_hindi")
	WebElement HindiHamButton ;
	
	@FindBy(id="text_english")
	WebElement EnglishHamButton ;
	
	@FindBy(id="btn_proceed")
	WebElement SaveButton ;
	
	
	//DocsApp Chat Support Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='4']")
	WebElement MyMedicalRecordButton ;
		
	@FindBy(id="add_record_button")
	WebElement AddARecordButton ;
		
	@FindBy(id="txtVw_uploadFromCamera")
	WebElement ClickOnCameraButton ;
		
	@FindBy(id="txtVw_uploadFromGallery")
	WebElement UploadFromGallery ;
	
	@FindBy(id="txtVw_uploadFromFiles")
	WebElement UploadFromPDF ;
	
	@FindBy(id="com.android.camera:id/v6_shutter_button_internal")
	WebElement CameraShutterButton ;
	
	@FindBy(id="com.android.camera:id/v6_btn_done")
	WebElement CameraTickButton ;
	
	@FindBy(id="upload_record_text")
	WebElement UploadRecordButton ;
	
	//DocsApp Contact Us  Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='7']")
	WebElement ChatSupportButton ;
		
	@FindBy(id="button_call_customer_support")
	WebElement CallUsButton ;
	
	//DocsApp What We Treat Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='8']")
	WebElement WhatWeTreatButton ;
		
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	WebElement GynecologyTextButton ;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	WebElement PregnancyIssuesTextButton ;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='2']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	WebElement InfertilityIssuesTextButton ;
	
	//DocsApp Rate Application Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='10']")
	WebElement RateAppButton ;
	
	@FindBy(xpath="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='2']")
	WebElement LowRatingButton ;
	
	@FindBy(xpath="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='7']")
	WebElement AverageRatingButton ;
	
	@FindBy(xpath="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='10']")
	WebElement HighestRecordButton ;
	
	@FindBy(id="txt_comments")
	WebElement CommentBoxButton ;
	
	@FindBy(id="btn_submit")
	WebElement SubmitButton ;
	
	//DocsApp Contact Us Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Contact Us']")
	WebElement ContactUsButton ;
	
	@FindBy(id="btn_contactus_call")
	WebElement NumberButton ;
	
	//DocsApp Update Page
	@FindBy(xpath="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Update']")
	WebElement UpdateButton ;
	
	@FindBy(id="com.android.vending:id/title_title")
	WebElement PlayStoreDocsAppTittle ;

// **********************************************************************************
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")
	private  WebElement HamburgerButton11;
	public WebElement HamburgerButton1()
	{
		return HamburgerButton11;
	}
	
	@FindBy(how=How.ID,using="tvsidebarprofileEmail")
	private  WebElement MyProfileButton11;
	public WebElement MyProfileButton1()
	{
		return MyProfileButton11;
	}
	
	@FindBy(how=How.ID,using="tvUserId")
	private  WebElement UserID11;
	public WebElement UserID1()
	{
		return UserID11;
	}
	
	@FindBy(how=How.ID,using="medical_record_button")
	private  WebElement ProfileMedicalRecords11;
	public WebElement ProfileMedicalRecords1()
	{
		return ProfileMedicalRecords11;
	}
	
	@FindBy(how=How.ID,using="etFullName")
	private  WebElement ProfileFullName11;
	public WebElement ProfileFullName1()
	{
		return ProfileFullName11;
	}
	
	@FindBy(how=How.ID,using="etPhoneNumber")
	private  WebElement ProfilePhoneNumber11;
	public WebElement ProfilePhoneNumber1()
	{
		return ProfilePhoneNumber11;
	}
	
	@FindBy(how=How.ID,using="etEmailAddress")
	private  WebElement ProfileEmailAddress11;
	public WebElement ProfileEmailAddress1()
	{
		return ProfileEmailAddress11;
	}
	
	@FindBy(how=How.ID,using="etAge")
	private  WebElement ProfileAge11;
	public WebElement ProfileAge1()
	{
		return ProfileAge11;
	}
	
	@FindBy(how=How.ID,using="tvGender")
	private  WebElement ProfileGender11;
	public WebElement ProfileGender1()
	{
		return ProfileGender11;
	}
	
	@FindBy(how=How.ID,using="buttonGenderEdit")
	private  WebElement ProfileGenderChangerButton11;
	public WebElement ProfileGenderChangerButton1()
	{
		return ProfileGenderChangerButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[@index='0']")
	private  WebElement ProfileSaveButton11;
	public WebElement ProfileSaveButton1()
	{
		return ProfileSaveButton11;
	}
	
	@FindBy(how=How.XPATH,using="@FindBy(id=\\\"buttonGenderEdit\\\")\\r\\n\" + \r\n" + 
			"			\"	WebElement ProfileGenderChangerButton ;")
	private  WebElement ReferAndEarButton11;
	public WebElement ReferAndEarButton1()
	{
		return ReferAndEarButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='3']")
	private  WebElement ChangeLanguageButton11;
	public WebElement ChangeLanguageButton1()
	{
		return ChangeLanguageButton11;
	}
	
	@FindBy(how=How.ID,using="text_english")
	private  WebElement EnglishHamButton11;
	public WebElement EnglishHamButton1()
	{
		return EnglishHamButton11;
	}
	
	@FindBy(how=How.ID,using="btn_proceed")
	private  WebElement SaveButton11;
	public WebElement SaveButton1()
	{
		return SaveButton11;
	}
	
	//DocsApp Chat Support Page
	
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='4']")
	private  WebElement MyMedicalRecordButton11;
	public WebElement MyMedicalRecordButton1()
	{
		return MyMedicalRecordButton11;
	}
	
	@FindBy(how=How.ID,using="add_record_button")
	private  WebElement AddARecordButton11;
	public WebElement AddARecordButton1()
	{
		return AddARecordButton11;
	}
	
	@FindBy(how=How.ID,using="txtVw_uploadFromCamera")
	private  WebElement ClickOnCameraButton11;
	public WebElement ClickOnCameraButton1()
	{
		return ClickOnCameraButton11;
	}
	
	@FindBy(how=How.ID,using="txtVw_uploadFromGallery")
	private  WebElement UploadFromGallery11;
	public WebElement UploadFromGallery1()
	{
		return UploadFromGallery11;
	}
	
	@FindBy(how=How.ID,using="txtVw_uploadFromFiles")
	private  WebElement UploadFromPDF11;
	public WebElement UploadFromPDF1()
	{
		return UploadFromPDF11;
	}
	
	@FindBy(how=How.ID,using="com.android.camera:id/v6_shutter_button_internal")
	private  WebElement CameraShutterButton11;
	public WebElement CameraShutterButton1()
	{
		return CameraShutterButton11;
	}
	
	@FindBy(how=How.ID,using="com.android.camera:id/v6_btn_done")
	private  WebElement CameraTickButton11;
	public WebElement CameraTickButton1()
	{
		return CameraTickButton11;
	}
	
	@FindBy(how=How.ID,using="upload_record_text")
	private  WebElement UploadRecordButton11;
	public WebElement UploadRecordButton1()
	{
		return UploadRecordButton11;
	}
	
	
	//DocsApp Contact Us  Page
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='7']")
	private  WebElement ChatSupportButton11;
	public WebElement ChatSupportButton1()
	{
		return ChatSupportButton11;
	}
	
	@FindBy(how=How.ID,using="button_call_customer_support")
	private  WebElement CallUsButton11;
	public WebElement CallUsButton1()
	{
		return CallUsButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='8']")
	private  WebElement WhatWeTreatButton11;
	public WebElement WhatWeTreatButton1()
	{
		return WhatWeTreatButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	private  WebElement GynecologyTextButton11;
	public WebElement GynecologyTextButton1()
	{
		return GynecologyTextButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	private  WebElement PregnancyIssuesTextButton11;
	public WebElement PregnancyIssuesTextButton1()
	{
		return PregnancyIssuesTextButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout[@index='2']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
	private  WebElement InfertilityIssuesTextButton11;
	public WebElement InfertilityIssuesTextButton1()
	{
		return InfertilityIssuesTextButton11;
	}
	
	//DocsApp Rate Application Page
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='10']")
	private  WebElement RateAppButton11;
	public WebElement RateAppButton1()
	{
		return RateAppButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='2']")
	private  WebElement LowRatingButton11;
	public WebElement LowRatingButton1()
	{
		return LowRatingButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='7']")
	private  WebElement AverageRatingButton11;
	public WebElement AverageRatingButton1()
	{
		return AverageRatingButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='10']")
	private  WebElement HighestRecordButton11;
	public WebElement HighestRecordButton1()
	{
		return HighestRecordButton11;
	}
	
	@FindBy(how=How.ID,using="txt_comments")
	private  WebElement CommentBoxButton11;
	public WebElement CommentBoxButton1()
	{
		return CommentBoxButton11;
	}
	
	@FindBy(how=How.ID,using="btn_submit")
	private  WebElement SubmitButton11;
	public WebElement SubmitButton1()
	{
		return SubmitButton11;
	}
	
	@FindBy(how=How.ID,using="btn_rate_in_play_store_rate")
	private  WebElement RateOnPlatStoreButton11;
	public WebElement RateOnPlatStoreButton1()
	{
		return RateOnPlatStoreButton11;
	}
	
	@FindBy(how=How.ID,using="title_title")
	private  WebElement PlayStoreTittleButton11;
	public WebElement PlayStoreTittleButton1()
	{
		return PlayStoreTittleButton11;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Contact Us']")
	private  WebElement ContactUsButton11;
	public WebElement ContactUsButton1()
	{
		return ContactUsButton11;
	}
	
	@FindBy(how=How.ID,using="btn_contactus_call")
	private  WebElement NumberButton11;
	public WebElement NumberButton1()
	{
		return NumberButton11;
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Update']")
	private  WebElement UpdateButton11;
	public WebElement UpdateButton1()
	{
		return UpdateButton11;
	}
	
	@FindBy(how=How.ID,using="com.android.vending:id/title_title")
	private  WebElement PlayStoreDocsAppTittle11;
	public WebElement PlayStoreDocsAppTittle1()
	{
		return PlayStoreDocsAppTittle11;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public HamburgerMenu ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
