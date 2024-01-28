#language:es
  @smoke01
Característica: Funcionalidad Carrito de compras
@escenario01
  Esquema del escenario: Escenario: Probar la compra de un producto
    Dado que la web se encuenta operativa
    Cuando genero el numero de targeta
    Y selecciono la cantidad '<cantidad>'
    Y realizo la compra
    E ingresa los datos de la targeta
    Y digita su clave CVV y termina la compra
    Entonces se valida el mensaje de pago '<mensaje>'
    Ejemplos:
      | cantidad | mensaje              |
      | 5        | Payment successfull! |

@escenario02
  Esquema del escenario: Escenario: Probar la compra de un producto
    Dado que la web se encuenta operativa
    Cuando genero el numero de targeta
    Y selecciono la cantidad '<cantidad>'
    Y realizo la compra
    E ingresa los datos de la targeta
    Y digita su clave CVV y termina la compra
    Entonces se valida el mensaje de pago '<mensaje>'
    Ejemplos:
      | cantidad | mensaje              |
      | 2        | Payment successfull! |
      | 1        | Payment successfull! |