package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.demo.modelos.Pedido;
import org.junit.Assert;

public class EntregaGratuitaSteps {

    Pedido pedido = new Pedido();

    @Given("^el comprador es un cliente (.*)$")
    public void indicarTipoClienteQueRealizaElPedido(String tipoCliente) {
        pedido.setTipoCliente(tipoCliente);
    }

    @When("^realiza la compra de (.*) (.*)$")
    public void agregaProductosAlPedido(Integer cantidad, String producto) {
        pedido.agregar(cantidad, producto);
    }

    @Then("^debe pagar (.*)$")
    public void debePagar(int valorPagar) {
        int costoEnvio = pedido.calcularCostoEnvio();
        Assert.assertEquals(valorPagar, costoEnvio);
    }

}
