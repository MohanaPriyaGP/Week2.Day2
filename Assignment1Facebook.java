package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Assignment1Facebook {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();  


driver.get("https://en-gb.facebook.com/");

//object.method.method..
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Moni");
driver.findElement(By.name("lastname")).sendKeys("GP");
Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("1234567889");
driver.findElement(By.id("password_step_input")).sendKeys("Nature@123");
WebElement day = driver.findElement(By.name("birthday_day"));
Select select1 = new Select(day);
select1.selectByIndex(24);

WebElement month = driver.findElement(By.name("birthday_month"));
Select select2 = new Select(month);
select2.selectByVisibleText("Oct");
//select2.selectByIndex(9);

WebElement year = driver.findElement(By.name("birthday_year"));
Select select3 = new Select(year);
select3.selectByVisibleText("1989");

driver.findElement(By.xpath("//input[@type='radio']")).click();


driver.close();

	}

}
