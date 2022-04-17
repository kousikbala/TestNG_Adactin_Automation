package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	public WebDriver driver;
	
	
	@FindBy(xpath ="//*[@id=\"step_end\"]/span")
	private WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	private WebElement paybycheck;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/div/h3")
	private WebElement checkpayment;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confrmorder;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[1]")
	private WebElement ordercomlte;

	public Payment_page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}

	public WebElement getCheckpayment() {
		return checkpayment;
	}

	public WebElement getConfrmorder() {
		return confrmorder;
	}

	public WebElement getOrdercomlte() {
		return ordercomlte;
	}
	
	
	
	
	

}
