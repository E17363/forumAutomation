package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.junit.Cucumber;
import utilities.browserEngine;
import utilities.logCollector;
import utilities.testData;

@RunWith(Cucumber.class)
public class homepageValidation {
	public static WebDriver driver;
	
	  @Given("^home page of the forum web site$")
	    public void home_page_of_the_forum_web_site() throws Throwable {
		  
	   
	       driver=browserEngine.getBrowser(); 
	    }

	    @When("^user launch the home page$")
	    public void user_launch_the_home_page() throws Throwable {
	    	driver.get(testData.appurl);
	      
	    }

	    @Then("^home page is loaded$")
	    public void home_page_is_loaded() throws Throwable {
	      
	    	System.out.println("home page loaded");
	    	logCollector.debug("home page loaded");
	    }

	    @And("^Title of home page validated$")
	    public void title_of_home_page_validated() throws Throwable {
	    	String homepageetitle=">Digital Point Forum";
	    	String homepageatitle=driver.getTitle();
	    	Assert.assertEquals(homepageetitle, homepageatitle);
	    	
	       
	    }
	
	

}
