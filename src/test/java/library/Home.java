package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    //Locator on the page https://demo.guru99.com/
    public By detailButton = By.xpath("//button[@id='details-button']");
    public By proceedLink = By.xpath("//a[@id='proceed-link']");
    //Locator on the first page
    public By emailField = By.xpath("//input[@type='text']");
    public By submitButton = By.xpath("//input[@type='submit']");
    /*public By userID = By.xpath("(//td[@align='center'])[3]");
    String ID = driver.findElement(By.xpath("(//td[@align='center'])[3]")).getText();
    public By passWord = By.xpath("(//td[@align='center'])[5]");
    String PWord = driver.findElement(By.xpath("(//td[@align='center'])[5]")).getText();*/


    //Locator on the page Login
    public By userID_field = By.xpath("//input[@name='uid']");
    public By passWord_field = By.xpath("//input[@name='password']");



    public void AccessToHomePage() {
        driver.findElement(detailButton).click();
//   WebDriverWait wait = new WebDriverWait(driver,20);
//    wait.until(ExpectedConditions.visibilityOf((WebElement) proceed_link));
        driver.findElement(proceedLink).click();
    }
    public void EnterEmail (String strInput){
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(strInput);
        driver.findElement(submitButton).click();
    }

    public void Login (String user, String pass){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(userID_field));
        driver.findElement(userID_field).click();
        driver.findElement(userID_field).sendKeys();
        driver.findElement(passWord_field).click();
        driver.findElement(passWord_field).sendKeys();

    }
}
