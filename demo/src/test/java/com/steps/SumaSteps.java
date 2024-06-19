package com.steps;
import com.example.modelos.Calculos; // Importar la clase Calculos
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaSteps {

    private Calculos calculadora; // Atributo para almacenar la instancia de la calculadora
    private double resultado;

    public SumaSteps() {
        calculadora = new Calculos(); // Inicializar la calculadora
    }

    @Given("que tengo una calculadora")
    public void tengoUnaCalculadora() {
        // No se necesita implementar nada aquí, ya que la calculadora se inicializa en el constructor
    }

    @When("sumo {a} de {b}")
    public void sumoDosNumeros(double a, double b) {
        // Implementar la lógica para sumar los dos números usando la calculadora
        resultado = calculadora.suma(a, b);
    }

    @Then("el resultado debe ser {resultado}")
    public void elResultadoEs(double resultadoEsperado) {
        // Verificar que el resultado de la suma sea igual al resultado esperado
        // Assert.assertEquals(resultadoEsperado, resultado);
        assertEquals(resultadoEsperado, resultado);
    }
}
