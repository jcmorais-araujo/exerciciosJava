public class exercicio07_FOR {
    public static void main(String[] args) {
        // int x = 10;
        // for (x = 10; x >= 0; x -= 2) {
        // System.out.println(x);

        String valor = "#";
        // String valor2 = "#####";

        for (valor = "#"; !valor.equals("######"); valor += "#") {
            System.out.println(valor);
        }

    }
}
