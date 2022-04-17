package com.testNG_Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation_Project.Base_Class;
import com.Configuration_Helper.File_Reader_Manager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pom_manager.Page_Object_Manager_Automation;

public class Automation_testNG extends Base_Class {
	
	
    public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_Object_Manager_Automation pom = new Page_Object_Manager_Automation(driver);
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	public static ExtentSparkReporter spark_Reporter;
	
	@BeforeTest
	private void rport_Generation() {

		spark_Reporter = new ExtentSparkReporter("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Report\\Automation.html");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_Reporter);
	}
    	
	
    @AfterTest
    private void flush() {

    	reports.flush();
	}
	
    
    @BeforeClass
	private void browser_launch() throws Exception {
    	
    	implicitwait(5);
    	 
        String url = File_Reader_Manager.get_instance__FRM().get_instance_CR().get_config_url();     //SDP_method
        geturl(url);
		
		clickonElement(pom.get_Instance_Hp().getSignin_btn());
	}	
     
    
		
	
    @BeforeMethod
	private void login() throws Exception {

        implicitwait(5);
    	 
	    String email = File_Reader_Manager.get_instance__FRM().get_instance_CR().getemail();        //SDP_method
	    userinput(pom.get_Instance_Login().getEmail(), email);
		
	    String password = File_Reader_Manager.get_instance__FRM().get_instance_CR().getpassword();   //SDP_method
	    userinput(pom.get_Instance_Login().getPassword(), password);
		
    	clickonElement(pom.get_Instance_Login().getsign_btn()); 
     }

	//eveing_dress------------------------------------------------------------------------------------------
     @Test(priority = -1)
     private void eveining_dress() {

	
		clickonElement(pom.get_Instance_Drs().getDresstype());
		
		clickonElement(pom.get_Instance_Drs().getEvedress());
		
		
		//eve_dress_purchase
		javascript(pom.get_Instance_Drs_prs().getPrinteddrs());
		
	    clickonElement(pom.get_Instance_Drs_prs().getMore());
	    
		clearelement(pom.get_Instance_Drs_prs().getQuantity());
	
		userinput(pom.get_Instance_Drs_prs().getQuantity(), "5");
		
		clickonElement(pom.get_Instance_Drs_prs().getAddtocard());
		
		
		//checkout
	    clickonElement(pom.get_instance_Ckot().getCheckout1());
		
	    javascript(pom.get_instance_Ckot().getSummary());

		clickonElement(pom.get_instance_Ckot().getCheckout2());
		
		javascript(pom.get_instance_Ckot().getProceed());

	    clickonElement(pom.get_instance_Ckot().getCheckout3());
	
        clickonElement(pom.get_instance_Ckot().getCheckbox());
		
		clickonElement(pom.get_instance_Ckot().getCheckout4());
		
		
		//payment
		javascript(pom.get_Instance_Pymt().getPayment());
		
		clickonElement(pom.get_Instance_Pymt().getPaybycheck());
		
	    javascript(pom.get_Instance_Pymt().getCheckpayment());
	    
		clickonElement(pom.get_Instance_Pymt().getConfrmorder());
	
		javascript(pom.get_Instance_Pymt().getOrdercomlte());
		
     }
     
	 @AfterMethod	
	 
		private void signout() {
		
		clickonElement(pom.get_Instance_Hp().getSignout_btn());
	}
	 
	 
	 
	//--------------------------------------------------------------------------------------------------------------------------	
	//summer dress
		
     @Test
     private void summer_dress() {

	
		clickonElement(pom.get_instance_sda().getDress2());
		
	    clickonElement(pom.get_instance_sda().getSummrdres());
	    
	    javascript(pom.get_instance_sda().getPrintdres2());
	    
	    clickonElement(pom.get_instance_sda().getPrintdres2());
	    
	    javascript(pom.get_instance_sda().getAddtocard2());
	    
	    clearelement(pom.get_instance_sda().getQnty());
	    
	    userinput(pom.get_instance_sda().getQnty(), "4");
	    
	    clickonElement(pom.get_instance_sda().getAddtocard2());
	    
	    
	  //checkout
	    clickonElement(pom.get_instance_Ckot().getCheckout1());
		
	    javascript(pom.get_instance_Ckot().getSummary());

		clickonElement(pom.get_instance_Ckot().getCheckout2());
		
		javascript(pom.get_instance_Ckot().getProceed());

	    clickonElement(pom.get_instance_Ckot().getCheckout3());
	
        clickonElement(pom.get_instance_Ckot().getCheckbox());
		
		clickonElement(pom.get_instance_Ckot().getCheckout4());
		
		
		//payment
		javascript(pom.get_Instance_Pymt().getPayment());
		
		clickonElement(pom.get_Instance_Pymt().getPaybycheck());
		
	    javascript(pom.get_Instance_Pymt().getCheckpayment());
	    
		clickonElement(pom.get_Instance_Pymt().getConfrmorder());
	
		javascript(pom.get_Instance_Pymt().getOrdercomlte());
				
	
   }
	    
     
	//-----------------------------------------------------------------------------------------------------------------------------    
	
	//casual dress purchase
     @Test(priority = 1)
     private void casual_dress() {

    	implicitwait(5);
    	 
		clickonElement(pom.get_instance_cda().getDress3());
		
		clickonElement(pom.get_instance_cda().getCasuldrs());
		
		clickonElement(pom.get_instance_cda().getPrintdrs3());
		
		clearelement(pom.get_instance_cda().getAddqnty());
		
		userinput(pom.get_instance_cda().getAddqnty(), "4");
		
		clickonElement(pom.get_instance_cda().getAddcard());
		
		
		 //checkout
	    clickonElement(pom.get_instance_Ckot().getCheckout1());
		
	    javascript(pom.get_instance_Ckot().getSummary());

		clickonElement(pom.get_instance_Ckot().getCheckout2());
		
		javascript(pom.get_instance_Ckot().getProceed());

	    clickonElement(pom.get_instance_Ckot().getCheckout3());
	
        clickonElement(pom.get_instance_Ckot().getCheckbox());
		
		clickonElement(pom.get_instance_Ckot().getCheckout4());
		
		
		//payment
		javascript(pom.get_Instance_Pymt().getPayment());
		
		clickonElement(pom.get_Instance_Pymt().getPaybycheck());
		
	    javascript(pom.get_Instance_Pymt().getCheckpayment());
	    
		clickonElement(pom.get_Instance_Pymt().getConfrmorder());
	
		javascript(pom.get_Instance_Pymt().getOrdercomlte());
								
		
	}

	
}

