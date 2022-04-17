 package com.Automation_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.TakesScreenshot;


public class Base_Class  {
	
	public static WebDriver driver;  // ---->null
	private static String value;
	
	
	//browser_selection
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			
		} else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","value");
			
			driver= new FirefoxDriver();

		}
		
		  driver.manage().window().maximize();
		
		  return driver;
		
	}
	
	
	//click
	public static  void clickonElement( WebElement element) {
		
		element.click();

	}
	
	//sendkeys
	public static void userinput(WebElement element, String data) {
		
		element.sendKeys( data);
	}
	
	//page_URL
    public static void geturl(String url) {
    	driver.get(url);  	
	}
    
    //close
    public static void close() {

		driver.close();
	}

    //Quit
	public static void quit() {

		driver.quit();

	}
    
	
    //javascript_executor
	public static  void javascript( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);

	}
	
	//clear
	public static void clearelement(WebElement element ) {
		
		element.clear();
	}
	
	//dropdown
	public static void dropdown(String type, WebElement element, String Value ) {
		
		Select s = new Select (element);
		
		if (type.equalsIgnoreCase("byValue")) {
		 s.selectByValue(Value);
	  }
	   else if(type.equalsIgnoreCase("byText")){
		
		 s.selectByVisibleText(Value);
	  }
	   else if (type.equalsIgnoreCase("byIndex"))	{
		 int index = Integer.parseInt(Value);
		 s.selectByIndex(index);
	  }
	
	}
	
	//sleep
	public static void sleepmethod(long mills) throws InterruptedException  {
		Thread.sleep(mills);
		

	}
	
	//wait
	public static void implicitwait( int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	
	//data_driven
	public static String particular_Data( String path, int row_Index, int cell_Index) throws IOException {
		
		 File f = new File (path);
	     
	     FileInputStream fis = new FileInputStream(f);
	     
	     Workbook wb = new XSSFWorkbook(fis);          
	     
	     Sheet s = wb.getSheetAt(0);
	     
	     Row r = s.getRow(row_Index);
	     
	     Cell c = r.getCell(cell_Index);
	     
	     CellType celltype = c.getCellType();
	     
	     if(celltype.equals(CellType.STRING)) {
	    	 value = c.getStringCellValue();
	    	
	     }
		
	     else if (celltype.equals(CellType.NUMERIC)) {
	    	 double numericCellValue = c.getNumericCellValue();
	    	 int val = (int) numericCellValue;
	    	 
	    	value = String.valueOf(val);
	   
	}
	     
	return value;

}
	
    //frame
	public static void frames(WebElement element ) {
	
		driver.switchTo().frame(element);
	}
	public static void outerFrame(String type) {

		if (type.equalsIgnoreCase("parentFrame")) {

			driver.switchTo().parentFrame();

		} else if (type.equalsIgnoreCase("outOfFrame")) {

			driver.switchTo().defaultContent();

		}
	}


	//Screen_shot
	public static void takesScreenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
	
}
	//Actions
	public static void actions(WebElement element, String type) {

		Actions a = new Actions(driver);

		if (type.equalsIgnoreCase("singleClick")) {

			a.click(element).perform();

		} else if (type.equalsIgnoreCase("rightClick")) {

			a.contextClick(element).perform();

		} else if (type.equalsIgnoreCase("doubleClick")) {

			a.doubleClick(element).perform();

		} else if (type.equalsIgnoreCase("moveTo")) {

			a.moveToElement(element).click().perform();

		} else if (type.equalsIgnoreCase("rightClick")) {

			a.contextClick(element).perform();

		}
	}
	
    //Drag&Drop
	public static void dragDrop(WebElement element1, WebElement element2) {

		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element2);

	}	
	
	//Alert
	public static void alert(String type) {

		if (type.equalsIgnoreCase("accept")) {

			driver.switchTo().alert().accept();

		} else if (type.equalsIgnoreCase("dismiss")) {

			driver.switchTo().alert().dismiss();

		}

	}

	public static void promptAlert(String type, String inputData) {

		Alert al = driver.switchTo().alert();

		if (type.equalsIgnoreCase("accept")) {

			al.sendKeys(inputData);
			al.accept();

		}

		else if (type.equalsIgnoreCase("dismiss")) {

			al.sendKeys(inputData);
			al.dismiss();

		}

	}
	
	
	//Window_Handling
	public static void windowsHandling() throws InterruptedException {

		Set<String> str = driver.getWindowHandles();

		for (String st : str) {

			String header = driver.switchTo().window(st).getTitle();

			for (String title : str) {

				if (driver.switchTo().window(title).getTitle().equals(header)) {

					break;

				}

			}
		}

	}
	
	
	
	
}