/**
 * orientacaoObjeto01
 */
public class orientacaoObjeto01 {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);

        Data d2 = new Data();
        d2.dia = 19;
        d2.mes = 01;
        d2.ano = 1991;

        System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);

    }

}