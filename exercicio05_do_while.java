import java.util.Scanner;

public class exercicio05_do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");
        entrada.close();

    }
}
