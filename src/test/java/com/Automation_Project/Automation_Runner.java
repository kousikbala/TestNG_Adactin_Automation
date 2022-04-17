 package com.Automation_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Configuration_Helper.File_Reader_Manager;
import com.pom_manager.Page_Object_Manager_Automation;


public class Automation_Runner extends Base_Class {
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_Object_Manager_Automation pom = new Page_Object_Manager_Automation(driver);
	
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
    	
        implicitwait(5);
        
        String url = File_Reader_Manager.get_instance__FRM().get_instance_CR().get_config_url();     //SDP_method
        geturl(url);
		
		//geturl("http://automationpractice.com/index.php");    
		
		//home_page
		clickonElement(pom.get_Instance_Hp().getSignin_btn());
		
		
	    //login_page
	//	userinput(pom.get_Instance_Login().getEmail(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Automation_Testcase.xlsx", 23, 5));  //data driven method
	//  userinput(pom.get_Instance_Login().getPassword(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Automation_Testcase.xlsx", 24, 5));
	    
		String email = File_Reader_Manager.get_instance__FRM().get_instance_CR().getemail();        //SDP_method
		userinput(pom.get_Instance_Login().getEmail(), email);
		
		String password = File_Reader_Manager.get_instance__FRM().get_instance_CR().getpassword();   //SDP_method
		userinput(pom.get_Instance_Login().getPassword(), password);
		
		clickonElement(pom.get_Instance_Login().getsign_btn());
		
		
		
		//dress_types
		clickonElement(pom.get_Instance_Drs().getDresstype());
		
		clickonElement(pom.get_Instance_Drs().getEvedress());
		
		
		//dress_purchase
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

	}   