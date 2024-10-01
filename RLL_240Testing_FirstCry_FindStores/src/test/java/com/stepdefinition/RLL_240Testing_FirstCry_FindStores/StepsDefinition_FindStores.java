package com.stepdefinition.RLL_240Testing_FirstCry_FindStores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import com.pages.RLL_240Testing_FirstCry_FindStores.FindStoresPage;
//import com.pages.RLL_240Testing_FirstCry_FindStores.SelectingDataPage;
import com.pages.RLL_240Testing_FirstCry_FindStores.SelectingDataPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition_FindStores {
	WebDriver driver;
	FindStoresPage fstore;
    SelectingDataPage data;

	@Before
	public void init() {
		driver = new ChromeDriver();
		fstore = new FindStoresPage(driver);
		data = new SelectingDataPage(driver);
	}

	// @Given("The user navigates to FirstCry Home Page")
	// public void the_user_navigates_to_first_cry_home_page() throws
	// InterruptedException {
	// fstore.Launch();
	// Thread.sleep(2000);
	// }
	//
	// @When("The user clicks on login")
	// public void the_user_clicks_on_login() {
	//
	//
	// }
	//
	// @And("The user enters the email id or mobile no.")
	// public void the_user_enters_the_email_id_or_mobile_no() {
	//
	// }
	//
	// @Then("The user clicks on Continue")
	// public void the_user_clicks_on_continue() {
	//
	// }
	//
	// @And("The user enters the OTP sent to his registered email ID or mobile no")
	// public void
	// the_user_enters_the_otp_sent_to_his_registered_email_id_or_mobile_no() {
	//
	// }
	//
	// @Then("Click on Submit")
	// public void click_on_submit() {
	//
	// }
	//
	// @Then("The user should be redirected to the Home Page")
	// public void the_user_should_be_redirected_to_the_home_page() {
	//
	// }

//	@Given("The user is on Home Page")
//	public void The_user_is_on_Home_Page() throws InterruptedException {
//		fstore.Launch();
//		Thread.sleep(2000);
//	}
//
//	@When("The user clicks on StoresPreschools")
//	public void The_user_clicks_on_StoresPreschools() throws InterruptedException  {
//		fstore.clickStores_and_Preschool();
//		Thread.sleep(2000);
//		
//	}
//
//	@When("The user  click on find store button")
//	public void The_user_click_on_find_store_button() throws InterruptedException  {
//		fstore.clickFind_Stores();
//		Thread.sleep(2000);
//	
//	}
//
//	@Then("The user will be navigate to the store locator page")
//	public void The_user_will_be_navigate_to_the_store_locator_page() {
//		System.out.println("Store Locator");
//
//	}
//
//
//
//    @Given("The user opens the home page")
//    public void The_user_opens_the_home_page() throws InterruptedException {
//        fstore.Launch();
//        Thread.sleep(2000); // Wait for 2 seconds
//    }
//
//    @When("The user press on the StoresPreschools")
//    public void The_user_press_on_the_StoresPreschools() throws InterruptedException {
//    	fstore.clickStores_and_Preschool();
//        Thread.sleep(2000); // Wait for 2 seconds
//    }
//
//    @When("the user press on find stores button")
//    public void the_user_press_on_find_stores_button() throws InterruptedException {
//        fstore.clickFind_Stores();
//        Thread.sleep(2000); // Wait for 2 seconds
//    }
//
//    @When("^The user selects store (*)$")
//    public void The_user_selects_store(String StoreType) throws InterruptedException {
//    	data.selectStore_Type(StoreType);
//    	Thread.sleep(1000);	
//    }
//    @When("^The user selects state (*)$")
//    public void The_user_selects_state(String State) throws InterruptedException {
//    	data.selectState(State);
//    	Thread.sleep(1000);
//    }
//    @When("^The user selects city (*)$")
//    public void The_user_selects_city(String City) throws InterruptedException {
//    	data.selectCity(City);
//    	Thread.sleep(1000);
//    }
//    @Then("The user gets outcome based on the selection of data")
//    public void The_user_gets_outcome_based_on_the_selection_of_data() {
//    	
//    }
	
   

    @Given("The user is on Home Page")
    public void the_user_is_on_home_page() throws InterruptedException {
        driver.get("https://www.firstcry.com/"); // Replace with the actual URL
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @When("The user clicks on StoresPreschools")
    public void the_user_clicks_on_stores_preschools() throws InterruptedException {
       fstore.clickStores_and_Preschool();
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @When("The user click on find store button")
    public void the_user_click_on_find_store_button() throws InterruptedException {
        fstore.clickFind_Stores();
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @Then("The user will be navigate to the store locator page")
    public void the_user_will_be_navigate_to_the_store_locator_page() throws InterruptedException {
        // Assuming the navigation is successful if the store locator page is displayed
//        Assert.assertTrue(driver.getCurrentUrl().contains("store-locator"));
//        Thread.sleep(2000); // Wait for 2 seconds
    }

    
    @Given("The user opens the home page")
    public void the_user_opens_the_home_page() throws InterruptedException {
        driver.get("https://www.firstcry.com/"); // Replace with the actual URL
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @When("The user presses on the StoresPreschools")
    public void the_user_presses_on_the_stores_preschools() throws InterruptedException {
        fstore.clickStores_and_Preschool();
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @And("The user presses on find stores button")
    public void the_user_presses_on_find_stores_button() throws InterruptedException {
       fstore.clickFind_Stores();
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @And("The user selects store {string}")
    public void the_user_selects_store(String storeType) throws InterruptedException {
        data.selectStore_Type(storeType);
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @And("The user selects state {string}")
    public void the_user_selects_state(String state) throws InterruptedException {
        data.selectState(state);
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @And("The user selects city {string}")
    public void the_user_selects_city(String city) throws InterruptedException {
        data.selectCity(city);
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @Then("The user gets outcome based on the selection of data")
    public void the_user_gets_outcome_based_on_the_selection_of_data(String expectedResult) throws InterruptedException {
        // Add code to verify the outcome based on the expected result
//        String actualResult = driver.findElement(By.id("result")).getText(); // Replace with the actual result element
//        Assert.assertEquals(actualResult, expectedResult);
//        Thread.sleep(2000); // Wait for 2 seconds
    }

	
}


