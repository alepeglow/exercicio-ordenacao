import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Exercicio02RomanosTest {
        @Test
        public void deveRetornarIPara1() {
            assertEquals("I", Exercicio02Romanos.converterParaRomano(1));
        }

    @Test
    public void deveRetornarIVPara4() {
        assertEquals("IV", Exercicio02Romanos.converterParaRomano(4));
    }

    @Test
    public void deveRetornarIXPara9() {
        assertEquals("IX", Exercicio02Romanos.converterParaRomano(9));
    }

    @Test
    public void deveRetornarXLPara40() {
        assertEquals("XL", Exercicio02Romanos.converterParaRomano(40));
    }

    @Test
    public void deveRetornarXCPara90() {
        assertEquals("XC", Exercicio02Romanos.converterParaRomano(90));
    }

    @Test
    public void deveRetornarCDPara400() {
        assertEquals("CD", Exercicio02Romanos.converterParaRomano(400));
    }

    @Test
    public void deveRetornarCMPara900() {
        assertEquals("CM", Exercicio02Romanos.converterParaRomano(900));
    }

    @Test
    public void deveRetornarIIIPara3() {
        assertEquals("III", Exercicio02Romanos.converterParaRomano(3));
    }

    @Test
    public void deveRetornarVIIIPara8() {
        assertEquals("VIII", Exercicio02Romanos.converterParaRomano(8));
    }

    @Test
    public void deveRetornarLVIIIPara58() {
        // 50 (L) + 5 (V) + 3 (III)
        assertEquals("LVIII", Exercicio02Romanos.converterParaRomano(58));
    }

    @Test
    public void deveRetornarMCMXCIVPara1994() {
        // 1000 (M) + 900 (CM) + 90 (XC) + 4 (IV)
        assertEquals("MCMXCIV", Exercicio02Romanos.converterParaRomano(1994));
    }

    @Test
    public void deveRetornarMMMDCCCLXXXVIIIPara3888() {
        assertEquals("MMMDCCCLXXXVIII", Exercicio02Romanos.converterParaRomano(3888));
    }

    @Test
    public void deveRetornarIParaMinimoValido() {
        assertEquals("I", Exercicio02Romanos.converterParaRomano(1));
    }

    @Test
    public void deveRetornarMMMCMXCIXParaMaximoValido() {
        assertEquals("MMMCMXCIX", Exercicio02Romanos.converterParaRomano(3999));
    }

    @Test
    public void deveLancarExcecaoParaZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicio02Romanos.converterParaRomano(0));
    }

    @Test
    public void deveLancarExcecaoParaNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicio02Romanos.converterParaRomano(-10));
    }

    @Test
    public void deveLancarExcecaoParaAcimaDoMaximo() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicio02Romanos.converterParaRomano(4000));
    }

    @Test
    public void deveLancarExcecaoParaIntegerMin() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicio02Romanos.converterParaRomano(Integer.MIN_VALUE));
    }

    @Test
    public void deveLancarExcecaoParaIntegerMax() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicio02Romanos.converterParaRomano(Integer.MAX_VALUE));
    }


}


