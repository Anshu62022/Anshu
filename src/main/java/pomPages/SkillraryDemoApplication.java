package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {
	@FindBy(id="course")
	private WebElement cousetab;
	
	public WebElement getCousetab() {
		return cousetab;
	}
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApplication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

}
