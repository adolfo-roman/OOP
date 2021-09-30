import java.util.Scanner;

public class Sphere
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera: ");

        float RAD = scan.nextFloat();

        System.out.printf("El area de la esfera es: %.2f u^2\n", (RAD * RAD * 3.1416));
        System.out.printf("El volumen de la esfera es: %.2f u^3\n", (4/3)*(RAD * RAD * RAD * 3.1416));
    }
}
