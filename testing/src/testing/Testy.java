package testing;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testy {
	private WebDriver webDriver;

	@After
	public void aftertest() {
		// webDriver.quit();
	}

	@Before
	public void b4test() {
		webDriver = new ChromeDriver();
	}

	@Ignore
	public void test_1() {
	
	webDriver.navigate().to("http://google.com/");
	webDriver.findElement(By.cssSelector("#lst-ib")).sendKeys("microsoft", Keys.RETURN);
	String wiki = webDriver.findElement(By.cssSelector("#rhs_block > div > div.kp-blk._Jw._Rqb._RJe > div > div._OKe > div:nth-child(2) > div._G1d._wle._xle > div > div:nth-child(1) > div > div > div > span:nth-child(1)")).getText();
	System.out.println(wiki);
	
	for(int i = 2; i<5; i++){
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
	webDriver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child("+i+") > a")).click();
	}
	}
	}
	
	@Test
	public void test_2(){
		webDriver.navigate().to("http://google.com/");
		webDriver.findElement(By.cssSelector("#lst-ib")).sendKeys("translate", Keys.RETURN);
		String wiki = "mi nombre es Adam" ;
		
		for(int i = 1; i<5; i++){
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		webDriver.findElement(By.cssSelector("#tw-source-text-ta")).sendKeys(wiki);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webDriver.findElement(By.cssSelector("#tw-swap > span > svg")).click();
		wiki = webDriver.findElement(By.cssSelector("#tw-target-text > span")).getText();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webDriver.findElement(By.cssSelector("#tw-source-text-ta")).clear();
		
		
	}
	}
}
