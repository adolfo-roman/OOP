import java.util.Scanner;

public class Numbers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = scan.nextInt();

        System.out.println("La suma de los numeros es: " + (a + b));
        System.out.println("El producto de los numeros es: " + (a * b));
        System.out.println("La diferencia de los numeros es: " + (a - b));
        System.out.println("El cociente de los numeros es: " + (float)a / (float)b);
    }
}
