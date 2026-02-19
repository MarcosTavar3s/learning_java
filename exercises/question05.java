import java.util.Scanner;

// given a radius and a height, calculates superficial area and volume
public class question05{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        double radius = reader.nextDouble(); 
        System.out.print("Type the height: ");
        double height = reader.nextDouble();
        
        reader.close();
        
        double area = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
