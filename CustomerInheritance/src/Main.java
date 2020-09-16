/** 1. In a store, the data of its customers is kept, some of which are trustworthy enough to buy on credit. Program two classes called Customer and Preferred Customer respectively 
  *applying inheritance. Override the toString method and include parameterized constructors in each one. Their number, name and telephone number are known for each client, while
  *their balance, limit (maximum balance) and their address are also known for preferential clients.
  */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = -1;
        while (option != 0) {
            System.out.println("Enter 1 if you want to register a new Customer, enter 2 if you want to register a new Prefered Customer, enter 0 if you want to exit: ");
            option = scanner.nextInt();

            if (option == 1) {

                System.out.println("Enter customer´s ID number: ");
                int idCustomer = scanner.nextInt();
                System.out.println("Enter customer´s name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter customer´s phone number: ");
                int phoneNumber = scanner.nextInt();

                Customer newCustomer = new Customer(name, idCustomer, phoneNumber);
                System.out.println(newCustomer.toString());
            }

            if (option == 2) {
                System.out.println("Enter prefered customer´s ID number: ");
                int idPreferedCustomer = scanner.nextInt();
                System.out.println("Enter prefered customer´s name: ");
                scanner.nextLine();
                String preferedCustomerName = scanner.nextLine();
                System.out.println("Enter prefered customer´s phone number: ");
                int preferedCustomerPhoneNumber = scanner.nextInt();
                System.out.println("Enter prefered customer´s balance: ");
                double balance = scanner.nextDouble();
                System.out.println("Enter prefered customer´s balance limit: ");
                double balanceLimit = scanner.nextDouble();
                System.out.println("Enter prefered customer´s adress: ");
                scanner.nextLine();
                String adress = scanner.nextLine();

                PreferedCustomer newPreferedCustomer = new PreferedCustomer(balance, balanceLimit, adress, preferedCustomerName, idPreferedCustomer, preferedCustomerPhoneNumber);
                System.out.println(newPreferedCustomer.toString());
            }
            
            if(option == 0){
                break;
            }
        }   
    }
}
