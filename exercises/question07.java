import java.util.Scanner;

// read 3 real numbers and verify if the first one is greter than the sum of latter ones
public class question07{
	public static void main(String[] args) {
	    double n1, n2, n3;
	    
        Scanner reader = new Scanner(System.in);
        System.out.println("First number: ");
        n1 = reader.nextDouble();
        System.out.println("Second number: ");
        n2 = reader.nextDouble();
        System.out.println("Third number: ");
        n3 = reader.nextDouble();


        if(n1 > n2 + n3){
            System.out.println(n1 + " is greater than " + (n2 + n3));
        }
        else{
            System.out.println(n1 + " is less than or equal to " + (n2 + n3));
        }
	}
}
