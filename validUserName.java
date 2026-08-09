package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome


public class validUserName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement validUserNameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));
        validUserNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }
}
