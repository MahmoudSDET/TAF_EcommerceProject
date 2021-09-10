package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdersHistoryPage  extends PageBase{

	
	WebDriverWait wait;
	Actions act;
	public OrdersHistoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		wait =new WebDriverWait(driver, 30);
		act= new Actions(driver);
	}
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr/td[1]/a")
public	WebElement OrderReference;

}
