package com.Automation_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Configuration_Helper.File_Reader_Manager_Adactin;
import com.pom_manager.Page_Object_Manager_Adactin;

public class Adactin_Runner extends Base_Class{
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_Object_Manager_Adactin pom = new Page_Object_Manager_Adactin(driver);
	
	public static Logger log = Logger.getLogger(Adactin_Runner.class);
	
	
	
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException {  
	
	
	  PropertyConfigurator.configure("log4j.properties");
	  
	  log.info("url launch");
	  
	  String url = File_Reader_Manager_Adactin.get_instance_FRM().get_instance_CR().get_config_url();    //SDP method
	  geturl(url);
	
	  // geturl("http://adactinhotelapp.com/index.php");
	   
	   
	   
	   //login_page
//	   userinput(pom.get_Instance_Lp().getUsername(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 1, 5));    // datadriven method
//	   
//	   userinput(pom.get_Instance_Lp().getPassword(),particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 2, 5));
	  
	   String username = File_Reader_Manager_Adactin.get_instance_FRM().get_instance_CR().get_config_username();    //SDP method
	   userinput(pom.get_Instance_Lp().getUsername(), username);
	  
	   String passwor = File_Reader_Manager_Adactin.get_instance_FRM().get_instance_CR().get_confing_passwor();     //SDP method
	   userinput(pom.get_Instance_Lp().getPassword(), passwor);
	  
	  
	   clickonElement(pom.get_Instance_Lp().getLogin());
	
	   log.info("url credential entered ");
	   sleepmethod(3000);
	   
	   
	   //homepage
	   dropdown("byText", pom.get_Instance_Hp().getLocaion(), "London");
	   
	   //dropdown("byIndex", pom.get_Instance_Hp().getHotels(), "3");
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getRoomtype(), "3");
	   
	   dropdown("byIndex",pom.get_Instance_Hp().getNoof_room(), "4");
	   
	   clearelement(pom.get_Instance_Hp().getCheckin());
	   
	   userinput(pom.get_Instance_Hp().getCheckin(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 7, 5));
	   
	   clearelement(pom.get_Instance_Hp().getCheckout());
	   
	   userinput(pom.get_Instance_Hp().getCheckout(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 8, 5));
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getAdults(),"3");
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getChild(), "1");
	   
	   sleepmethod(3000);
	   
	   clickonElement(pom.get_Instance_Hp().getSearch());
	   
	   
	   //select_hotel
	   clickonElement(pom.get_Instance_Hs().getSelect1());
	   
	   clickonElement(pom.get_Instance_Hs().getContinue1());
	   
	   
	   //book_hotel
	   userinput(pom.get_Instance_Bk().getFirstname(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 14, 5));
	   
	   userinput(pom.get_Instance_Bk().getLastname(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 15, 5));
	   
	   userinput(pom.get_Instance_Bk().getBiladd(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 16, 5));
	   
	   userinput(pom.get_Instance_Bk().getCardno(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 17, 5));
	   
	   dropdown("byIndex", pom.get_Instance_Bk().getCardtype(), "3");
	   
	   dropdown("ByText", pom.get_Instance_Bk().getExpairmth(), "June");
	   
	   dropdown("byText", pom.get_Instance_Bk().getExpairyr(), "2022");
	   
	   userinput(pom.get_Instance_Bk().getCvv(), particular_Data("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Adactin Test case.xlsx", 20, 5));
	   
	   sleepmethod(9000);
	   
	   clickonElement(pom.get_Instance_Bk().getBooknow());
	   
	   sleepmethod(9000);
	   
	   clickonElement(pom.get_Instance_Bk().getMyiti());
	   
	
  }
	
}