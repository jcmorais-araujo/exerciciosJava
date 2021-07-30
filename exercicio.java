import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class exercicio {
    public static void main(String[] args) {

        // Programa para ler a temperatura em Fahrenheit e converte para Celsius
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");

        double Fahrenheit = entrada.nextDouble();

        double conversao = (Fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.2f °C", conversao);

        entrada.close();
    }

}
