package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class filterSize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        WebElement filter = driver.findElement(
                By.className("product_sort_container"));
        Select select = new Select(filter);

        // Select Name A to Z
        select.selectByValue("az");

        // Print result
        System.out.println("Products filtered by Name A to Z");
    }
}






