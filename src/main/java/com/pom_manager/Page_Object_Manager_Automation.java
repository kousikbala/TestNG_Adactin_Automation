package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.pom.Casual_Dress_Automation;
import com.pom.Checkout_page_Automation;
import com.pom.Dress_Purchase_Automation;
import com.pom.Dresses_Automation;
import com.pom.Home_Page_Automation;
import com.pom.Login_page_Automation;
import com.pom.Payment_page;
import com.pom.Summer_Dress_Automation;

public class Page_Object_Manager_Automation {
	
	public WebDriver driver;
	
	private Home_Page_Automation hp;
	
	private Login_page_Automation login;
	
	private Dresses_Automation drs;
	
	private Checkout_page_Automation ckot;
	
	private Dress_Purchase_Automation drs_prs;
	
	private Payment_page pymt;
	
	private Summer_Dress_Automation sda;
	
	private Casual_Dress_Automation cda;
	
	
	
	public Page_Object_Manager_Automation(WebDriver driver2) {
		this.driver = driver2;
	}


	public Home_Page_Automation get_Instance_Hp() {
		
		if (hp== null) {
			hp = new Home_Page_Automation (driver);
		
		}
		return hp;	
	}
	
	public Login_page_Automation get_Instance_Login() {
		if(login== null) {
			login = new Login_page_Automation (driver);
		}
		return login;
	}
	
	public Dresses_Automation get_Instance_Drs() {
		if (drs == null) {
			drs = new Dresses_Automation(driver);
		}
		return drs;
	}
	
	public Checkout_page_Automation get_instance_Ckot() {
		if (ckot == null) {
			ckot = new Checkout_page_Automation (driver);
			
		}
		return ckot;
	}
	
	public Dress_Purchase_Automation get_Instance_Drs_prs() {
		if (drs_prs == null) {
			drs_prs = new Dress_Purchase_Automation (driver);
		}
		return drs_prs;
	}
	
	public Payment_page get_Instance_Pymt() {
		if (pymt == null) {
			pymt = new Payment_page (driver);
		}
		return pymt;
	}
	
	 public Casual_Dress_Automation get_instance_cda() {
		if (cda == null) {
			cda = new Casual_Dress_Automation (driver);
		}
        return cda;
	}
	
	public Summer_Dress_Automation get_instance_sda() {
		if (sda == null) {
		sda = new Summer_Dress_Automation (driver);

	}
	  return sda;
	}
	
	
	
}
