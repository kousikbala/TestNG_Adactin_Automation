package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dress_Automation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress2;
	
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
	private WebElement summrdres;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")              
	private WebElement printdres2;
	
	@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")                
	private WebElement qnty;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addtocard2;

	
   public Summer_Dress_Automation (WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
   }
	

	public WebElement getDress2() {
		return dress2;
	}

	public WebElement getSummrdres() {
		return summrdres;
	}

	public WebElement getPrintdres2() {
		return printdres2;
	}

	public WebElement getQnty() {
		return qnty;
	}

	public WebElement getAddtocard2() {
		return addtocard2;
	}
	
	
	

}
