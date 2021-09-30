import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Enteros
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int b = scan.nextInt();
        System.out.println("Ingrese un tercer numero: ");
        int c = scan.nextInt();
        Integer[] arr = {a,b,c};
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("La suma de los numeros es: " + (a + b + c));
        System.out.println("El promedio de los numeros es: " + ((float)(a + b + c))/3);
        System.out.println("El producto de los numeros es: " + (a * b * c));
        System.out.println("El menor de los numeros es: " + min);
        System.out.println("El mayor de los numeros es: " + max);
    }
}
