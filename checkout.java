package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class checkout {
    public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
        // Login

        // Add product to cart
        driver.findElement(
                        By.id("add-to-cart-sauce-labs-bike-light"))
                .click();
        // Open cart
        driver.findElement(
                        By.className("shopping_cart_link"))
                .click();
        // Click Checkout
        driver.findElement(
                        By.id("checkout"))
                .click();
        // Enter checkout information
        driver.findElement(By.id("first-name"))
                .sendKeys("Sujit");

        driver.findElement(By.id("last-name"))
                .sendKeys("Mandal");

        driver.findElement(By.id("postal-code"))
                .sendKeys("98440");

        // Click Continue
        driver.findElement(
                        By.id("continue"))
                .click();

        // Click Finish
        driver.findElement(
                        By.id("finish"))
                .click();
    }
}
