

  Feature: Flujo de compra exitosa en pagina Demoblaze - Evelyn Balseca

    @testCompra
    Scenario: El usuario realiza una compra exitosa
      Given el usuario ingresa a la pagina demoblaze "https://www.demoblaze.com/"
      When selecciona el primer producto
      And agrega al carrito el primer producto
      And da clic en Aceptar agregar al carrito para el primer producto
      And regresa al home de la pagina demoblaze "https://www.demoblaze.com/index.html"
      And selecciona el segundo producto
      And agrega al carrito el segundo producto
      And da clic en Aceptar agregar al carrito para el segundo producto
      And va al carrito el compras "https://www.demoblaze.com/cart.html"
      And ordena la compra
      Then completa el formulario de compra y finaliza la compra y se muestra el mensaje "Thank you for your purchase!"