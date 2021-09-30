/**
 * El siguiente programa obtiene el numero mayor de 3 ingresados.
 */

import java.util.Scanner;

public class Mayor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa numero 1: ");
        float N1 = scan.nextFloat();
        System.out.println("Ingresa numero 2: ");
        float N2 = scan.nextFloat();
        System.out.println("Ingresa numero 3: ");
        float N3 = scan.nextFloat();

        float biggest = N1 > N2 ? N1 : N2;
        biggest = biggest > N3 ? biggest : N3;

        System.out.println("Numero mayor es: " + biggest);
    }
}
