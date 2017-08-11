

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
	
	@FindBy(css = "#postcode")
	private WebElement postcode;
	
	@FindBy(css = "#searchVehiclesMake")
	private WebElement make;
	
	@FindBy(css = "#radius")
	private WebElement distance;
	
	@FindBy(css = "#searchVehiclesModel")
	private WebElement model;
	
	@FindBy(css = "#searchVehiclesPriceFrom")
	private WebElement minPrice;
	
	@FindBy(css = "#searchVehiclesPriceTo")
	private WebElement maxPrice;
	
	@FindBy(css = ".checkfieldused > label:nth-child(2)")
	private WebElement used_el;
	
	@FindBy(css = ".checkfieldbrandnew > label:nth-child(2)")
	private WebElement new_el;
	
	@FindBy(css = ".checkfieldnearlynew > label:nth-child(2)")
	private WebElement newish_el;
	
	
	public void enter_postcode(WebDriver webDriver, String input) 
	{
		postcode.sendKeys(input, Keys.ENTER);
	}
	
	public void enter_distance(WebDriver webDriver, int input){
		Select sel = new Select(distance);
		sel.selectByIndex(input);
	}
	
	public void not_new(WebDriver webDriver) 
	{
		Actions a = new Actions(webDriver);
		a.moveToElement(new_el).click().build().perform();
	}
	
	public void not_newish(WebDriver webDriver) 
	{
		Actions a = new Actions(webDriver);
		a.moveToElement(newish_el).click().build().perform();
	}
	
	public void not_used(WebDriver webDriver) 
	{
		Actions a = new Actions(webDriver);
		a.moveToElement(used_el).click().build().perform();
	}
	
	
}
