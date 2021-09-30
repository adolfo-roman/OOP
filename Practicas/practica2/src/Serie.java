import java.util.Scanner;

public class Serie
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese ultimo denominador a sumar:");

        int N = scan.nextInt();
        float ans = 0;

        for (int i = 1; i <= N; i++)
        {
            ans += 1/(float)i;
        }

        System.out.println("El resultado es " + ans);
    }
}
