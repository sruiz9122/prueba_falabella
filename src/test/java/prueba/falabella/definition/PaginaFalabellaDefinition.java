package prueba.falabella.definition;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import prueba.falabella.steps.IngresoPaginaSteps;


public class PaginaFalabellaDefinition {

	@Steps
	IngresoPaginaSteps ingresoPaginaSteps;

	@Given("^Ingreso a la pagina \"([^\"]*)\" mediante google$")
	public void ingreso_a_la_pagina_mediante_google(String strFalabella) {

		ingresoPaginaSteps.ingresoFalabella(strFalabella);

	}

	@And("^Seleccionar la opcion \"([^\"]*)\" e ingresar$")
	public void seleccionar_la_opcion_e_ingresar(String strLoEncontreFall) {

		ingresoPaginaSteps.loEncontreFalabella(strLoEncontreFall);

	}

	@And("^Cerrar Pop-Up$")
	public void cerrar_Pop_Up() {
		ingresoPaginaSteps.cerrarPopUp();
		
	}

	@When("^Buscar \"([^\"]*)\" en la página$")
	public void buscar_en_la_página(String strCelulares)   {

		ingresoPaginaSteps.tbxBuscar(strCelulares);

	}

	@And("^Seleccionar el celular \"([^\"]*)\" y agregar a la bolsa$")
	public void seleccionar_el_celular_y_agregar_a_la_bolsa(String strCelular) {

		ingresoPaginaSteps.seleccionarCelular(strCelular);

	}

	@And("^Asegurar pantalla y ver bolsa de compras$")
	public void asegurar_pantalla_y_ver_bolsa_de_compras() throws InterruptedException  {

		ingresoPaginaSteps.agregarABolsa();

	}

	@Then("^Valida sub-total$")
	public void valida_sub_total() {

		ingresoPaginaSteps.validaSubTotal();

	}

}
