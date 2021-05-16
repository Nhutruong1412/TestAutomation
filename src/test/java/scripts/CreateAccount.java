package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        driver.get("https://demo.guru99.com/");
        Home home = new Home(driver);
        home.EnterEmail("truonghuynhnhu1412@gmail.com");
        String ID = driver.findElement(By.xpath("//td[contains(text(),'User ID')]/following-sibling::td")).getText();
        String PWord = driver.findElement(By.xpath("//td[contains(text(),'Password ')]/following-sibling::td")).getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://demo.guru99.com/v4");
        home.Login(ID, PWord);


    }




}