package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseUtil{
	
	private BaseUtil base;
	
	public Hooks(BaseUtil base)
	{
		this.base=base;
	}
	@Before
	public void setup()
	{
		System.out.println("*********************************************");
		System.setProperty("webdriver.chrome.driver", "DriverExecutables\\chromedriver.exe");					
	    base.driver= new ChromeDriver();
	}
	@After
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		System.out.println("##############################################");
		}
	}

}
