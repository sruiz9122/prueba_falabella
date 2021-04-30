package prueba.falabella.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.google.com/")
public class PaginaFalabellaObject extends PageObject {

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	public WebElementFacade txtFalabella;

	@FindBy(xpath = "//*[@id=\'rso\']/div[1]/div/div/div/div/div/div[1]/a/h3")
	public WebElementFacade opcLoEncontreFalabella;

	@FindBy(xpath = "//*[@id=\'fake-close\']")
	public WebElementFacade btnCerrarPopUp;

	@FindBy(xpath = "//*[@id=\'acc-alert-deny\']")
	public WebElementFacade btnNoaceptoAlertas;

	@FindBy(xpath = "/html/body/div[1]/nav/div[3]/div/div[1]/div/div[1]/div/input")
	public WebElementFacade tbxBuscar;

	@FindBy(id="testId-pod-displaySubTitle-prod10900028")
	public WebElementFacade opCelular;

	@FindBy(id="testId-Pod-action-prod10900028")
	public WebElementFacade addCelular;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/section[2]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/button[1]")
	public WebElementFacade btnAsegurarPantalla;

	@FindBy(id="linkButton")
	public WebElementFacade btnVerBolsaCompras;

	@FindBy(css="#root > div.fb-basket__order-container > div.fb-basket__order-container__summary > div.fb-order-status > form > div:nth-child(1) > div > div:nth-child(1) > p > span.fb-order-status__sub-totals__value.notranslate.undefined")
	public WebElementFacade txtResumenUno;

	@FindBy(xpath="//*[@id=\'root\']/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button")
	public WebElementFacade btnIrAComprar;

	@FindBy(xpath="//*[@id=\"fbra_checkoutOrderSummary\"]/div/section/div/span[2]")
	public WebElementFacade txtResumenDos;

	public void busqueda(String strFalabella) {
		// TODO Auto-generated method stub
		txtFalabella.typeAndEnter(strFalabella);
	}

	public void seleccionaOpcion(String strLoEncontreFall) {
		// TODO Auto-generated method stub

		String strMensaje = opcLoEncontreFalabella.getText();
		assertThat(strMensaje, containsString(strLoEncontreFall));
		opcLoEncontreFalabella.click();
	}

	public void objPopUp() {
		// TODO Auto-generated method stub
		btnCerrarPopUp.click();
		//btnNoaceptoAlertas.click();
	}

	public void objTextBox(String strCelulares) {
		// TODO Auto-generated method stub
		tbxBuscar.typeAndEnter(strCelulares);
	}

	public void agregaCel(String strCelular) {
		// TODO Auto-generated method stub
		String strMensaje = opCelular.getText();
		assertThat(strMensaje, containsString(strCelular));
		addCelular.click();
	}

	public void agregarABolsa() throws InterruptedException {
		// TODO Auto-generated method stub
		btnAsegurarPantalla.click();
		Thread.sleep(100);
		btnVerBolsaCompras.click();
		Thread.sleep(100);

	}

	public void validaSubTotal() {
		// TODO Auto-generated method stub
		String strResumenUno = txtResumenUno.getText().trim().replace("$", "");
		System.out.println(strResumenUno);
		btnIrAComprar.click();
		String strResumenDos = txtResumenDos.getText().trim().replace("$", "");
		System.out.println(strResumenDos);
		assertThat(strResumenUno, containsString(strResumenDos));

	}



}
