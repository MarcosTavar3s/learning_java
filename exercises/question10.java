import java.util.Scanner;

// compare two numbers
public class question10{
	public static void main(String[] args) {
	    float a, b;
	   
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the A number: ");
        a = reader.nextFloat();
        System.out.println("Type the B number: ");
        b = reader.nextFloat();
        reader.close();
        
	    if(a > b){
	        System.out.println(a + " > " + b);
	    }
	    else if(b > a){
	        System.out.println(a + " < " + b);
	    }
	    else{
	        System.out.println(a + " = " + b);
	    }
	    
	}
}
