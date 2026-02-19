import java.util.Scanner;

// read a number and print its successor
public class question01{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        
        num++;
        
        System.out.println(num);
        
    }
}
