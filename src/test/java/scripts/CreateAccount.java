package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccount {

    @Test
    public void getAccount() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        Home home = new Home(driver);
        home.AccessToHomePage();
        home.EnterEmail("truonghuynhnhu1412@gmail.com");

    }
   @Test
    public void Account() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/v4");
        Home home = new Home(driver);
       home.AccessToHomePage();
        String ID = driver.findElement(By.xpath("(//td[@align='center'])[3]")).getText();
        String PWord = driver.findElement(By.xpath("(//td[@align='center'])[5]")).getText();
        home.Login(ID, PWord);
    }

}


