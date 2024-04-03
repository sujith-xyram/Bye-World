import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VulnWeb {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSujithRao\\eclipse-workspace\\ByeWorld\\src\\main\\resources\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the desired web page
        driver.get("http://www.vulnweb.com");

        // Print "bye world" to the console
        System.out.println("Bye world");

        // Close the browser
        driver.quit();
    }
}
