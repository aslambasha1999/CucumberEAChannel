package StepDefinations;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseUtil{
	
	private BaseUtil base;
	
	
	
	public LoginSteps(BaseUtil base) {
		
		this.base = base;
	}

	@Given("User should be Present on EA Website")
	public void user_should_be_present_on_ea_website() {
		
		System.out.println("User is present on EA Website");
		base.driver.get("https://demosite.executeautomation.com/Login.html");
	   
	}

	@Given("user Enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		
	List<String> user=dataTable.asList();
	
	int ucount=0;
	int ncount=0;
	for(int i=0;i<user.size();i++)
	{
		
		if(i%2==0)
		{
			++ucount;
			System.out.println("username"+ucount+" : "+user.get(i));
		
		}
		else
		{
			++ncount;
			System.out.println("password"+ncount+" : "+user.get(i));	
		}
	}
	
		
	}

	@And("User clicks login button")
	public void user_clicks_login_button() {
		
		System.out.println("User Clicked Login Button");
	    
	}
	@Then("User should be present on HomePage")
	public void user_should_be_present_on_home_page() {
		
		System.out.println("User is present on Homepage");
	    
	}


}
