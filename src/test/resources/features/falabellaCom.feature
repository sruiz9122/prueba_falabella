#Author: sruiz9122@gmail.com

@Regresion
Feature: Validacion todos los escenarios
 

  @CasoPrincipal
  Scenario: Comparacion agrega productos celular a canasta
    Given Ingreso a la pagina "falabella" mediante google
    And Seleccionar la opcion "Lo encontré en Falabella.com" e ingresar
    And Cerrar Pop-Up
    When Buscar "celulares" en la página
    And Seleccionar el celular "iPhone SE 64GB" y agregar a la bolsa
    And Asegurar pantalla y ver bolsa de compras
    Then Valida sub-total


 
