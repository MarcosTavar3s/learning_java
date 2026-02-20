import java.util.Scanner;

// read a name from keyboard and compares it to a template
public class question09{
	public static void main(String[] args) {
	    String name = "name";
	    String user_input;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type name: ");
        user_input = reader.nextLine();
		reader.close();

	    if(name.equals(user_input)){
	        System.out.println("Correct");
	    }
	    else{
	        System.out.println("Wrong");
	    }
	    
	}
}
