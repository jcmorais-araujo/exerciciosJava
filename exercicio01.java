import java.util.Scanner;

/**
 * exercicio01
 */
public class exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média do estudante:");
        double media = entrada.nextDouble();

        if (media >= 7.0 && media < 10) {
            System.out.println("Aluno aprovado");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("Aluno em recuperação");
        }

        if (media < 4.5 && media >= 0) {
            System.out.println("Aluno reprovado");
        }
        entrada.close();
    }
}