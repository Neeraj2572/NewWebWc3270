package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class poc1test {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void newTest() throws InterruptedException {
		driver.get("http://localhost:1977/h3270/servlet");
		driver.manage().window().setSize(new Dimension(1296, 696));
		driver.findElement(By.name("hostname")).click();
		driver.findElement(By.name("hostname")).sendKeys("teague-tammvs1.tamu.edu:992");
		driver.findElement(By.name("connect")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("keypad")).click();
		driver.findElement(By.name("field_1_23")).click();
		driver.findElement(By.name("field_1_23")).sendKeys("PHONBOOK");
		Thread.sleep(2000);
	    driver.findElement(By.name("field_1_23")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.name("field_33_11")).sendKeys("F");
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_75_11")).clear();
	    driver.findElement(By.name("field_75_11")).sendKeys("?");
	    Thread.sleep(500);
	    driver.findElement(By.name("enter")).click();
	    driver.findElement(By.name("field_29_9")).click();
	    driver.findElement(By.name("field_29_9")).sendKeys("x");
	    Thread.sleep(2000);
	    driver.findElement(By.name("enter")).click();
	    driver.findElement(By.name("enter")).click();
	   	Thread.sleep(2000);
		driver.findElement(By.name("field_6_19")).sendKeys("MURPHY");
		Thread.sleep(2000);
	    driver.findElement(By.name("field_47_19")).click();
	    driver.findElement(By.name("field_47_19")).sendKeys("WALTER");
	    Thread.sleep(2000);
	    driver.findElement(By.name("enter")).click();
	    Thread.sleep(2000);
	   	driver.findElement(By.cssSelector("pre")).click();
		driver.findElement(By.name("enter")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("disconnect")).click();
		Thread.sleep(2000);
	}
}
