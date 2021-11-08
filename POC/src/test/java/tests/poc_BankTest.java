package tests;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class poc_BankTest {
	private WebDriver driver;
	
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		driver = new ChromeDriver();
		
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
	    Thread.sleep(2000);
	    driver.findElement(By.name("hostname")).sendKeys("localhost:2023");
	    Thread.sleep(2000);
	    driver.findElement(By.name("hostname")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	     driver.findElement(By.name("field_13_21")).click();
	     Thread.sleep(1000);
	    driver.findElement(By.name("field_13_21")).sendKeys("IBMUSER");
	    Thread.sleep(2000);
	    driver.findElement(By.name("field_36_21")).sendKeys("SYS1");
	    Thread.sleep(2000);
	    driver.findElement(By.name("field_36_21")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_18_21")).sendKeys("BANKTEST");
	    Thread.sleep(2000);
	    driver.findElement(By.name("field_18_21")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.name("keypad")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("clear")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_0_24")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_0_24")).sendKeys("BANK");
	    Thread.sleep(2000);
	    driver.findElement(By.name("field_0_24")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.name("pf1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_19_4")).sendKeys("123456789");
	    driver.findElement(By.name("field_19_4")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    String  text1=driver.findElement(By.name("field_19_6")).getAttribute("value");
	    BigDecimal value1=new BigDecimal(text1);
	    System.out.println(text1);
	    driver.findElement(By.name("pf3")).click();
	    driver.findElement(By.name("pf4")).click();
	    driver.findElement(By.name("field_33_4")).sendKeys("123456789");
	    driver.findElement(By.name("field_33_5")).sendKeys("123456789");
	    BigDecimal trnfAmount=new BigDecimal(10.00);	    
	    driver.findElement(By.name("field_33_6")).sendKeys("10");
	    driver.findElement(By.name("field_33_6")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.name("pf3")).click();
	    driver.findElement(By.name("pf1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("field_19_4")).sendKeys("123456789");
	    driver.findElement(By.name("field_19_4")).sendKeys(Keys.ENTER);
	   
	    Thread.sleep(1000);
	    String  text2=driver.findElement(By.name("field_19_6")).getAttribute("value");
	    Thread.sleep(1000);
	    BigDecimal value2=new BigDecimal(text2);
	    BigDecimal value3=(value2.subtract(value1)).setScale(0, RoundingMode.DOWN);
	    Thread.sleep(1000);
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	    assertEquals(trnfAmount,value3);
	    Thread.sleep(1000);
	    driver.findElement(By.name("pf3")).click();
	    driver.findElement(By.name("pf3")).click();
	    driver.findElement(By.name("pf3")).click();
	    driver.findElement(By.name("disconnect")).click();
	    driver.quit();
	}
}