package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class ConfigTests {
    @BeforeSuite(alwaysRun = true)
    public void initialSetup(){
        Configuration.timeout = 12000;
        Configuration.reopenBrowserOnFail = true;
        Configuration.screenshots = true;
        Configuration.fileDownload = FileDownloadMode.HTTPGET;
        Configuration.pageLoadTimeout = 20000;
    }
    @BeforeTest(alwaysRun = true)
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser){
        Configuration.browser = browser;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        Configuration.browserCapabilities = options;
        Configuration.browserSize = null;
    }

    @AfterMethod
    public void afterMethod(){
        Selenide.closeWebDriver();
    }
}
