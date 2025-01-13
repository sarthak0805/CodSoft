import java.util.Scanner;

public class ATM {

    private int bankBalance = 0; 

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > bankBalance) {
            System.out.println("Insufficient balance! Unable to withdraw.");
        } else {
            bankBalance -= amount;
            System.out.println("Withdrawal successful. Updated bank balance: " + bankBalance);
        }
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            bankBalance += amount;
            System.out.println("Deposit successful. Updated bank balance: " + bankBalance);
        }
    }

    public void checkBalance() {
        System.out.println("Your current bank balance is: " + bankBalance);
    }
public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n** ATM MACHINE **");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("*");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}