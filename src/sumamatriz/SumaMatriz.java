package sumamatriz;

import java.util.Scanner;

public class SumaMatriz {

    int[][] enterosA;
    int[][] enterosB;
    int[][] resultado;

    public SumaMatriz(int i, int j) {
        enterosA = new int[i][j];
        enterosB = new int[i][j];
        resultado = new int[i][j];
    }

    public void llenarMatriz() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("\033[35mDatos de la matriz A\033[m");
        for (int i = 0; i < enterosA.length; i++) {
            for (int j = 0; j < enterosA.length; j++) {
                System.out.print("\033[36mFILA: " + i + " COLUMNA: " + j + " = \033[m");
                enterosA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("=====================");
        System.out.println("\033[35mDatos de la matriz B\033[m");
        for (int i = 0; i < enterosB.length; i++) {
            for (int j = 0; j < enterosB[i].length; j++) {
                System.out.print("\033[36mFILA: " + i + " COLUMNA: " + j + " = \033[m");
                enterosB[i][j] = entrada.nextInt();

            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("====================="
                + "\n\033[32mMatriz A\033[m");
        for (int i = 0; i < enterosA.length; i++) {
            for (int j = 0; j < enterosA.length; j++) {
                System.out.print(enterosA[i][j] + "  ");

            }
            System.out.println(" ");

        }
        System.out.println("====================="
                + "\n\033[32mMatriz B\033[m");
        for (int i = 0; i < enterosB.length; i++) {
            for (int j = 0; j < enterosB.length; j++) {
                System.out.print(enterosB[i][j] + "  ");

            }
            System.out.println(" ");
        }
    }

    public int[][] sumarMatrices() {
        System.out.println("====================="
                + "\n  \033[31mSUMA\033[m");

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[i][j] = enterosA[i][j] + enterosB[i][j];
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                System.out.println("" + enterosA[i][j] + " + " + enterosB[i][j] + " = " + resultado[i][j]);
            }
        }
        System.out.println("====================="
                + "\n\033[36mRESULTADO\033[m");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                System.out.print(resultado[i][j] + "  ");

            }
            System.out.println("   ");
        }
        return resultado;
    }
}
