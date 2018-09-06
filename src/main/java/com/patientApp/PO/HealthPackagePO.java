package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class HealthPackagePO extends TestBase {
	
	//PAGE FACTORY ------- OBJECT REPOSITORY
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='DocsApp Gold Basic']")
	private  WebElement CompleteCareUnlimitedpackage11;
	public WebElement DocsAppGoldBasic()
	{
		return CompleteCareUnlimitedpackage11;
	}
	
	@FindBy(how=How.ID,using="txt_lpd_detail_book")
	private  WebElement BookNowbutton11;
	public WebElement BookNowbutton1()
	{
		return BookNowbutton11;
	}
	
	@FindBy(how=How.ID,using="btn_proceed")
	private  WebElement ClickToPay11;
	public WebElement ClickToPay1()
	{
		return ClickToPay11;
	}
	
	public HealthPackagePO ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
