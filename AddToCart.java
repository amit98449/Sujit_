package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add first item
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Add second item
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        // Open Cart
        driver.findElement(By.className("shopping_cart_link")).click();



        }
}


