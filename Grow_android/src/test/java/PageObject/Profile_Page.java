package PageObject;

import Utility.ExtentReport;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Profile_Page extends ExtentReport {

AndroidDriver driver;

@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='4']")
//@FindBy(how=How.XPATH, using= "//android.widget.FrameLayout[@index='4']")
private MobileElement profileTab;
@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='3']")
//@FindBy(how=How.XPATH, using ="//android.widget.LinearLayout[@index='3']")
private MobileElement Email;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
//@FindBy(how=How.XPATH,using = "//android.widget.EditText[@index='0']")
private MobileElement editEmail;
@AndroidFindBy(xpath = "//android.widget.TextView[@index='1']")
//@FindBy(how=How.XPATH,using = "//android.widget.TextView[@index='1']")
private  MobileElement saveEmail;
@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='7']")
//@FindBy(how=How.XPATH,using = "//android.widget.LinearLayout[@index='7']")
private MobileElement age;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
//@FindBy(how=How.XPATH,using = "//android.widget.EditText[@index='0']")
private MobileElement editAge;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
//@FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Done']")
private MobileElement saveAge;
@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='11']")
//@FindBy(how=How.XPATH,using = "//android.widget.LinearLayout[@index='11']")
private MobileElement height;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
//@FindBy(how=How.XPATH,using = "//android.widget.EditText[@index='1']")
private MobileElement editHeight;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
//@FindBy(how=How.XPATH,using = "//android.widget.TextView[@text='Done']")
private  MobileElement saveHeight;
@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='13']")
//@FindBy(how=How.XPATH,using = "//android.widget.LinearLayout[@index='13']")
private MobileElement weight;
@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
//@FindBy(how = How.XPATH,using = "//android.widget.EditText[@index='0']")
private MobileElement editWeight;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
//@FindBy(how =How.XPATH,using = "//android.widget.TextView[@text='Done']")

private MobileElement saveWeight;


public Profile_Page (AndroidDriver driver){
   this.driver=driver;
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

}

public Profile_Page profileIcon(){

   if (profileTab.isDisplayed()&&profileTab.isDisplayed()){
       profileTab.click();
       System.out.println("x");
       test.log(LogStatus.PASS,"profileTab is clicked");
   }
   else {

       test.log(LogStatus.PASS,"profileTab is not clicked");
   }

    return this;
}

public Profile_Page Email(){

    Email.click();
    test.log(LogStatus.PASS,"Email field is clicked");
    return this;
}

public Profile_Page editEmail() {
    String s1 = editEmail.getText();
    if (s1.contains("@")) {

        test.log(LogStatus.PASS, "Email field is correct");

    } else {

        test.log(LogStatus.FAIL, "Email field is not correct");
    }
    return this;
}

public Profile_Page saveEmail(){
    if(saveEmail.isEnabled()) {
        saveEmail.click();
        test.log(LogStatus.PASS,"modified email is saved");
    }else{

        test.log(LogStatus.FAIL,"modified email can not be saved");
    }

    return this;
}

public Profile_Page age(){

 if(age.isEnabled()) {
     age.click();
     test.log(LogStatus.PASS, "age section is clicked");

 }else {

     test.log(LogStatus.FAIL,"section is not enabled for click");

 }
    return this;
}

public  Profile_Page editAge(String age){

    String p=editAge.getText();
    int t=Integer.parseInt(p);
    if (t==Integer.parseInt(p)){

        System.out.println("Age is in integer");
        test.log(LogStatus.PASS,"age is in integer");

    }else {

        editAge.clear();
        editAge.sendKeys(age);
        test.log(LogStatus.FAIL,"changed the type to integer");
    }
    return this;

}

public Profile_Page saveAge(){
   if(saveAge.isEnabled()){

       saveAge.click();
       test.log(LogStatus.PASS,"Modified age is saved");
   }else{

       test.log(LogStatus.FAIL,"Modified age can not be saved");
   }
   return this;

}

public Profile_Page height() {

    if (height.isEnabled() && height.isDisplayed()) {

        test.log(LogStatus.PASS, "Height field is clicked");

    } else {
        test.log(LogStatus.FAIL, "Height field can not be clicked");

    }

    return this;
}

public Profile_Page editHeight(String height){

    editHeight.sendKeys(height);
    test.log(LogStatus.PASS,"height is edited");

    return this;
}

public Profile_Page saveHeight(){

    if(saveHeight.isEnabled()&&saveHeight.isDisplayed()){

        test.log(LogStatus.PASS,"Height is saved");

    }else{

     test.log(LogStatus.FAIL,"Height can not be saved");
    }

    return this;
}

public Profile_Page slideDown(){

        TouchAction action=new TouchAction(driver);
        action.press(561,1557).waitAction().moveTo(617,630).release().perform();
        test.log(LogStatus.PASS,"page scrolled down");
        return this;
    }

public Profile_Page weight(){

    if(weight.isDisplayed()&&weight.isEnabled()){

        weight.click();
        test.log(LogStatus.PASS,"Weight field is clicked");

    }else{

        test.log(LogStatus.FAIL,"Weight field can not be clicked");
    }
    return this;
}

public Profile_Page editWeight(String weight){

    String p1=editWeight.getText();
    int t1=Integer.parseInt(p1);
    if (t1==Integer.parseInt(p1)){

        System.out.println("Weight is in integer");
        test.log(LogStatus.PASS,"Weight is in integer");

    }else {
        test.log(LogStatus.FAIL,"Weight is not in integer");
        editWeight.clear();
        editWeight.sendKeys(weight);

    }
    return this;
}

public Profile_Page saveWeight(){

    if(saveWeight.isEnabled()&&saveWeight.isDisplayed()){

        saveWeight.click();

        test.log(LogStatus.PASS,"Weight is saved");

    }else{

        test.log(LogStatus.FAIL,"saveWeight button is not working");
    }

    return this;
}

public Profile_Page scrollUp(){

    TouchAction action4=new TouchAction(driver);
    action4.press(601,665).waitAction().moveTo(573,1612).release().perform();
    test.log(LogStatus.PASS,"Page scrolled up");
    return this;

}










}
