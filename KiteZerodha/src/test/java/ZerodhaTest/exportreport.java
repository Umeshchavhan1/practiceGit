package ZerodhaTest;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import POJO.Driver;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.ExtentReport;
import Utility.XL;
import ZerodhaTest.ListenersBaseTest;

public class exportreport {
	
	public class LoginPageTest extends ListenersBaseTest {
		ExtentReports reports;
		ExtentTest test;
		
		@BeforeTest
		public void ReportsPage() {
			reports=ExtentReport.createReport();
		}
		
		@BeforeMethod
		public void OpenBrowser() {
			driver=Driver.openbrowser();
		}
		
		@Test
		
		public void LoginWithValidCredentialTest() throws EncryptedDocumentException, IOException, InterruptedException {
			test=reports.createTest("LoginWithValidCredentialTest");
			ZerodhaLoginPage login=new ZerodhaLoginPage(driver);		
			String username= XL.getdata("UM",0, 1);
			String password= XL.getdata("UM",1, 1);
			login.EnterId(username);
			login.EnterPassword(password);
			login.Enterlogin();
			Thread.sleep(2000);
			ZerodhaPinPage pinpage=new ZerodhaPinPage(driver);
			String pincode=XL.getdata("UM",2, 1);
			pinpage.EnterPin(pincode);
		}
		@Test
		public void forgotPasswordLinkTest() {
			test=reports.createTest("forgotPasswordLinkTest");
			ZerodhaLoginPage login=new ZerodhaLoginPage(driver);
			login.Enterforgot();
		}
		@Test(dependsOnMethods= {"clickOnLoginWithOutDataTest"})
		public void SignupLinkTest() {
			test=reports.createTest("SignupLinkTest");
			ZerodhaLoginPage login=new ZerodhaLoginPage(driver);
			login.EnterSignup();
		}
		@Test
		public void clickOnLoginWithOutDataTest() throws EncryptedDocumentException, IOException {
			test=reports.createTest("clickOnLoginWithOutDataTest");
			ZerodhaLoginPage login=new ZerodhaLoginPage(driver);
			login.Enterlogin();
			String text = login.getErrorText();
			
			String expectedText ="user ID Should be minium 6";
			
			SoftAssert softassert=new SoftAssert();
			softassert.assertEquals(text, expectedText);
					
			String username= XL.getdata("UM",0, 1);
			String password= XL.getdata("UM",1, 1);
			login.EnterId(username);
			login.EnterPassword(password);
			login.Enterlogin();	
			
			softassert.assertAll();
		}
		@AfterMethod
		public void closeBrowser(ITestResult result) {
			
			if(result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL, result.getName());
			}else if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
			}
			else {
				test.log(Status.SKIP,result.getName());
			}
		}
		@AfterTest
		public void flushResult() {
			reports.flush();
		}
	}

}
