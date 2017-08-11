import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Auto_Login {
	@FindBy(css = "#signInSubmit")
	private WebElement submit;

	@FindBy(css = "#signin-email")
	private WebElement username;

	@FindBy(css = "#signin-email")
	private WebElement password;

	public void enter_username() {

	}

	public void enter_pass() {

	}

	public void submit() {
		submit.click();
	}
	
	public void enter_username( String input) {
		username.sendKeys(input);
	}
	
	public void enter_pass(String input) {
		password.sendKeys(input);
	}
}
