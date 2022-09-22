// import the Scanner class
import java.util.Scanner;

// Type of crust
// Size
// quantity

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;
        String TypeOfCrust = "";
        String Size = "";

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Please select a type of crust:");
        System.out.println("Enter 1 if you want a Thin Crust Pizza");
        System.out.println("Enter 2 if you want a Hand Tossed Pizza");

        System.out.print("Enter your choice here: ");
        char crust = scan.next().charAt(0);  
        
        switch (crust) {
            case '1':
                TypeOfCrust = "Hand Tossed Pizza";
                break;
            case '2':
                TypeOfCrust = "Thin Crust Pizza";
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Please select the Size of the Pizza:");
        System.out.println("Enter 1 if you want a Medium Sized Pizza");
        System.out.println("Enter 2 if you want a Family Sized Pizza");
        System.out.println("Enter 3 if you want a Big Family Sized Pizza");

        System.out.print("Enter your choice here: ");
        char size = scan.next().charAt(0); 

        switch (size) {
            case '1':
                Size = "Medium Sized Pizza";
                break;
            case '2':
                Size = "Family Sized Pizza";
                break;
            case '3':
                Size = "Big Family Sized Pizza";
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
        System.out.println("Please Enter How Many Pizza: ");
        int quantity = scan.nextInt();

        System.out.println("Your order is: " + pizza + "Type Of Crust: " + TypeOfCrust + " The Size is: " + Size);
        System.out.println("Your total amount is: " + (quantity*price));

        scan.close();
    }
}
