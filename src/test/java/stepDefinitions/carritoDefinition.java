package stepDefinitions;

import io.cucumber.java.es.*;
import pageObjects.*;

import java.io.IOException;

import static support.util.evidencias;

public class carritoDefinition {
    menuPage menu ;
    targetaPage targeta;
    carritoPage carrito;
    pagoPage pago;
    confirmacionPage confirmacion;


    public carritoDefinition() {
        menu = new menuPage();
        targeta = new targetaPage();
        carrito = new carritoPage();
        pago = new pagoPage();
        confirmacion = new confirmacionPage();
    }

    @Dado("que la web se encuenta operativa")
    public void queLaWebSeEncuentaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("genero el numero de targeta")
    public void generoElNumeroDeTargeta() throws IOException {
        pago.scrollVertical();
        menu.clickGenerarTargeta();
        menu.ventanaActiva();
        targeta.obtenerNroTargeta();
        targeta.obtenerCvv();
        targeta.obtenerExp();
        menu.ventanaInicial();
        evidencias();
    }

    @Y("selecciono la cantidad {string}")
    public void seleccionoLaCantidadCantidad(String cantidad) throws IOException {
        pago.scrollVertical();
        carrito.seleccionarCantidad(cantidad);
        evidencias();
    }

    @Y("realizo la compra")
    public void realizoLaCompra() {
        pago.scrollVertical();
        carrito.comprar();
    }

    @E("ingresa los datos de la targeta")
    public void ingresaLosDatosDeLaTargeta() throws IOException {
        pago.scrollVertical();
        pago.escribirTargeta(targetaPage.nroTargeta);
        pago.seleccionarMes(targetaPage.mes);
        pago.seleccionarAnio(targetaPage.anio);
        evidencias();
    }

    @Y("digita su clave CVV y termina la compra")
    public void digitaSuClaveCVVYTerminaLaCompra() {
        pago.scrollVertical();
        pago.ingresarCvv(targetaPage.cvv);
        pago.clickComprar();
    }

    @Entonces("se valida el mensaje de pago {string}")
    public void seValidaElMensajeDePagoMensaje(String mensaje) throws IOException {
        confirmacion.validarMensaje(mensaje);
        confirmacion.mostrarCodigo();
        evidencias();
    }
}
