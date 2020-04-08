package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "D:\\driver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.baidu.com/");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("雪中悍刀行");
        element.submit();

        Thread.sleep(10000);

        driver.quit();
    }
}
