package com.pages.RLL_240Testing_FirstCry_FindStores;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectingDataPage {
	WebDriver driver;
	
	By Store_Type = By.xpath("//select[@id='storetype']");
	By state = By.xpath("//select[@name='state']");
	By city = By.xpath("//select[@name='city']");
	By search = By.xpath("(//input[@type=\"button\"])[1]");
	
	public SelectingDataPage(WebDriver driver) 
	{
		this.driver=driver;
	}
//
//	public void Launch() 
//	{
//		driver.get("https://www.firstcry.com/");
//		driver.manage().window().maximize();
//	}
	public void selectStore_Type(String StoreType)
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator <String> it= windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(Store_Type).click();
		driver.findElement(Store_Type).sendKeys(StoreType);
	}
	public void selectState(String State)
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator <String> it= windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(state).click();
		driver.findElement(state).sendKeys(State);
	}
	public void selectCity(String City)
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator <String> it= windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(city).click();
		driver.findElement(city).sendKeys(City);
	}
	public void clickSearch ()
	{
	Set<String> windows=driver.getWindowHandles();
	Iterator <String> it= windows.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	driver.findElement(search).click();
	System.out.println("search function"); 
}
}
