
package com.ShopperStalk_Generic_Utility;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShopperStack_pom.Home_Page;
import com.ShopperStack_pom.Login_Page;
import com.ShopperStack_pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base1_Test {
public ExtentSparkReporter spark;
 public ExtentReports report;
 public File_Utility file;
 public WebDriver driver;
 public Welcome_Page welcomePage;
 public Login_Page loginPage;
 public Home_Page homePage;
 public WebDriverWait wait;
 public static WebDriver sdriver;
 
 
 @BeforeSuite
 public void beforeSuite() {
  System.out.println("@BeforeSuite");
 }
 
 @BeforeTest
 public void beforeTest() {
  System.out.println("@BeforeTest");
  spark=new ExtentSparkReporter(Framework_Constants.reportPath);
  report= new ExtentReports();
  report.attachReporter(spark);
  report.createTest("Demo");
 }
 
 @BeforeClass
 public void beforeClass() throws IOException {
  System.out.println("@BeforeClass");
  String browser = file.readPropertyData("browser");
  String url = file.readPropertyData("url");
  
  if(browser.contains("chrome")) {
   driver=new ChromeDriver();
  }
  
  else if(browser.contains("firefox")) {
   driver=new FirefoxDriver();
  }
  
  else if(browser.contains("edge")) {
   driver= new EdgeDriver();
  }
  
  else {
   System.out.println("Enter valid Browser Name");
  }
  driver=sdriver;
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get(url);
  homePage = new Home_Page(driver);
  
 }
 
 @BeforeMethod
 public void beforeMethod() throws IOException {
  System.out.println("@BeforeMethod");
  welcomePage=new Welcome_Page(driver);
  WebElement ele = welcomePage.getLoginBtn();
  
  wait=new WebDriverWait(driver, Duration.ofSeconds(15));
  wait.until(ExpectedConditions.elementToBeClickable(ele));
  ele.click();
  
  loginPage=new Login_Page(driver);
  loginPage.getEmail().sendKeys(file.readPropertyData("username"));
  loginPage.getPassword().sendKeys(file.readPropertyData("password"));
  
  loginPage.getLoginBtn().click();
  
  }
 
 @AfterMethod
 public void afterMethod() {
  System.out.println("@AfterMethod");
  homePage=new Home_Page(driver);
  homePage.getLogout().click();
 }
 
 @AfterClass
 public void afterClass() throws InterruptedException {
  System.out.println("@AfterClass");
  Thread.sleep(3000);
  driver.quit();
 }
 
 @AfterTest
 public void afterTest(){
  System.out.println("@AfterTest");
  report.flush();
 }
 
 @AfterSuite
 public void afterSuite() {
  System.out.println("@AfterSuite");
 }

}