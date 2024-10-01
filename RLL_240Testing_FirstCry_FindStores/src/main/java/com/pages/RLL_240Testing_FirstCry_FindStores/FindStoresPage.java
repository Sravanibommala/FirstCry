package com.pages.RLL_240Testing_FirstCry_FindStores;

//import java.util.Iterator;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FindStoresPage {
	WebDriver driver;
    
	By Stores_and_Preschool = By.xpath("//span[@class='anch'][contains(text(),'Stores & Preschools')]");
	By Find_Stores= By.xpath("//span[@class='anch'][contains(text(),'Find Stores')]");
	
	public FindStoresPage(WebDriver driver) 
	{
		this.driver=driver;
	}

//	public void Launch() 
//	{
//		driver.get("https://www.firstcry.com/");
//		driver.manage().window().maximize();
//	}

	public void clickStores_and_Preschool()
	{
		driver.findElement(Stores_and_Preschool).click();
		
	}

	public void clickFind_Stores()
	{
		driver.findElement(Find_Stores).click();
		
	}
	

//	public void selectStore_Type ()
//	{
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		driver.findElement(Store_Type).click();
//	}
//	public void clickfcry() {
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		driver.findElement(fCry).click();
//		System.out.println("Selected Store Type ");
//	}

//	public void selectState ()
//	{
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		driver.findElement(state).click();
//	}
//	public void clickAP() {
//		driver.findElement(AP).click();
//		System.out.println("selected state");
//		
//		
//	}

//	public void selectCity ()
//	{
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		driver.findElement(city).click();
//	}
//	public void clickTpt() {
//		driver.findElement(tpt).click();
//		System.out.println("selected City");
//	}
//	public void clickSearch ()
//	{
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		driver.findElement(search).click();
//		System.out.println("search function"); 
//	}

}
