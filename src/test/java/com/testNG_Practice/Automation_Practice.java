package com.testNG_Practice;

import com.Automation_Project.Base_Class;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.Configuration_Helper.File_Reader_Manager;
import com.pom_manager.Page_Object_Manager_Automation;

public class Automation_Practice extends Base_Class{
	
public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_Object_Manager_Automation pom = new Page_Object_Manager_Automation(driver);
	
   public static void main(String[] args) throws InterruptedException, AWTException, IOException {
    	
        implicitwait(5);
        
        String url = File_Reader_Manager.get_instance__FRM().get_instance_CR().get_config_url();     //SDP_method
        geturl(url);
		
		    
		
		//home_page
        
		clickonElement(pom.get_Instance_Hp().getSignin_btn());
				
		
	    //login_page
		String email = File_Reader_Manager.get_instance__FRM().get_instance_CR().getemail();        //SDP_method
		userinput(pom.get_Instance_Login().getEmail(), email);
		
		String password = File_Reader_Manager.get_instance__FRM().get_instance_CR().getpassword();   //SDP_method
		userinput(pom.get_Instance_Login().getPassword(), password);
		
		clickonElement(pom.get_Instance_Login().getsign_btn());
		
		
		//eveing_dress
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
				
		clickonElement(pom.get_Instance_Hp().getSignout_btn());
		
		
		
	//--------------------------------------------------------------------------------------------------------------------------	
		//summer dress
		
		//login
		clickonElement(pom.get_Instance_Hp().getSignin_btn());
		
		String email2 = File_Reader_Manager.get_instance__FRM().get_instance_CR().getemail();        //SDP_method
		userinput(pom.get_Instance_Login().getEmail(), email2);
		
		String password2 = File_Reader_Manager.get_instance__FRM().get_instance_CR().getpassword();   //SDP_method
		userinput(pom.get_Instance_Login().getPassword(), password2);
		
		clickonElement(pom.get_Instance_Login().getsign_btn());
		
		
		
		//summerdress purchase
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
				
		clickonElement(pom.get_Instance_Hp().getSignout_btn());
		
	    
	//-----------------------------------------------------------------------------------------------------------------------------    
		//casual dress
		
		
		//login
		clickonElement(pom.get_Instance_Hp().getSignin_btn());
				
		String email3 = File_Reader_Manager.get_instance__FRM().get_instance_CR().getemail();        //SDP_method
		userinput(pom.get_Instance_Login().getEmail(), email3);
				
		String password3 = File_Reader_Manager.get_instance__FRM().get_instance_CR().getpassword();   //SDP_method
		userinput(pom.get_Instance_Login().getPassword(), password3);
				
		clickonElement(pom.get_Instance_Login().getsign_btn());
		
		
		//casual dress purchase
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
				
		clickonElement(pom.get_Instance_Hp().getSignout_btn());				
		
		
	}

	


}
