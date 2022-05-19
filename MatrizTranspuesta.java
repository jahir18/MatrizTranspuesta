import java.util.Scanner;

public class MatrizTranspuesta {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        // Llenamos la matriz
        System.out.println("Digite los elementos de la primera matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "][" + j + "] : ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("");

        // Mostrar matriz.
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }

        int aux;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }

    }

}