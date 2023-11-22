package Application;

import java.util.Locale;
import java.util.Scanner;

public class BiArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posicao [" + i +", " + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }

        }

        System.out.println("Diagonal principal: ");

        for (int i = 0; i < n; i++) {
                System.out.println(matriz[i][i] + " ");

        }

        System.out.println("Numeros negativos: ");
        int cont = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.print(cont);


    }
}