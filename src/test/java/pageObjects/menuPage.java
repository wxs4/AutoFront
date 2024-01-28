package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(xpath = "//nav/a[@href='cardnumber.php']") private WebElement lnkGenerarTargeta;

    public menuPage() {
        PageFactory.initElements(driver,this);
    }
    public void clickGenerarTargeta(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkGenerarTargeta));
        lnkGenerarTargeta.click();
    }


}
