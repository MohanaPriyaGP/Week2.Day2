package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Assignment2SalesForce {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();  


driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.name("UserFirstName")).sendKeys("Moni");
//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Moni");
driver.findElement(By.name("UserLastName")).sendKeys("Gantal");
driver.findElement(By.name("UserEmail")).sendKeys("abc@xxx.com");
driver.findElement(By.name("CompanyName")).sendKeys("Tata");
driver.findElement(By.name("UserPhone")).sendKeys("998877667");



WebElement job = driver.findElement(By.xpath("//select[@name='UserTitle']"));
Select select1 = new Select(job);
select1.selectByValue("CxO_General_Manager_AP");

WebElement employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
Select select2 = new Select(employees);
select2.selectByVisibleText("1501+ employees");

Thread.sleep(1000);

WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
Select select3 = new Select(country);
select3.selectByIndex(88);

driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
//driver.findElement(By.xpath("//input[@class='sr-only']/following-sibling::div")).click();


driver.close();

	}

}
