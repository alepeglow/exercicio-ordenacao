import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Exercicio02RomanosParamTest {

    private int entrada;
    private String esperado;

    public Exercicio02RomanosParamTest(int entrada, String esperado) {
        this.entrada = entrada;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dados() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {3, "III"},
                {4, "IV"},
                {9, "IX"},
                {58, "LVIII"},
                {1994, "MCMXCIV"},
                {3888, "MMMDCCCLXXXVIII"}
        });
    }

    @Test
    public void deveConverterCorretamenteVariosNumeros() {
        String resultado = Exercicio02Romanos.converterParaRomano(entrada);
        assertEquals(esperado, resultado);
    }
}

