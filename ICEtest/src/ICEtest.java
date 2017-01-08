
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ICEtest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Raskomadator\\workspace\\ICEtest\\lib\\geckodriver.exe");
	driver = new FirefoxDriver();
    baseUrl = "http://icestudio.dx.am/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
	  driver.get(baseUrl + "/index.html#");
	    driver.findElement(By.linkText("ICE Studio")).click();
	    driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.linkText("About")).click();
	    driver.findElement(By.linkText("Contact")).click();
	    driver.findElement(By.linkText("Services")).click();
	    driver.findElement(By.linkText("Android App's")).click();
	    driver.findElement(By.linkText("Services")).click();
	    driver.findElement(By.linkText("Video Production")).click();
	    driver.findElement(By.linkText("Services")).click();
	    driver.findElement(By.linkText("Music Production")).click();
	    driver.findElement(By.linkText("Marketing")).click();
	    driver.findElement(By.linkText("Ad sense setup")).click();
	    driver.findElement(By.linkText("Marketing")).click();
	    driver.findElement(By.linkText("Social Network Marketing")).click();
	    driver.findElement(By.linkText("Gallery")).click();
	    driver.findElement(By.linkText("Publishing")).click();
	    driver.findElement(By.cssSelector("i.glyphicon.glyphicon-zoom-in")).click();
	    driver.findElement(By.cssSelector("div.rl")).click();
	    driver.findElement(By.xpath("//section[@id='portfolio']/div/div[2]/div[7]/a/div")).click();
	    driver.findElement(By.cssSelector("#blackstar > div.modal-content > div.close-modal")).click();
	    driver.findElement(By.linkText("Terms of use")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-right")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-right")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-right")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-right")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-left")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-left")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-left")).click();
	    driver.findElement(By.linkText("Contact Us")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("peter@gmail.com");
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("peter@gmail.com");
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("Peter");
	    driver.findElement(By.id("phone")).clear();
	    driver.findElement(By.id("phone")).sendKeys("098434343434");
	    driver.findElement(By.id("message")).click();
	    driver.findElement(By.id("message")).clear();
	    driver.findElement(By.id("message")).sendKeys("Hello!");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
  }

  @After
  public void tearDown() throws Exception {
    driver.close();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
