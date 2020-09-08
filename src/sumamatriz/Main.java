package sumamatriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\033[34mNÚMERO DE FILAS:\033[m");
        int i = entrada.nextInt();
        System.out.println("\033[34mNÚMERO DE COLUMNAS:\033[m");
        int j = entrada.nextInt();
        SumaMatriz m = new SumaMatriz(i, j);
        m.llenarMatriz();
        m.imprimirMatriz();
        m.sumarMatrices();
    }
}
