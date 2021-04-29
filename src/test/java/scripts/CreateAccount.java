package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateAccount {

    private Object ChromeOptions;

    @Test
    public void getAccount() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://demo.guru99.com/");
        Home home = new Home(driver);
        //home.AccessToHomePage();
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