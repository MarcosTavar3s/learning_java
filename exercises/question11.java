import java.util.Scanner;

public class question11
{
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float cost = reader.nextFloat();
        reader.close();
        
        float price = (float)(1.57 * cost);
        System.out.println("Car price is " + price);
        
	}
}
