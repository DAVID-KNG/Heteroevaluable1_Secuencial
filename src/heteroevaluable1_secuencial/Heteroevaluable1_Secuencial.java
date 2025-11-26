package heteroevaluable1_secuencial;

import java.util.Random;

public class Heteroevaluable1_Secuencial {

    public static final int N = 10;

    public static void main(String[] args) {

        int suma;
        int[][][] notas = new int[2][N][5];

        rellenar(notas);

        imprimir(notas[0]);
        
        System.out.println("");
        
        imprimir(notas[1]);
        
        suma = sumar(notas);

        System.out.println("La suma de las notas es " + suma);

    }

    public static void rellenar(int[][][] notas) {
        Random random = new Random();
        for (int año = 0; año < 2; año++) {
            for (int alumno = 0; alumno < N; alumno++) {
                for (int modulo = 0; modulo < 5; modulo++) {
                    notas[año][alumno][modulo] = random.nextInt(11);
                }
            }
        }
    }

    public static int sumar(int[][][] notas) {
        int suma = 0;
        for (int año = 0; año < 2; año++) {
            for (int alumno = 0; alumno < N; alumno++) {
                for (int modulo = 0; modulo < 5; modulo++) {
                    suma += notas[año][alumno][modulo];
                }
            }
        }
        return suma;
    }

    public static void imprimir(int [][] notas) {
        for (int alumno = 0; alumno < N; alumno++) {
            for (int modulo = 0; modulo < 5; modulo++) {
                System.out.print(" "+notas[alumno][modulo]);
            }
            System.out.println("");
        }
    }    
}
