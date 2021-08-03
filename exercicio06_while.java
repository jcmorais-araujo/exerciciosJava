import java.util.Scanner;

public class exercicio06_while {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdDeNotas = 0;
        double nota = 0;
        double totalNota = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                totalNota += nota;
                qtdDeNotas++;

            }

        }

        // Calcular a média
        double media = totalNota / qtdDeNotas;
        System.out.printf("A média é: %.2f", media);

        entrada.close();

    }

}
