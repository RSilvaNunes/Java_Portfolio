package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        //Variables declaration to save user's input
        double interestRate;
        int option;
        int mortgageNumber;
        String fn;
        String ln;
        double amount;
        int term;

        int ARR_SIZE = 3;

        //Declare an array of 3 Mortgages
        Mortgage[] myArray = new Mortgage[ARR_SIZE];

        //BusinessMortgage object on first position of myArray
        //myArray[0] = new BusinessMortgage(1, "Raquel", "Nunes", 120000.00,
                //3.2, 1);
        //myArray[1] = new PersonalMortgage(2, "Roberto", "Junior", 220000.00,
                //2.2, 3);

        //Reading in System.in
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to insert the interest rate
        System.out.println("Enter the current interest rate: ");

        //Read the user's input and save to interestRate
        interestRate = Double.parseDouble((scanner.nextLine()));

        //Enhanced for Statement. It loops through each element of myArray and stores the elements into a mortgage variable
        //for(Mortgage mortgage : myArray){
        for(int i=0;i<ARR_SIZE;i++){
            System.out.println("-----What is your mortgage type?-----");
            System.out.println("Enter number 1 for Business ");
            System.out.println("Enter number 2 for Personal ");
            System.out.println("Enter number 0 for exit the program ");

            //Read the user's input and save to option
            option = Integer.parseInt(scanner.nextLine());

            //Prompt the user to insert the mortgage number
            System.out.println("Enter the mortgage number: ");

            //Read the user's input and save to mortgage number
            mortgageNumber = Integer.parseInt((scanner.nextLine()));

            //Prompt the user to insert the first name
            System.out.println("Enter the first name: ");

            ////Read the user's input and save to fn
            fn = scanner.nextLine();

            //Prompt the user to insert the last name
            System.out.println("Enter the last name: ");

            ////Read the user's input and save to ln
            ln = scanner.nextLine();

            //Prompt the user to insert the amount of mortgage
            System.out.println("Enter the amount of mortgage: ");

            //Read the user's input and save to amount
            amount = Double.parseDouble((scanner.nextLine()));

            //Prompt the user to insert the term
            System.out.println("Enter the term (how many years): ");

            //Read the user's input and save to term
            term = Integer.parseInt((scanner.nextLine()));

            //If conditions in case that user's input is 1, 2 or 0
            if (option == 1){
                //Populate 2nd position of the array
               // myArray[i] = new BusinessMortgage(mortgageNumber, fn, ln, amount, interestRate, term);
                //mortgage.getMortgageNumber();
                //mortgage.getCustomerFName();
                //mortgage.getCustomerLName();
                //mortgage.getMaxMortgageAmount();;
                //mortgage.getInterestRate();
                //mortgage.getTerm();


                BusinessMortgage newMortgage = new BusinessMortgage(mortgageNumber, fn, ln, amount, interestRate, term);

                //sua magica aqui

                myArray[i] = newMortgage;

                //Show the second position of the array

                System.out.println("-------------------------------------------------------------------------------");
            }
            else if(option == 2){
                //Populate 3rd position of the array
               // myArray[i] = new PersonalMortgage(mortgageNumber, fn, ln, amount, interestRate, term);
               // mortgage.getMortgageNumber();
              //  mortgage.getCustomerFName();
               // mortgage.getCustomerLName();
               // mortgage.getMaxMortgageAmount();;
               // mortgage.getInterestRate();
               // mortgage.getTerm();

                PersonalMortgage newMortgage = new PersonalMortgage(mortgageNumber, fn, ln, amount, interestRate, term);

                //sua magica aqui

                myArray[i] = newMortgage;
                //Show the third position of the array
                //System.out.printf(mortgage.getMortgageInfo());
                System.out.println("-------------------------------------------------------------------------------");
            }
            else  if(option == 0){
                break;
            }


        }
        scanner.close();

        //Show all the elements of myArray
        for(Mortgage m:myArray){
            System.out.println(m.getMortgageInfo());
        }

    }
}

