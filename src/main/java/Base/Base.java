package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    protected static WebDriver driver;

    public final static String MAIN_PAGE_URL = "https://merchanttest.niso.dev/";

    public void beforemethod() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver_win32/chromedriver.exe");
        //System.out.println(System.getProperty("webdriver.chrome.driver"));

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName","chrome");
        chromeOptions.setCapability("browserVersion","110.0");
        chromeOptions.setCapability("platformName","LINUX");
        chromeOptions.setCapability("se:noVncPort",7900);
        chromeOptions.setCapability("se:vncEnabled",true);
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        driver = new RemoteWebDriver(new URL("http://46.101.220.229:4444"), chromeOptions);

        System.out.println("***** Selenium Grid Chrome *****");

        /*ChromeOptions chromeOptions = new ChromeOptions();
        //initialize chromeOptions
        chromeOptions.setCapability("browserName", "chrome");
        //Define on which browser you want to execute your tests.
        chromeOptions.setCapability("platformName", "LINUX");
        //Define in which mode your tests will run.
        chromeOptions.addArguments("--headless");
        //Define the platform on which you will execute your tests
        WebDriver driver = new RemoteWebDriver(new URL("http://172.28.1.43:8080"), chromeOptions);*/
        /*chromeOptions.addArguments("--whitelist-ip *");
        chromeOptions.addArguments("--proxy-server='direct://'");
        chromeOptions.addArguments("--proxy-bypass-list=*");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-web-security");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.setHeadless(true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //test.eldorturkey.com.tr
        // test.eldorturkey.com.tr*/

       // driver = nw CehromeDriver();
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("hello git");
    }

    public void aftermethod(){
        driver.quit();
    }
}
