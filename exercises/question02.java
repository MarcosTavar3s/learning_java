import java.util.Scanner;

// receives 3 grades and calculates the mean 
public class question02{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float[] grades = new float[3]; 
        
        grades[0] = reader.nextFloat();
        grades[1] = reader.nextFloat();
        grades[2] = reader.nextFloat();
        
        reader.close();
        
        float mean = (grades[0] + grades[1] + grades[2])/3;
        
        System.out.println("Mean: " + mean);
        
        if(mean >= 7){
            System.out.println("Approved");
        }
        else if (mean > 5){
            System.out.println("Make-up test");
        }
        else{
            System.out.println("Failed");
        }
        
    }
}
