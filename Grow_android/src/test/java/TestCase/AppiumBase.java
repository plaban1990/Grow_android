package TestCase;

import Utility.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBase {


    protected AndroidDriver driver;
    protected WebDriverWait wait;


    @BeforeTest
    public void beforeTest() throws MalformedURLException {

        String apkpath="/home/plaban/Downloads/GrowFit-development-debug.apk";
        File app=new File(apkpath);

        //setting up desired capability
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "");
        caps.setCapability("platform", "ANDROID");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion", "6.0.1");
        caps.setCapability("deviceName", "Redmi Note 3");
        caps.setCapability("app", app.getAbsolutePath());
        //caps.setCapability("--session-override",true);
        caps.setCapability("noReset","true");
        caps.setCapability("fullReset","false");
        //caps.setCapability("appPackage", "com.health360.userapp.health360.staging-2");
        caps.setCapability("appActivity","com.health360.userapp.health360.ui.splash.SplashActivity");
        caps.setCapability("appWaitActivity","com.health360.userapp.health360.ui.login.LoginInfoActivity");
        caps.setCapability("appWaitActivity","com.health360.userapp.health360.ui.dashboard.Dashboard");
        //caps.setCapability("appWaitActivity","com.health360.userapp.health360.ui.onboarding.OnboardingActivity");

        //initializing driver object
         driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        //initializing explicit wait object
        wait = new WebDriverWait(driver, 10);




    }



    @AfterTest
    public void afterTest() {


        driver.quit();


    }

}