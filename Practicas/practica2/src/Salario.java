/**
 * El siguiente programa obtiene el salario del trabajador y lo aumenta de acuerdo con su
 * valor.
 */

import java.util.Scanner;

public class Salario
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insertar Salario: ");
        float salario = scan.nextFloat();

        String porcen;

        System.out.println("Salario inicial fue de " + salario);

        if(salario < 18000)
        {
            salario = (float) (salario + (salario * 0.12));
            porcen = "12%";
        }
        else if(18000 <= salario && salario <= 30000)
        {
            salario = (float) (salario + (salario * 0.08));
            porcen = "8%";
        }
        else if(30000 < salario && salario <= 50000)
        {
            salario = (float) (salario + (salario * 0.07));
            porcen = "7%";
        }
        else
        {
            salario = (float) (salario + (salario * 0.06));
            porcen = "6%";
        }

        System.out.println("Salario final es de " + salario);
        System.out.println("Incremento a su salario fue de " + porcen);
    }
}
