import java.util.Scanner;

public class exercicio04_while {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // System.out.println("Informe um texto (para finalizar escreva SAIR): ");
        String nome = "";

        while (!nome.equalsIgnoreCase("sair") || !nome.equalsIgnoreCase("SAIR")) {

            System.out.println("Informe um texto (para finalizar escreva SAIR): ");
            nome = entrada.nextLine();
            // continue;

        }

        entrada.close();

    }
}
