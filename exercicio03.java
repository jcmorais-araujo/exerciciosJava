import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome da semana: ");

        String semana = entrada.nextLine();
        // int numero = Integer.parseInt(semana);

        // O equals é utilizado quando comparamos strings!!!
        // o equalsIgnoreCase -> além de comparar strings ele ignora se as letras estão
        // maiusculas ou minusculas
        if (semana.equalsIgnoreCase("domingo")) {
            System.out.println("O domingo é o primeiro dia da semana");
        } else if (semana.equalsIgnoreCase("segunda")) {
            System.out.println("A segunda-feira é o segundo dia da semana");
        } else if (semana.equalsIgnoreCase("terça") || semana.equalsIgnoreCase("terca")) {
            System.out.println("A terça-feira é o terceiro dia da semana");
        } else if (semana.equalsIgnoreCase("quarta")) {
            System.out.println("A quarta-feira é o quarto dia da semana");
        } else if (semana.equalsIgnoreCase("quinta")) {
            System.out.println("A quinta-feira é o quinto dia da semana");
        } else if (semana.equalsIgnoreCase("sexta")) {
            System.out.println("A sexta-feira é o sexto dia da semana");
        } else if (semana.equalsIgnoreCase("sábado") || semana.equalsIgnoreCase("sabado")) {
            System.out.println("O sábado é o sétimo dia da semana");
        }

        entrada.close();

    }
}
