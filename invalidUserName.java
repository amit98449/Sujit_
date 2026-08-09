package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeD




public class invalidUserName {
    public static void main(String[] args) {
        WebDriver driver = new Chromedriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement invalidUserNameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));
        invalidUserNameField.sendKeys("student");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }


}
