package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class SelectLanguagePO extends TestBase{
	
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	@FindBy(id="text_english")
	WebElement English ;
	
	@FindBy(id="text_hindi")
	WebElement Hindi ;
	
	@FindBy(id="btn_proceed")
	WebElement agreeAndProceed ;

//******************************************************************	
	
	@FindBy(how=How.ID,using="text_english")
	private  WebElement English11;
	
	public WebElement English1()
	{
		return English;
	}
	
	@FindBy(how=How.ID,using="text_hindi")
	private  WebElement Hindi11;
	
	public WebElement Hindi1()
	{
		return Hindi11;
	}
	
	@FindBy(how=How.ID,using="btn_proceed")
	private  WebElement proceedButton;
	
	public WebElement agreeAndProceed1()
	{
		return proceedButton;
	}
	


	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public SelectLanguagePO ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
