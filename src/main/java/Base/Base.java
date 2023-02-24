package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected static WebDriver driver;

    public final static String MAIN_PAGE_URL = "https://www.google.com/";

    public void beforemethod(){
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
 /*       chromeOptions.addArguments("--whitelist-ip *");
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
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("hello git");
    }
    public void aftermethod(){
        driver.quit();
    }
}
