public class Exercicio02Romanos {

    public static String converterParaRomano(int numero) {

        if (numero < 1 || numero > 3999) {
            throw new IllegalArgumentException("Número fora do intervalo permitido (1 a 3999)");
        }

        int[] valores =    {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
        String[] simbolos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder romano = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                romano.append(simbolos[i]);
                numero -= valores[i];
            }
        }

        return romano.toString();
    }

    public static void main(String[] args) {
        // só pra testar manualmente por enquanto
        System.out.println(converterParaRomano(1));    // I
        System.out.println(converterParaRomano(4));    // IV
        System.out.println(converterParaRomano(9));    // IX
        System.out.println(converterParaRomano(58));   // LVIII
        System.out.println(converterParaRomano(1994)); // MCMXCIV
    }
}

