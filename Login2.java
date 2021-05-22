package hi.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
         
public class Login2
{        
	public static WebDriver driver;
	                
	@Test           
	public String test(String username ,String password)
	{    		    
		 System.setProperty("webdriver.chrome.driver","D:\\hello\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.linkedin.com/");
	                
	     driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys(username);
	     driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys(password);
	     driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button")).click();
	  	            
	     String h =driver.findElement(By.xpath("//*[@id=\"ember19\"]/span")).getText();
	     System.out.println(h);
	                
	     if(h.equals("Home"))
	     {          
	     	 return "Able to login"; 
	     }              
	     return null;
	}    
}        
