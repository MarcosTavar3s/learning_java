import java.util.Scanner;

// read two real number and print their sum, product and quotient 
public class question06{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double num1 = reader.nextDouble(); 
        System.out.print("Type the second number: ");
        double num2 = reader.nextDouble();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2) + "\n" + num1 + " * " + num2 +" = " + (num1*num2) + "\n" + num1 + " / " + num2 +" = " + (num1/num2));
        }
}
