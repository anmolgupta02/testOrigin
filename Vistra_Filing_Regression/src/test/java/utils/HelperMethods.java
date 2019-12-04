package utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethods {
	
	   public void waitForPageLoad(WebDriver driver) {
	        ExpectedCondition<Boolean> readyState = (webDriver) -> ((JavascriptExecutor) webDriver)
	                .executeScript("return document.readyState").toString().equals("complete");

	        try {
	            Thread.sleep(1000);
	            WebDriverWait wait = new WebDriverWait(driver, 50);
	            wait.until(readyState);
	        } catch (Throwable error) {
	            Assert.fail("Page load timeout");
	        }
	    }
	   
	   public void clickOnElement(WebElement element) {
		   element.click();
	   }
	   
	   public void writeText(WebElement element, String text) {
		   element.clear();
		   element.sendKeys(text);
	   }
	   
	   
	   
	   
	   
	   

}
