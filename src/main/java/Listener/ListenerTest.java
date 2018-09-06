package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.main.util.GetScreenShot;
import com.patientApp.Base.*;



public class ListenerTest extends TestBase implements ITestListener
 {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	} 

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Inside Listner");
		String TestName = result.getMethod().getMethodName();
		System.out.println(TestName);
		try {
			GetScreenShot.CaptureScreenShot(TestName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
