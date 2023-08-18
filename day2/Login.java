package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();  
        driver.get("http://leaftaps.com/opentaps/control/main"); 
        driver.manage().window().maximize(); 
        driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click(); 
        String title = driver.getTitle();         //print the title      
        System.out.println(title);         //click crmsfa    
        driver.findElement(By.linkText("CRM/SFA")).click();        
        //Click Lead        
        driver.findElement(By.linkText("Leads")).click();       
        //click createlead       
        driver.findElement(By.linkText("Create Lead")).click();   
          
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");    
        //Enter first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kanchana");        
        //Enterlastname
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vijayan");
        WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select select1 =new Select(drop1);
        select1.selectByIndex(3);
        
        WebElement drop2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        
        Select select2 = new Select(drop2);
        select2.selectByVisibleText("Road and Track");
        
       
        WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select select3 =new Select(drop3);
        select3.selectByValue("OWN_PARTNERSHIP");
            
        
        
        
        //click CreateLead
        driver.findElement(By.name("submitButton")).click();           
        //Verify the text
        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText(); 
        //print the text      
        System.out.println(text); 
	}

	
	

}
