import java.util.Scanner;

public class Algoritmos {

    public static void main(String[] args){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea calcular: ");
        n = entrada.nextInt();
        int [] arrayfibonacci = fibonacci(n);
        int [] arrayprimos = primos(n);
        System.out.println("Números primos:");
        for(int i = 0; i < n; i++){
            System.out.print(arrayprimos [i] + ", ");
        }
        System.out.print("...");
        System.out.println();
        System.out.println("Sucesión de fibonacci:");
        for(int i = 0; i < n; i++){
            System.out.print(arrayfibonacci [i] + ", ");
        }
        System.out.print("...");
    }
    public static int [] primos(int n){
        int[] serieprimos = new int[n];
        int numprimo = 1;
        for (int i = 0; i < n; i++){
            int aumento = 2;
            while (numprimo != aumento){
                aumento = 2;
                while (numprimo % aumento != 0){
                    aumento += 1;
                }
                if (numprimo != aumento){
                    numprimo += 1;
                }
            }
            serieprimos [i] = numprimo;
            numprimo += 1;
        }
        return serieprimos;
    }
    public static int [] fibonacci(int n){
        int[] seriefibonacci = new int[n];
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < n; i++){
            seriefibonacci [i] = num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return seriefibonacci;
    }
}