public class Christmas
{
    public static void main(String[] args)
    {
        System.out.println("The Twelve Days of Christmas - Lyrics");
        System.out.println();
        for(int i = 1; i <= 12; i++)
        {
            System.out.print("On the");

            switch(i)
            {
                case 1:
                    System.out.print(" first ");
                    break;
                case 2:
                    System.out.print(" second ");
                    break;
                case 3:
                    System.out.print(" third ");
                    break;
                case 4:
                    System.out.print(" fourth ");
                    break;
                case 5:
                    System.out.print(" fifth ");
                    break;
                case 6:
                    System.out.print(" sixth ");
                    break;
                case 7:
                    System.out.print(" seventh ");
                    break;
                case 8:
                    System.out.print(" eighth");
                    break;
                case 9:
                    System.out.print(" ninth ");
                    break;
                case 10:
                    System.out.print(" tenth ");
                    break;
                case 11:
                    System.out.print(" eleventh ");
                    break;
                case 12:
                    System.out.print(" twelfth");
                    break;
            }
            
            System.out.println("day of Christmas, my true love sent to me");
            
            for(int k = i; k >= 0; k--)
            {
                switch(k)
                {
                    case 1:
                        if(i > 1)
                        {
                            System.out.print("and ");
                        }
                        System.out.println("a Partridge in a Pear Tree.");
                        break;
                    case 2:
                        System.out.println("Two turtle doves,");
                        break;
                    case 3:
                        System.out.println("Three french hens,");
                        break;
                    case 4:
                        System.out.println("Four calling birds,");
                        break;
                    case 5:
                        System.out.println("Five golden rings,");
                        break;
                    case 6:
                        System.out.println("Six geese a-laying,");
                        break;
                    case 7:
                        System.out.println("Seven swans a-swimming,");
                        break;
                    case 8:
                        System.out.println("Eight maids a-milking,");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing,");
                        break;
                    case 10:
                        System.out.println("Ten lords a-leaping,");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping,");
                        break;
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                        break;
                }
            }
            System.out.println();
        }
    }
}
