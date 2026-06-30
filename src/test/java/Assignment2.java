import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Sandeep");
        driver.findElement(By.name("email")).sendKeys("Sandeep.singh@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);

        dropdown.selectByVisibleText("Male");

        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("29/05/1992");

        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        // Assert.assertEquals("Success!"+" The Form has been submitted successfully!. ", driver.findElement(By.cssSelector("div[class*='alert alert-success alert-dismissible']")).getText());

        String message = driver.findElement(By.cssSelector(".alert-success")).getText();

        message = message.replace("×", "").trim();

        Assert.assertEquals("Success! The Form has been submitted successfully!.", message);
        System.out.println(message);

    }

}
