import java.util.Scanner;

public class Exercicio01Ordenacao {

    // 👉 MÉTODO que vamos testar no JUnit
    public static String ordenarCincoNumeros(int n1, int n2, int n3, int n4, int n5) {

        // PASSADA 1
        if (n1 > n2) { int temp = n1; n1 = n2; n2 = temp; }
        if (n2 > n3) { int temp = n2; n2 = n3; n3 = temp; }
        if (n3 > n4) { int temp = n3; n3 = n4; n4 = temp; }
        if (n4 > n5) { int temp = n4; n4 = n5; n5 = temp; }

        // PASSADA 2
        if (n1 > n2) { int temp = n1; n1 = n2; n2 = temp; }
        if (n2 > n3) { int temp = n2; n2 = n3; n3 = temp; }
        if (n3 > n4) { int temp = n3; n3 = n4; n4 = temp; }
        if (n4 > n5) { int temp = n4; n4 = n5; n5 = temp; }

        // PASSADA 3
        if (n1 > n2) { int temp = n1; n1 = n2; n2 = temp; }
        if (n2 > n3) { int temp = n2; n2 = n3; n3 = temp; }
        if (n3 > n4) { int temp = n3; n3 = n4; n4 = temp; }
        if (n4 > n5) { int temp = n4; n4 = n5; n5 = temp; }

        // PASSADA 4
        if (n1 > n2) { int temp = n1; n1 = n2; n2 = temp; }
        if (n2 > n3) { int temp = n2; n2 = n3; n3 = temp; }
        if (n3 > n4) { int temp = n3; n3 = n4; n4 = temp; }
        if (n4 > n5) { int temp = n4; n4 = n5; n5 = temp; }

        return n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5;
    }


    // 👉 ESTE é o main — NÃO coloca métodos aqui dentro!
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, n5;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        n4 = sc.nextInt();

        System.out.print("Digite o quinto número: ");
        n5 = sc.nextInt();

        // Depois vamos chamar o método aqui:
        String resultado = ordenarCincoNumeros(n1, n2, n3, n4, n5);
        System.out.println("Ordenado: " + resultado);


        sc.close();
    }
}

