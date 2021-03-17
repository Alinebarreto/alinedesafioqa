package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseClass {
	public static WebDriver driver;
	public WebDriverWait wait;

	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		wait = new WebDriverWait(driver,15);
	}

	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
	}

	public void click(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}

	public void setText(By elementBy, String text) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}

	public void acionarEnter (By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(Keys.ENTER);
	}

	public String getText(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).getText();
	}

	public void isDisplayed(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).isDisplayed();
	}

	public boolean isEnabled(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).isEnabled();
	}

	public boolean isSelected(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).isSelected();
	}

	public boolean isChecked(By elementBy){
		if(driver.findElement(elementBy).getAttribute("checked")!= null){
			return true;
		}
		return false;
	}


}
