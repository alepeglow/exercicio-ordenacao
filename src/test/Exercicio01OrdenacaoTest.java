import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Exercicio01OrdenacaoTest {

    @Test
    public void deveOrdenarNumerosSimples() {
        String resultado = Exercicio01Ordenacao.ordenarCincoNumeros(5, 2, 3, 1, 4);

        assertEquals("1 2 3 4 5", resultado);
    }

    @Test
    public void deveOrdenarNumerosRepetidos() {
        String resultado = Exercicio01Ordenacao.ordenarCincoNumeros(5, 5, 3, 3, 1);
        assertEquals("1 3 3 5 5", resultado);
    }

    @Test
    public void deveOrdenarNumerosNegativosEZero() {
        String resultado = Exercicio01Ordenacao.ordenarCincoNumeros(-1, 0, 5, -10, 2);
        assertEquals("-10 -1 0 2 5", resultado);
    }

    @Test
    public void deveOrdenarValoresExtremosDeInt() {
        String resultado = Exercicio01Ordenacao.ordenarCincoNumeros(
                Integer.MAX_VALUE, 0, -5, 10, Integer.MIN_VALUE);

        assertEquals(Integer.MIN_VALUE + " -5 0 10 " + Integer.MAX_VALUE, resultado);
    }

}

