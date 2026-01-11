package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class browser {
	
	public static WebDriver dr;
	
	@Before
	public void launch_edge() {
		dr = new EdgeDriver();
		dr.manage().window().maximize();
	}
	
	@After
	public void tear() {
		dr.quit();
	}
}
