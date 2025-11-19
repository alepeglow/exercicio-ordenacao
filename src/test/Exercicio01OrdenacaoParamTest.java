import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class Exercicio01OrdenacaoParamTest {

    @RunWith(Parameterized.class)
    public static class Parametrizados {

        private int n1, n2, n3, n4, n5;
        private String esperado;

        public Parametrizados(int n1, int n2, int n3, int n4, int n5, String esperado) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
            this.n4 = n4;
            this.n5 = n5;
            this.esperado = esperado;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> dados() {
            return Arrays.asList(new Object[][]{
                    {5, 2, 3, 1, 4, "1 2 3 4 5"},
                    {5, 5, 3, 3, 1, "1 3 3 5 5"},
                    {-1, 0, 5, -10, 2, "-10 -1 0 2 5"},
                    {8, 8, 8, 8, 8, "8 8 8 8 8"}
            });
        }

        @Test
        public void deveOrdenarCorretamenteComVariosConjuntosDeDados() {
            String resultado =
                    Exercicio01Ordenacao.ordenarCincoNumeros(n1, n2, n3, n4, n5);

            assertEquals(esperado, resultado);
        }
    }
}
