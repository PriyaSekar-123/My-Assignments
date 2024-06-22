package week1.day4_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();

driver.findElement(By.id("accountName")).sendKeys("TestLeeafPriya");
driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.id("numberEmployees")).sendKeys("60");

driver.findElement(By.xpath("//input[@value='Create Account']")).click();
driver.findElement(By.partialLinkText("Ignoring")).click();

System.out.println("Title : ");
System.out.println(driver.getTitle());
Thread.sleep(2000);




	}

}
