package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartandcheckout {
	
	WebDriver dr;
	
	By checkoutbtn = By.id("checkout");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By continuebtn = By.id("continue");
	By finishbtn = By.id("finish");
	By successmsg = By.className("complete-header");
	By cartpagetitle = By.className("title");
	
	public cartandcheckout(WebDriver dr) {
		this.dr = dr;
	}
	
	public String cartpagetitle() {
		return dr.findElement(cartpagetitle).getText();
	}
	
	public void checkout() {
		dr.findElement(checkoutbtn).click();
	}
	
	public void shipping_Details(String fname, String lname, String postal) {
		dr.findElement(firstname).sendKeys(fname);
		dr.findElement(lastname).sendKeys(lname);
		dr.findElement(postalcode).sendKeys(postal);
	}
	
	public void finish() {
		dr.findElement(finishbtn).click();
	}
	
	public void continuebtn() {
		dr.findElement(continuebtn).click();
	}
	
	public String successmsg	() {
		return dr.findElement(successmsg).getText();
	}
}	
