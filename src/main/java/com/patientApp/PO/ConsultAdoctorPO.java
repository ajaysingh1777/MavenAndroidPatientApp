package com.patientApp.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.patientApp.Base.TestBase;

public class ConsultAdoctorPO extends TestBase{
	
	//THIS COVER ALL THE OBJECTS FROM CONSULT A DOCTOR PAGE TO THE CREATION
	//OF THE DOCTOR CARD AND ALSO THE PAYMENT CARD 
	//PAGE FACTORY ------- OBJECT REPOSITORY
	@FindBy(id="askq_me")
	WebElement MyselfButton ;
	
	@FindBy(id="askq_wife")
	WebElement WifeButton ;
	
	@FindBy(id="askq_husband")
	WebElement HusbandButton ;
	
	@FindBy(id="askq_father")
	WebElement FatherButton ;
	
	@FindBy(id="askq_mother")
	WebElement MotherButton ;
	
	@FindBy(id="askq_daughter")
	WebElement DaughterButton ;
	
	@FindBy(id="askq_son")
	WebElement SonButton ;
	
	@FindBy(id="askq_other")
	WebElement OthersButton ;
	
	@FindBy(id="age")
	WebElement AgeButton ;
	
	@FindBy(id="maleImage")
	WebElement MaleGenderButton ;
	
	@FindBy(id="femaleImage")
	WebElement FemaleGenderButton ;

	@FindBy(id="tv_speciality")
	WebElement SelectSpeciality ;
	
	@FindBy(xpath="//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='1']")
	WebElement GeneralMedicine ;
	
	@FindBy(id="query")
	WebElement HealthConcernTextButton ;
	
	@FindBy(id="btn_start_consultation")
	WebElement StartConsultationButton ;
	
	@FindBy(id="dialog_button")
	WebElement FindingBestDoctorDialogBox ;
	
	@FindBy(id="et_message_box")
	WebElement DoctorChatPage;
	
	@FindBy(id="btn_clickToPay")
	WebElement DocCardClickToPayButton ;
	
//*******************************************************************************
	
	
	@FindBy(how=How.ID,using="askq_me")
	private  WebElement MyselfButton11;
	public WebElement MyselfButton1()
	{
		return MyselfButton11;
	}
	
	@FindBy(how=How.ID,using="askq_wife")
	private  WebElement WifeButton11;
	public WebElement WifeButton1()
	{
		return WifeButton11;
	}
	
	@FindBy(how=How.ID,using="askq_husband")
	private  WebElement HusbandButton11;
	public WebElement HusbandButton1()
	{
		return HusbandButton11;
	}
	
	@FindBy(how=How.ID,using="askq_father")
	private  WebElement FatherButton11;
	public WebElement FatherButton1()
	{
		return FatherButton11;
	}
	
	@FindBy(how=How.ID,using="askq_mother")
	private  WebElement MotherButton11;
	public WebElement MotherButton1()
	{
		return MotherButton11;
	}
	
	@FindBy(how=How.ID,using="askq_daughter")
	private  WebElement DaughterButton11;
	public WebElement DaughterButton1()
	{
		return DaughterButton11;
	}
	
	@FindBy(how=How.ID,using="askq_son")
	private  WebElement SonButton11;
	public WebElement SonButton1()
	{
		return SonButton11;
	}
	
	@FindBy(how=How.ID,using="askq_other")
	private  WebElement OthersButton11;
	public WebElement OthersButton1()
	{
		return OthersButton11;
	}
	
	@FindBy(how=How.ID,using="age")
	private  WebElement AgeButton11;
	public WebElement AgeButton1()
	{
		return AgeButton11;
	}
	
	@FindBy(how=How.ID,using="maleImage")
	private  WebElement maleImage11;
	public WebElement maleImage1()
	{
		return maleImage11;
	}
	
	@FindBy(how=How.ID,using="femaleImage")
	private  WebElement FemaleGenderButton11;
	public WebElement FemaleGenderButton1()
	{
		return FemaleGenderButton11;
	}
	
	@FindBy(how=How.ID,using="tv_speciality")
	private  WebElement SelectSpeciality11;
	public WebElement SelectSpeciality1()
	{
		return SelectSpeciality11;
	}
	
	@FindBy(how=How.XPATH,using="//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='1']")
	private  WebElement GeneralMedicine11;
	public WebElement GeneralMedicine1()
	{
		return GeneralMedicine11;
	}
	
	@FindBy(how=How.ID,using="query")
	private  WebElement HealthConcernTextButton11;
	public WebElement HealthConcernTextButton1()
	{
		return HealthConcernTextButton11;
	}
	
	@FindBy(how=How.ID,using="layout_askQuery")
	private  WebElement StartConsultationButton11;
	public WebElement StartConsultationButton1()
	{
		return StartConsultationButton11;
	}
	
	@FindBy(how=How.ID,using="dialog_button")
	private  WebElement FindingBestDoctorDialogBox11;
	public WebElement FindingBestDoctorDialogBox1()
	{
		return FindingBestDoctorDialogBox11;
	}
	
	@FindBy(how=How.ID,using="et_message_box")
	private  WebElement DoctorChatPage11;
	public WebElement DoctorChatPage1()
	{
		return DoctorChatPage11;
	}
	
	@FindBy(how=How.ID,using="btn_clickToPay")
	private  WebElement DocCardClickToPayButton11;
	public WebElement DocCardClickToPayButton1()
	{
		return DocCardClickToPayButton11;
	}
	
	@FindBy(how=How.ID,using="iv_send")
	private  WebElement SendMessageButton11;
	public WebElement SendMessageButton1()
	{
		return SendMessageButton11;
	}
	
	
	
	
	
	
	//WE CAN ADD BUTTON FOR THE HOME PAGE ALSO 
	
	//Initializing the Page Objects :
	// driver error will go away when it will extend the base class
	public ConsultAdoctorPO ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
