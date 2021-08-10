import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtDeNotas = entrada.nextInt();

        double[] notas = new double[qtDeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // Foreach
        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        System.out.println("A média é: " + (total/notas.length));
        entrada.close();
    }
}
