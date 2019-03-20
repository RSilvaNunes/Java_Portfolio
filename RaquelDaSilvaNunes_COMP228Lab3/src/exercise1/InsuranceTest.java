package exercise1;
import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {

        //Create an instance of health (health object)
        Health myHealth = new Health("Health", 1000);

        //Display the default info (Health)
        System.out.println("Default information for Health: " + "\n" + myHealth.displayInfo() + "\n");

        //Create an instance of Life (life object)
        Life myLife = new Life("Life", 2000);

        //Display the default info (Life)
        System.out.println("Default information for Life: " + "\n" + myLife.displayInfo() + "\n");

        //Reading in System.in
        Scanner reader = new Scanner(System.in);

        //Prompt the user to insert the type of insurance
        System.out.println("Enter the type of insurance: ");

        //Read the user's input and save to typeOfInsurance
        String typeOfInsurance = reader.nextLine();

        //Prompt the user to insert the monthly cost
        System.out.println("Enter the monthly fee of insurance: ");

        //Read the user's input and save to cost
        double cost = Double.parseDouble((reader.nextLine()));

        //Declare and create an array to hold 2 objects of type Insurance
        Insurance[] myArray = new Insurance[2];

        //Get the first and the second array elements of array insurance
        myArray[0] = new Health(typeOfInsurance, cost);
        myArray[1] = new Life(typeOfInsurance, cost);

        for(Insurance insurance : myArray){
            System.out.println(insurance.displayInfo());
        }

    }
}
