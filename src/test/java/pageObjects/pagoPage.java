package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class pagoPage extends util {

    @FindBy(id = "card_nmuber") private WebElement txtTargeta;
    @FindBy(id = "month") private WebElement cmbMes;
    @FindBy(id = "year") private WebElement cmbAnio;
    @FindBy(id = "cvv_code") private WebElement txtCvv;
    @FindBy(xpath = "//*[@type='submit' and @class='button special']") private  WebElement btnComprar;

    public pagoPage() {
        PageFactory.initElements(driver,this);
    }

    public void escribirTargeta(String targeta){
        wait.until(ExpectedConditions.visibilityOf(txtTargeta));
        txtTargeta.sendKeys(targeta);
    }
    public void seleccionarMes(String mes){
        new Select(cmbMes).selectByVisibleText(mes);
    }
    public void seleccionarAnio(String anio){
        new Select(cmbAnio).selectByVisibleText(anio);
    }
    public void ingresarCvv(String cvv){
        txtCvv.sendKeys(cvv);
    }
    public void clickComprar(){
        btnComprar.click();
    }

}
