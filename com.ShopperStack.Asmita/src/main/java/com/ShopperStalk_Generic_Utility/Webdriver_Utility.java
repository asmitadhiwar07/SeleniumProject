package com.ShopperStalk_Generic_Utility;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

	public class Webdriver_Utility {
	 Select sel;
	 
	 
	 public void selectByValue(WebElement element, String value) {
	  sel=new Select(element);
	  sel.selectByValue(value);
	 }
	 
	 public void selectByIndex(WebElement element, int index) {
	  sel=new Select(element);
	  sel.selectByIndex(index);
	 }
	 
	 public void selectByVisibleText(WebElement element, String text) {
	  sel=new Select(element);
	  sel.selectByVisibleText(text);
	 }
	 
	 public void deselectByValue(WebElement element, String value) {
	  sel=new Select(element);
	  sel.deselectByValue(value);
	 }
	 
	 public void deselectByIndex(WebElement element, int index) {
	  sel=new Select(element);
	  sel.deselectByIndex(index);
	 }
	 
	 public void deselectByVisibleText(WebElement element, String text) {
	  sel=new Select(element);
	  sel.deselectByVisibleText(text);
	 }
	 
	 public void deselectAll(WebElement element) {
	  sel=new Select(element);
	  sel.deselectAll();
	 }
	 
	 public void webPageScreenShot() throws IOException {
	  TakesScreenshot ts=(TakesScreenshot) Base1_Test.sdriver;
	  File file = ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("");
	  FileHandler.copy(file, dest);
	 }
	 
	 public void webElementScreenShot(WebElement element) throws IOException {
	  TakesScreenshot ts=(TakesScreenshot) Base1_Test.sdriver;
	  File file = element.getScreenshotAs(OutputType.FILE);
	  File dest=new File("");
	  FileHandler.copy(file, dest);
	 }

	}

