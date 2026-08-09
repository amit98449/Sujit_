package projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class FilterPrice {
    public static void main(String[] args) {
        FilterByPrice test = new FilterByPrice();
        // Login
        test.Login();

        // Locate sorting dropdown
        WebElement filterButton = test.driver.findElement(By.className("product_sort_container"));

        //select price (low to high)
        Select select = new Select(filterButton);
        select.selectByVisibleText("Price(low to high)");
        
    }
}
