package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;

public class Base {
    protected static WebDriver driver;

    public final static String MAIN_PAGE_URL = "https://pamis-webdmin.niso.dev/";

    public void beforemethod() throws MalformedURLException, InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName","chrome");
        chromeOptions.setCapability("platformName","LINUX");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--remote-allow-origins=*");


        driver = new ChromeDriver(chromeOptions);
        System.setProperty("webdriver.chrome.driver","/src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("hello git");
    }

    public void aftermethod(){
        driver.quit();
    }
}
