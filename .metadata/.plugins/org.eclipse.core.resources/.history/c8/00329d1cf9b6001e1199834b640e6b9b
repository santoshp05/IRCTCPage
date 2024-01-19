package PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class CreateUserAccountPage  extends BaseClass{
	
	@FindBy(name="Username")
	private WebElement Username;
	
	
	
	
	public CreateUserAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void personalDetailsFunactionality(String UserName) {
		
		Wait.sendKeys(Username, UserName);
	}
	
	
}
