package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver dr;
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	
	public login(WebDriver dr) {
		this.dr = dr;
	}
	
	public void username(String uname) {
		dr.findElement(username).sendKeys(uname);
	}
	
	public void password(String pass) {
		dr.findElement(password).sendKeys(pass);
	}
	
	public void loginbtn() {
		dr.findElement(loginbtn).click();
	}
}
