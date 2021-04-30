package prueba.falabella.steps;

import net.thucydides.core.annotations.Step;
import prueba.falabella.pageobjects.PaginaFalabellaObject;

public class IngresoPaginaSteps {

	PaginaFalabellaObject paginaFalabellaObject;

	@Step
	public void ingresoFalabella(String strFalabella) {

		paginaFalabellaObject.open();
		paginaFalabellaObject.busqueda(strFalabella);

	}

	@Step
	public void loEncontreFalabella(String strLoEncontreFall) {
		// TODO Auto-generated method stub
		paginaFalabellaObject.seleccionaOpcion(strLoEncontreFall);
	}

	@Step
	public void cerrarPopUp() {
		// TODO Auto-generated method stub
		paginaFalabellaObject.objPopUp();
	}

	@Step
	public void tbxBuscar(String strCelulares) {
		// TODO Auto-generated method stub
		paginaFalabellaObject.objTextBox(strCelulares);
	}

	@Step
	public void seleccionarCelular(String strCelular) {
		// TODO Auto-generated method stub
		paginaFalabellaObject.agregaCel(strCelular);
	}

	@Step
	public void agregarABolsa() throws InterruptedException {
		// TODO Auto-generated method stub
		paginaFalabellaObject.agregarABolsa();
	}

	@Step
	public void validaSubTotal() {
		// TODO Auto-generated method stub
		paginaFalabellaObject.validaSubTotal();
	}

}
