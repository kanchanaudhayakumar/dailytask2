package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("udhayakumar");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nagaraj");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("udhaya@yahoo.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9789638778");
	
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	

	}

}
