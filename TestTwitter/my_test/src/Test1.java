
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;


public class Test1 {
  private static WebDriver driver;
  private static String baseUrl;

  @BeforeClass
  public static void setUp() throws Exception {
	String pathToGeckoDriver = Paths.get("geckodriver.exe").toAbsolutePath().toString();
	System.setProperty("webdriver.gecko.driver", pathToGeckoDriver); 
    driver = new FirefoxDriver();
    baseUrl = "https://twitter.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
	driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.name("session[username_or_email]")).clear();
    driver.findElement(By.name("session[username_or_email]")).sendKeys("etfsf");
    driver.findElement(By.name("session[password]")).clear();
    driver.findElement(By.name("session[password]")).sendKeys("fse");
    driver.findElement(By.name("session[password]")).sendKeys(Keys.ENTER);
    TimeUnit.SECONDS.sleep(3);
  }
  
  @Test
  public void test2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.name("session[username_or_email]")).clear();
    driver.findElement(By.name("session[username_or_email]")).sendKeys("juventus_113@mail.ru");
    driver.findElement(By.name("session[password]")).clear();
    driver.findElement(By.name("session[password]")).sendKeys("lfybk1711");
    driver.findElement(By.name("session[password]")).sendKeys(Keys.ENTER);
    TimeUnit.SECONDS.sleep(3);
  }
  
  @Test
  public void test3() throws Exception {
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys("Игорь"); 
    driver.findElement(By.cssSelector("span.search-icon.js-search-action")).click();
    TimeUnit.SECONDS.sleep(3);
  }
  @Test
  public void test4() throws Exception {   
	    driver.findElement(By.id("user-dropdown-toggle")).click();
	    driver.findElement(By.cssSelector("#signout-button > button.dropdown-link")).click();
    TimeUnit.SECONDS.sleep(3);
  }
/*
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }*/
}