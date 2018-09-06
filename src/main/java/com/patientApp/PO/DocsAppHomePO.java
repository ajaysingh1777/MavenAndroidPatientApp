package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class DocsAppHomePO extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")
	WebElement HamburgerButton ;
	
	@FindBy(id="shareTop")
	WebElement RupeeButton ;
	
	@FindBy(id="linear_ask_query")
	WebElement TalkToDoctorButton ;
	
	@FindBy(id="button_homescreenlabtesticon")
	WebElement LabTestButton ;
	
	@FindBy(id="button_homescreentabproductsicon")
	WebElement StoreButton ;
	
	@FindBy(id="button_homescreentabmedicinesicon")
	WebElement MedicineButton ;
	
	@FindBy(id="button_homescreentabselfHelpicon")
	WebElement SelfCareButton ;
	
	@FindBy(id="helpChat")
	WebElement HelpChatButton ;
	
//*********************************************************
	
	
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton[@index='0']")
	private  WebElement HamburgerButton11;
	public WebElement HamburgerButton1()
	{
		return HamburgerButton11;
	}
	
	
	@FindBy(how=How.ID,using="shareTop")
	private  WebElement RupeeButton11;
	public WebElement RupeeButton1()
	{
		return RupeeButton11;
	}
	
	@FindBy(how=How.ID,using="linear_ask_query")
	private  WebElement TalkToDoctorButton11;
	public WebElement TalkToDoctorButton1()
	{
		return TalkToDoctorButton11;
	}
	@FindBy(how=How.ID,using="button_homescreenlabtesticon")
	private  WebElement LabTestButton11;
	public WebElement LabTestButton1()
	{
		return LabTestButton11;
	}
	
	@FindBy(how=How.ID,using="layout_homescreentabproductsicon")
	private  WebElement StoreButton11;
	public WebElement StoreButton1()
	{
		return StoreButton11;
	}
	
	@FindBy(how=How.ID,using="button_homescreentabmedicinesicon")
	private  WebElement MedicineButton11;
	public WebElement MedicineButton1()
	{
		return MedicineButton11;
	}
	
	@FindBy(how=How.ID,using="button_homescreentabselfHelpicon")
	private  WebElement SelfCareButton11;
	public WebElement SelfCareButton1()
	{
		return SelfCareButton11;
	}
	
	@FindBy(how=How.ID,using="helpChat")
	private  WebElement HelpChatButton11;
	public WebElement HelpChatButton1()
	{
		return HelpChatButton11;
	}
	
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public DocsAppHomePO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
