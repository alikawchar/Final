package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class ExpressStepsDefinition {
	WebDriver dr;
	
@cucumber.api.java.Before	
@Given("^oprn browser$")
public void oprn_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/Users/kawcharali/Downloads/chromedriver");
	dr= new ChromeDriver();  
}

@And("^hover over signIn icon$")
public void hover_over_signIn_icon() throws Throwable {
 
}

@And("^click on sign In button$")
public void click_on_sign_In_button() throws Throwable {

}

@When("^user input valid userId$")
public void user_input_valid_userId() throws Throwable {
   
}

@When("^user input valid passWord$")
public void user_input_valid_passWord() throws Throwable {
    
}

@When("^user click login button$")
public void user_click_login_button() throws Throwable {
    
}

@Then("^user should see profilepage$")
public void user_should_see_profilepage() throws Throwable {

}

	

}
