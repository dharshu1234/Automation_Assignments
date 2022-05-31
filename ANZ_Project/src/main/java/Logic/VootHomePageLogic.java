package Logic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import static Logic.LaunchBrowsers.*;

import java.time.Duration;
import java.util.Random;

import Pages.HomePages;

public class VootHomePageLogic {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	 /** 1.
     * Method to verify user navigated to voot home page by fetching current url & comparing with actual url.
	 * @throws InterruptedException 
     */
    public static void verifyHomePageNavigation() throws InterruptedException{
        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl,"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/ ","Not navigated to Voot home page");
        Thread.sleep(5000);
        System.out.println("Home page url is: " + homePageUrl);
    }

    /** 2.
     * method to verify voot logo by presence of element and comparing fetched logo text with actual text.
     * @throws InterruptedException 
     */
    public static void verifyVootLogo() throws InterruptedException{
       WebElement vootlogo = driver.findElement(HomePages.objAnnualincome);
        String logoText = vootlogo.getAttribute("title");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        System.out.println("Text of voot logo is: " + logoText);
  //      Assert.assertEquals(logoText,"Voot","Failed to fetch voot logo");
    //    Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

    }
    public static void navigateToobjAnnualincome() throws InterruptedException {
    	Thread.sleep(5000);
    	//driver.findElement(HomePages.objAnnualincome).click();

    	//Select select = new Select(driver.findElement(HomePages.objsubjectheading));select.selectByIndex(2);
    	
    	
//    	Faker faker = new Faker();
//
//    	String name = faker.name().fullName(); 
//    	String firstName = faker.name().firstName(); 
//    	String lastName = faker.name().lastName(); 

    	
    	
      //   String email= firstName+lastName+"@gmail.com";
    //	String streetAddress = faker.address().streetAddress(); 
    //	Random randomGenerator = new Random();
	//	int randomInt = randomGenerator.ne;xtInt(1000);
	   driver.findElement(HomePages.objAnnualincome).sendKeys("$80,000");
   	driver.findElement(HomePages.objOtherIncome).sendKeys("$10,000");
   	Thread.sleep(5000);
   	driver.findElement(HomePages.objLivingExpenses).sendKeys("$500");
   	driver.findElement(HomePages.objCurrentHomeLoanRepayment).sendKeys("$0");
   	driver.findElement(HomePages.objOtherloanRepayment).sendKeys("$100");
   	Thread.sleep(5000);
   	driver.findElement(HomePages.objOthercommitement).sendKeys("$0");
   	driver.findElement(HomePages.objTotalCreditcaredLimit).sendKeys("$10,000");
   	driver.findElement(HomePages.objHowMuchIcouldBarrow).click();
   	Thread.sleep(5000);
   	
	String expected = "$1,326,000";
	WebElement actualMsg = driver.findElement(HomePages.objestimateborrow );
	String text=actualMsg.getText();
	Assert.assertEquals(text, expected);
	System.out.println("TEST1 PASSED");
	Thread.sleep(5000);
	
	driver.findElement(HomePages.objstartover).click();
	
	//Thread.sleep(5000);
	driver.findElement(HomePages.objLivingExpenses1).sendKeys("$1");
	Thread.sleep(5000);
	Thread.sleep(5000);
	driver.findElement(HomePages.objWorkouthowmuchIcouldBarrow).click();
	
	String expected1 = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
	WebElement actualMsg1 = driver.findElement(HomePages.objText );
	String text1=actualMsg1.getText();
	Assert.assertEquals(text1, expected1);
	System.out.println("TEST2 PASSED");
	Thread.sleep(5000);
	
	
	//driver.findElement(HomePages.objorderreference).sendKeys(firstName);
		
	//	driver.findElement(HomePages.objChooseFile).sendKeys("C:\\Users\\IGS0462\\Desktop\\Dharshan");
	//	Thread.sleep(5000);
	//	driver.findElement(HomePages.objMessage).sendKeys("Hi this is Dharshan R M");
	//	Thread.sleep(5000);
	//	driver.findElement(HomePages.objSend).click();
		
    //	Thread.sleep(5000);
    	//driver.findElement(HomePages.objPremiumTab).click();
    //	wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objCarouselCardOnPremiumTab));
    	
    	//driver.findElement(HomePages.objUsername).sendKeys("AGCY8");
    //	driver.findElement(HomePages.objPassword).sendKeys("sentrifugo");
    
    //	driver.findElement(HomePages.objLogin).click();
    	//driver.findElement(HomePages.objRecruitement).click();
    
    	
    	driver.close();
    
    	
    }

	public static void navigateToPremiumpage() {
		// TODO Auto-generated method stub
		
	}

}
