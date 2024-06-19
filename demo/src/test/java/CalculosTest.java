import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import io.cucumber.junit.platform.engine.Cucumber;
import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.extension.ExtendWith;

import com.example.modelos.Calculos;

@Cucumber
@TestInstance(Lifecycle.PER_CLASS)

public class CalculosTest {

    @Test
    public void testSuma(){
        Calculos calc = new Calculos();
        var resultado = calc.suma(2, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void testResta(){
        Calculos calc = new Calculos();
        var resultado = calc.resta(1, 4);
        assertEquals(-3, resultado);
        
    }

    @Test
    public void testCuadradoBinimio(){
        Calculos calc = new Calculos();
        var binomio = calc.CuadradoBinomio(4, 2);
        assertEquals(36, binomio);
    }

    @Test
    public void testIntegracion(){
        Calculos calc = new Calculos();
        double a= 4;
        double b= 2;

        double suma = calc.suma(a, b);
        double resta = calc.resta(a, b);
        double binomio = calc.CuadradoBinomio(a, b);

        assertEquals(6, suma, "La suma de 4 y 2 debería ser 6");
        assertEquals(2, resta, "La resta de 4 y 2 debería ser 2");
        assertEquals(36, binomio, "El cuadrado del binomio (4+2)^2 debería ser 36");

        // Verificando la interacción de los métodos
        double resultadoTotal = suma + resta + binomio;
        double resultadoEsperado = 6 + 2 + 36;
        assertEquals(resultadoEsperado, resultadoTotal, "El resultado total debería ser 44");
    }


}
