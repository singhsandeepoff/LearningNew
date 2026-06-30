import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledOrNot {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //a[@value='DED']
        // //a[@value='MAA']

      //  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       // driver.findElement(By.xpath("//a[@value='DED']")).click();
        Thread.sleep(2000);
        // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //without using the index. It is parent child traverse
      //  driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
       if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
       {
           System.out.println("it's enabled");
           Assert.assertTrue(true);
       }
       else {
           Assert.fail();

       }
    }
}