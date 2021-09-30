import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escoja la opcion deseada:");
        System.out.println("1. Pulgadas a Milimetros");
        System.out.println("2. Yardas a Metros");
        System.out.println("3. Millas a Kilometros");

        int option = scan.nextInt();
        float data;
        float temp;

        switch (option) {
            case 1:
                System.out.println("Indique pulgadas a convertir: ");
                data = scan.nextFloat();
                temp = data;
                data = (float) (data * 25.40);
                System.out.println(temp + " pulgadas, es igual a " + data + " milimetros.");
                break;
            case 2:
                System.out.println("Indique yardas a convertir: ");
                data = scan.nextFloat();
                temp = data;
                data = (float) (data * 0.9144);
                System.out.println(temp + " yardas, es igual a " + data + " metros.");
                break;
            case 3:
                System.out.println("Indique millas a convertir: ");
                data = scan.nextFloat();
                temp = data;
                data = (float) (data * 1.6093);
                System.out.println(temp + " millas, es igual a " + data + " kilometros.");
                break;
        }
    }
}
