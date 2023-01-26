package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
                                                                     // Select Class aapan dropdown mdli value get krnyasaathi use krto.
public class ToHandleDropdownProg {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
	    Thread.sleep(2000);
	    
	    WebElement newUserLable = driver.findElement(By.xpath("//div[contains(text(),'Your F')]"));
	    String expLable = "Your Full name";
	    String actLable = newUserLable.getText();
	    System.out.println(actLable);
	    if(expLable.equals(actLable))
	    	System.out.println("Lable TC Pass");
	    else
	    	System.out.println("Lable TC Fail");
	    
	    WebElement yourFullName = driver.findElement(By.xpath("//input[@name='fullname']"));
	    WebElement yourCurrentEmailID = driver.findElement(By.xpath("//input[@name='emailid']"));
	   WebElement newPassword = driver.findElement(By.xpath("//input[@name='pass']"));
	   WebElement retypePassword = driver.findElement(By.xpath("//input[@name='repass']"));
	   driver.findElement(By.xpath("//input[@value='m']")).click();
	   driver.findElement(By.xpath("//input[@value='f']")).click();
	   
	   yourFullName.sendKeys("Chitra Digvijay Patil");
	   yourCurrentEmailID.sendKeys("patilchitra977@gmail.com");
	   newPassword.sendKeys("Chita@123");
	   retypePassword.sendKeys("Chita@123");
	   
	   WebElement location = driver.findElement(By.xpath("//input[@name='city']"));
	   location.sendKeys("Pune");
	   WebElement school = driver.findElement(By.xpath("//input[@name='school']"));
	   school.sendKeys("A.B.S.girls High School Porle");
	   WebElement college = driver.findElement(By.xpath("//input[@name='college']"));
	   college.sendKeys("Chh. Shahu Jr. clg Kolhapur");
	   
	   WebElement day = driver.findElement(By.xpath("//select[@name='date_day']")); 
	   WebElement month = driver.findElement(By.xpath("//select[@name='date_mon']")); 
	   WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
	   
	   Select s1=new Select(day);  // index ni aapn kru shakto but if the data is in large amount then aapn index mojat bsav lagel so aapn mostly index nahi use krt.
//	   s1.selectByIndex(0);
//	   Thread.sleep(2000);
//	   s1.selectByIndex(23);
 //  Thread.sleep(2000);
   s1.selectByValue("23");    // Value ne pn aapan find kru shakto but value present asel trch .... 
//	   Thread.sleep(2000);
	   s1.selectByVisibleText("23");
	   Thread.sleep(2000);

	   Select s2=new Select(month);
	   s2.selectByVisibleText("JAN");  // Visible text is the best way to findout cz je aaplyala distey ahe tech fct aapn kraych ahe so is usefull.
	   Thread.sleep(2000);
	   
	   Select s3=new Select(year);
	   s3.selectByValue("1993");
	   Thread.sleep(2000);
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    driver.close();
	}

}
