package work;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.*;

public class SimpleBingTest {
    static WebDriver driver;

    @BeforeClass
    public static void beforeBingTest() {
        System.setProperty("webdriver.ie.driver", "D:\\driver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://cn.bing.com/");
    }

    @Test
    public void titleTest() throws Exception {
        assertEquals("微软 Bing 搜索 - 国内版",driver.getTitle());
    }

    @Test
    public void titleByIdTest() throws Exception {
        WebElement element = driver.findElement(By.id("sb_form_q"));
        element.sendKeys("软件测试");
        element.submit();
        assertEquals("软件测试 - 国内版 Bing",driver.getTitle());
    }

    @Test
    public void titleByNameTest() throws Exception {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("测试");
        element.submit();
        assertEquals("测试 - 国内版 Bing",driver.getTitle());
    }

    @AfterClass
    public static void afterBingTest() {
        driver.quit();
    }
}
