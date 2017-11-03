package Utility;


import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentTestInterruptedException;


public class ExtentReport{

    public static ExtentReports extent;
    public static ExtentTest test;
    public static ExtentTestInterruptedException testexception;



    @BeforeSuite(groups = ( "Sanity" ))
    public void beforeSuite()
    {
        //Report Directory and Report Name
        extent = new ExtentReports("/home/plaban/Myfolder/plaban/Grow_android/app_execution_report.html", true); //Provide Desired Report Directory Location and Name
        extent.loadConfig(new File("Extent_config.xml")); //Supporting File for Extent Reporting
        extent.addSystemInfo("Environment","QA_Growfit"); //It will provide Execution Machine Information
    }

    @BeforeTest(groups = { "Sanity" })
    public void beforeTest() throws MalformedURLException
    {
        System.out.println(" Starting Automation Script ");
    }

    //Messages on Categories Section of HTML Report

    @BeforeMethod(groups = { "Sanity" })
    public  void beforeMethod(Method method)
    {
        test = extent.startTest( (this.getClass().getSimpleName() +" :: "+  method.getName()),method.getName()); //Test Case Start Here
        test.assignAuthor("Plaban Kumar Dwivedy"); //Test Script Author Name
        test.assignCategory("QA_Growfit  :: " + "ORT ENV" + " :: APP VERSION - "+ "ver"); //Test Category Defined Here
    }

    //Write Your Test Script Here

    //Test Case 1

    //Test Case Reporting Ends Here
    @AfterMethod(groups = { "Sanity" })
    public void afterMethod()
    {
        extent.endTest(test);
        extent.flush();
    }

    @AfterTest(groups = { "Sanity" })
    public void afterTest()
    {
        System.out.println(" in After Test");
    }

    @AfterSuite(groups = { "Sanity" })
    public void afterSuite()
    {
        //System.out.println("in afterSuite");
        extent.close();  // close the Test Suite
    }

}
