package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraydemoapp;
	
	public SkillaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void gerasbutton() {
		gerasbtn.click();
	}
	public void skillrraydemoApplication() {
		skillraydemoapp.click();
	}
}
