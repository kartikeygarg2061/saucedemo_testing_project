package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class productpage {
	
	WebDriver dr;
	
	By dropdown = By.className("product_sort_container");
	By firstprodname = By.xpath("//div[@class=\"inventory_list\"]/div[1]/div[2]/div/a/div");
	By addtocartbtn = By.xpath("//div[@class=\"inventory_list\"]/div[1]/div[2]/div[2]/button");
	By cartbtn = By.className("shopping_cart_link");
//	By cartbtn = By.id("shopping_cart_container");
	By cartpagetitle = By.className("title");
	
	public productpage(WebDriver dr) {
		this.dr = dr;
	}
	
	public String cartpagetitle() {
		return dr.findElement(cartpagetitle).getText();
	}
	
	public void dropdown() {
		WebElement drop = dr.findElement(dropdown);
		Select s = new Select(drop);
		s.selectByContainsVisibleText("Name (Z to A)");
	}
	
	public void addfirstprod() {
		dr.findElement(addtocartbtn).click();
	}
	
	public String firstprodname() {
		return dr.findElement(firstprodname).getText();
	}
	
	public void movetocart() {
		dr.findElement(cartbtn).click();
	}
}
