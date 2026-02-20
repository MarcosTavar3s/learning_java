import java.util.Scanner;

// calculates a arithmetic progression
public class question08{
	public static void main(String[] args) {
	    float common_difference, first_n, last_n, n;
	   // int n;
	    
        Scanner reader = new Scanner(System.in);
        System.out.println("Common difference: ");
        common_difference = reader.nextFloat();
        System.out.println("First number: ");
        first_n = reader.nextFloat();
        System.out.println("Last number: ");
        last_n = reader.nextFloat();
		reader.close();

        n = (last_n - first_n) / common_difference + 1;
        
        System.out.println("Arithmetic progression sum: " + (n/2 * (first_n + last_n)));
	}
}
