import java.util.Scanner;

// read two integers and print their quotient and mod
public class question04{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the dividend: ");
        int num1 = reader.nextInt(); 
        System.out.print("Type the divider: ");
        int num2 = reader.nextInt();
        
        System.out.println(num1 + "/" + num2 +" = " + num1/num2 + "\n" + num1 + "%" + num2+ " = " + num1%num2);
        }
}
