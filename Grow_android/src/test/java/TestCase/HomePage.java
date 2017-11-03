package TestCase;

import Utility.ExtentReport;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePage extends AppiumBase {





    @Test(enabled =false)
    public void LoginActivity() throws InterruptedException{

        driver.context("NATIVE_APP");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      /*
        WebElement f1=driver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));

        f1.click();
      */
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.Button[@index='2']"))
                .click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))
                .sendKeys("7978545322");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.Button[@text='Next']"))
                .click();

         Thread.sleep(3000);

         driver.findElement(By.xpath("//android.widget.EditText[@index='3']"))
                 .sendKeys("123456");

         Thread.sleep(3000);

         driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']"))
                    .click();

             Thread.sleep(6000);

        driver.findElementByAccessibilityId("Profile")
                .click();

        Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"))
               .click();

       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"))
               .click();

       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.Button[@text='Yes']"))
               .click();

       Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))
                .sendKeys("7978545322");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.Button[@text='Next']"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.EditText[@index='3']"))
                .sendKeys("123456");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']"))
                .click();

        Thread.sleep(6000);



    }
   @Test(enabled = true)
   public void PofilePage() throws InterruptedException, MalformedURLException{

        Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.FrameLayout[@index='4']"))
               .click();

       Thread.sleep(3000);

       TouchAction action = new TouchAction(driver);
       action.press(561,1557).waitAction().moveTo(617,630).release().perform();

       Thread.sleep(3000);


       driver.findElementByAccessibilityId("Diet Chart")
               .click();
        Thread.sleep(4000);

       //driver.swipe(927,1413,163,1374, 3000);

       Thread.sleep(3000);

       TouchAction action1=new TouchAction(driver);
       action1.press(927,1413).waitAction().moveTo(163,1374).release().perform();
       //driver.swipe(927,1413,163,1374, 3000);

       Thread.sleep(3000);

       driver.findElementByAccessibilityId("Profile")
               .click();

       Thread.sleep(3000);

       TouchAction action2=new TouchAction(driver);
       action2.press(601,665).waitAction().moveTo(573,1612).release().perform();
       //driver.swipe(630,577,596,1543,3000);
       Thread.sleep(3000);
       //profile field value

       driver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']"))
               .click();

       WebElement ele1=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));

       String s1=ele1.getText();
       if(s1.contains("plaban4505@gmail.com")){

           System.out.println("Email field is correct");

       }
       else {

           System.out.println("Incorrect email field");
           ele1.clear();
           driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
           ele1.sendKeys("plaban4505@gmail.com");
       }

       Thread.sleep(3000);
       driver.findElement(By.xpath("//android.widget.TextView[@index='1']"))
               .click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.LinearLayout[@index='7']"))
               .click();

       WebElement ele2=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));

       String p=ele2.getText();
       int t=Integer.parseInt(p);
       if (t==Integer.parseInt(p)){

           System.out.println("Age is in integer");

       }else {

           ele2.clear();
           ele2.sendKeys("28");


       }

        driver.findElement(By.xpath("//android.widget.TextView[@text='Done']"))
                .click();
       Thread.sleep(3000);


       driver.findElement(By.xpath("//android.widget.LinearLayout[@index='11']"))
               .click();


       driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))
               .sendKeys("7");

       driver.findElement(By.xpath("//android.widget.TextView[@text='Done']"))
               .click();
       Thread.sleep(3000);


       TouchAction action3=new TouchAction(driver);
       action3.press(561,1557).waitAction().moveTo(617,630).release().perform();

       Thread.sleep(5000);
       driver.findElement(By.xpath("//android.widget.LinearLayout[@index='13']"))
               .click();
       Thread.sleep(3000);
       WebElement ele4=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));

       String p1=ele2.getText();
       int t1=Integer.parseInt(p1);
       if (t1==Integer.parseInt(p1)){

           System.out.println("Weight is in integer");

       }else {

           ele2.clear();
           ele2.sendKeys("80");


       }

       driver.findElement(By.xpath("//android.widget.TextView[@text='Done']"))
               .click();
       Thread.sleep(3000);


       TouchAction action4=new TouchAction(driver);
       action4.press(601,665).waitAction().moveTo(573,1612).release().perform();
       Thread.sleep(3000);
      /*

       driver.swipe(558,552,593,1490,2000);
       
       Thread.sleep(3000);

       driver.swipe(558,552,593,1490,2000);
       Thread.sleep(3000);
       */
       driver.findElement(By.xpath("//android.widget.Button[@text='Upgrade']"))
               .click();
       Thread.sleep(4000);

       TouchAction action5=new TouchAction(driver);
       action4.press(511,1700).waitAction().moveTo(577,273).release().perform();
       Thread.sleep(3000);
       //driver.swipe(511,1700,577,273,2000);


       driver.findElement(By.xpath("//android.widget.Button[@text='Buy']"))
               .click();

       Thread.sleep(2000);
       /*
       Set<String> availableContexts = driver.getContextHandles();
       System.out.println("Total No of Context Found After we reach to WebView = "+ availableContexts.size());
       for(String context : availableContexts) {
           if(context.contains("WEBVIEW")){
               System.out.println("Context Name is " + context);
               // 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
               //(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
               driver.context("WEBVIEW");
               break;
           }
       }
       */
       driver.findElement(By.xpath("//android.widget.Button[@text='Instamojo']"))
               .click();

       Thread.sleep(10000);

       driver.findElement(By.xpath("//android.widget.TextView[@text='Debit Card']"))
               .click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.EditText[@text='Card Number']"))
               .sendKeys("4111111111111111");
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.EditText[@text='Name on Card']"))
               .sendKeys("Plaban");
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.EditText[@text='Expiry MM/YY']"))
               .sendKeys("0222");
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.EditText[@NAF='true']"))
               .sendKeys("246");

       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.Button[@index='3']"))
               .click();

       Thread.sleep(30000);

       driver.pressKeyCode(AndroidKeyCode.BACK);

       driver.findElement(By.xpath("//android.widget.Button[@text='OK']"))
               .click();

       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.Button[@text='PayTm']"))
               .click();
       Thread.sleep(5000);

       Set<String> availableContexts = driver.getContextHandles();
       System.out.println("Total No of Context Found After we reach to WebView = "+ availableContexts.size());
       for(String context : availableContexts) {
           if(context.contains("WEBVIEW")){
               System.out.println("Context Name is " + context);
               // 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
               //(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
               driver.context("WEBVIEW");
               break;
           }
       }








       /*
       WebElement e1=driver.findElement(By.xpath("//android.widget.TextView[@text='Exercise Level']"));
       WebElement e2=driver.findElement(By.xpath("//android.widget.TextView[@text='Height']"));

       int x=e1.getLocation().getX();
       int y=e1.getLocation().getY();
       int x1=e2.getLocation().getX();
       int y1=e2.getLocation().getY();

       driver.swipe(x,y,x1,y1, 2000);



       driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"))
               .click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']"))
               .click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']"))
               .click();

       driver.findElement(By.xpath("//android.view.View[@clickable='True']"))
               .click();
       Thread.sleep(3000);


       */











   }


}