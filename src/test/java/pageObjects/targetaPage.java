package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class targetaPage extends util {
    public static String nroTargeta;
    public static String cvv;
    public static String mes;
    public static String anio;
    @FindBy(xpath = "//*[contains(text(),'Card Number:-')]") private WebElement lblTargeta;
    @FindBy(xpath = "//*[contains(text(),'CVV:-')]") private WebElement lblCvv;
    @FindBy(xpath = "//*[contains(text(),'Exp:-')]") private WebElement lblExp;

    public targetaPage() {
        PageFactory.initElements(driver,this);
    }

    public void obtenerNroTargeta(){
        wait.until(ExpectedConditions.visibilityOf(lblTargeta));
        String texto = lblTargeta.getText();
        nroTargeta = texto.replace("Card Number:- ","");
        System.out.println(nroTargeta);

    }

    public void obtenerCvv(){
        String texto = lblCvv.getText();
        cvv = texto.replace("CVV:- ","");
        System.out.println(cvv);
    }

    public  void obtenerExp(){
        String texto = lblExp.getText();
        String fecha[] = texto.replace("Exp:- ","").split("/");
        mes = fecha[0];
        anio = fecha[1];
        System.out.println("Mes:"+mes+" ,Año:"+anio);
    }
}
