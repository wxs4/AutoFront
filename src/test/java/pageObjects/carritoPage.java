package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class carritoPage extends util {
    @FindBy(name = "quantity") private WebElement cmbCantidad;
    @FindBy(xpath = "//*[@type='submit' and @value='Buy Now']") private WebElement btnComprar;

    public carritoPage() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarCantidad(String cantidad){
        wait.until(ExpectedConditions.visibilityOf(cmbCantidad));
        new Select(cmbCantidad).selectByVisibleText(cantidad);
    }
    public void comprar(){
        btnComprar.click();
    }
}
