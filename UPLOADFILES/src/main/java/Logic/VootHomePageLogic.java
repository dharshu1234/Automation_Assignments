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
        Assert.assertEquals(homePageUrl,"http://automationpractice.com/index.php","Not navigated to Voot home page");
        Thread.sleep(5000);
        System.out.println("Home page url is: " + homePageUrl);
    }

    /** 2.
     * method to verify voot logo by presence of element and comparing fetched logo text with actual text.
     * @throws InterruptedException 
     */
    public static void verifyVootLogo() throws InterruptedException{
       WebElement vootlogo = driver.findElement(HomePages.objContactus);
        String logoText = vootlogo.getAttribute("title");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        System.out.println("Text of voot logo is: " + logoText);
        Assert.assertEquals(logoText,"Voot","Failed to fetch voot logo");
        Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

    }
    public static void navigateToContactus() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objContactus).click();
    	Select select = new Select(driver.findElement(HomePages.objsubjectheading));select.selectByIndex(2);
    	
    	
    	Faker faker = new Faker();

    	String name = faker.name().fullName(); 
    	String firstName = faker.name().firstName(); 
    	String lastName = faker.name().lastName(); 

    	
    	
         String email= firstName+lastName+"@gmail.com";
    	String streetAddress = faker.address().streetAddress(); 
    //	Random randomGenerator = new Random();
	//	int randomInt = randomGenerator.ne;xtInt(1000);
	   driver.findElement(HomePages.objemailaddress).sendKeys(email);
	driver.findElement(HomePages.objorderreference).sendKeys(firstName);
		Thread.sleep(5000);
		driver.findElement(HomePages.objChooseFile).sendKeys("C:\\Users\\IGS0462\\Desktop\\igsdarshan.txt");
		Thread.sleep(5000);
		driver.findElement(HomePages.objMessage).sendKeys("Hi this is Dharshan R M");
		Thread.sleep(5000);
		driver.findElement(HomePages.objSend).click();
    
		
		
		String expected = "Your message has been successfully sent to our team.";
		WebElement actualMsg = driver.findElement(HomePages.objSuccessMessage);
		String text=actualMsg.getText();
		Assert.assertEquals(text, expected);
		System.out.println("TEST PASSED");
		
		
		
		System.out.println("printed");
		driver.quit();
//		driver.close();
		
    	
    	//driver.findElement(HomePages.objPremiumTab).click();
    //	wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objCarouselCardOnPremiumTab));
    	
    	//driver.findElement(HomePages.objUsername).sendKeys("AGCY8");
    //	driver.findElement(HomePages.objPassword).sendKeys("sentrifugo");
    
    //	driver.findElement(HomePages.objLogin).click();
    	//driver.findElement(HomePages.objRecruitement).click();
		
    	
 
    	
    }

	public static void verifySuccessfulMsg() {
		// TODO Auto-generated method stub
		
	}

	public static void navigateToPremiumpage() {
		// TODO Auto-generated method stub
		
	}

}
