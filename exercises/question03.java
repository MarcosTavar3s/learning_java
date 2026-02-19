import java.util.Scanner;

// calculates money spent on cigarretes
public class question03{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the price of a cigarrete: ");
        float price = reader.nextFloat(); 
        System.out.print("Type how many years you have smoked: ");
        int years = reader.nextInt();
        System.out.print("Type how many cigarretes you have smoked daily: ");
        int cigarretesPerDay = reader.nextInt();
        reader.close();

        // supposing that there aren't leap years
        float cost = 365 * cigarretesPerDay * years * price;
        
        System.out.println("Money spent on cigarretes: R$" + String.format("%.2f", cost));
        }
}
