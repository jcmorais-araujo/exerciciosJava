import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        // Pegar as informações:
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        // Gerar a matriz multidimensional
        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;

        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", (j+1), (i+1));
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);

        entrada.close();
    }
}
