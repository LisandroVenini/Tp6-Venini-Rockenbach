package com.steps;
import com.example.modelos.Calculos; // Importar la clase Calculos
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuadradoBinomioSteps {

    private Calculos calculadora; // Atributo para almacenar la instancia de la calculadora
    private double resultado;

    public CuadradoBinomioSteps() {
        calculadora = new Calculos(); // Inicializar la calculadora
    }

    @Given("que tengo una calculadora")
    public void tengoUnaCalculadora() {
        // No se necesita implementar nada aquí, ya que la calculadora se inicializa en el constructor
    }

    @When("calculo el cuadrado del binomio de {a} y {b}")
    public void restoDosNumeros(double a, double b) {
        // Implementar la lógica para calcular el cuadrado del binomio de los dos números usando la calculadora
        resultado = calculadora.CuadradoBinomio(a, b);
    }

    @Then("el resultado debe ser {resultado}")
    public void elResultadoEs(double resultadoEsperado) {
        // Verificar que el resultado sea igual al resultado esperado
        // Assert.assertEquals(resultadoEsperado, resultado);
        assertEquals(resultadoEsperado, resultado);
    }
}