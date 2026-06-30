import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

    public static void main(String[] args) {

        //Sibling - Child to parent traverse
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //selenium will wait till the time the entire page is not loaded. All the components should be loaded
        //there is a synchronization wait
        driver.get("https://google.com");

        //selenium will not wait for the entire page to load. The page will continue even if the basic page/image is loaded on the page.
        //no synchronization wait. So we have to explicitly use waits
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        //this will take us back to google.com page by clicking on the back button.
        driver.navigate().back();
        driver.navigate().forward();
    }
}