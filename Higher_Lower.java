package Higher_Lower;
import java.util.Scanner;

public class Higher_Lower {
    

    public static void main(String[] args) {

        while (true) {
            
            int ranNumber = (int) (Math.random() * 100);
            int ranNumber2 = (int) (Math.random() * 100);
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to higher or lower" );
            System.out.println("Is the next number to " + ranNumber + " going to be higher or lower "); 
            String userInput = scanner.next(); {
            
            if (userInput.equals("lower") && ranNumber >= ranNumber2) 
            System.out.println("Correct :D It was " + ranNumber2 + " which is lower");

            if (userInput.equals("higher") && ranNumber <= ranNumber2) 
            System.out.println("Correct :D It was " + ranNumber2 + " which is higher");

            else if (userInput.equals("higher") && ranNumber >= ranNumber2) 
            System.out.println("Wrong D: It was " + ranNumber2 + " which is lower");
            
            else if (userInput.equals("lower") && ranNumber <= ranNumber2) 
            System.out.println("Wrong D: It was " + ranNumber2 + " which is higher");
            }

        }

    }
}
