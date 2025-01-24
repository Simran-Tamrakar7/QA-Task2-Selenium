import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest{
    public static void main(String[] args) {
        // chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");


        // Initialize
        WebDriver driver = new ChromeDriver();

        // url navigation
        driver.get("https://chulo-solutions.github.io/qa-internship/");
        
        // form info fill
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("testuser");
       
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Test@123");
         //    in site the id is creditCard
        WebElement creditCardField = driver.findElement(By.id("creditCard"));
        creditCardField.sendKeys("4111666622227777");
       
        WebElement telephoneField = driver.findElement(By.id("telephone"));
        telephoneField.sendKeys("(977) 234-2432");

        WebElement successMessage = driver.findElement(By.id("successMessage"));
        if (successMessage.isDisplayed()){
            System.out.println("TestPassed: Form Submission Successful");
        }
        else{
            System.out.println("Test Failed: Form Submission Unsuccessful.");
        }
    driver.quit();
    
    
    }

}