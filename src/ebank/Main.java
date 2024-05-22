package ebank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<AccountBank> accountBanks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to EBank!");
        System.out.println("Please enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter your account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.println("Please enter your account balence: ");
        double balence = scanner.nextDouble();
        scanner.nextLine();
        AccountBank accountBank = new AccountBank();
        accountBank.setBalance(balence);
        accountBank.setAccountNumber(accountNumber);
        accountBank.setAccountHolderName(accountHolderName);
        System.out.println("Your account balance is: " + accountBank.getBalance());
        // test deposit
        System.out.println("Test deposit menthod.");
        System.out.println("-------------------------");
        System.out.println("Please enter deposit amount.");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        // double depositAmount = -2000; test invalid amount
        System.out.println("Your deposit amount is: " + depositAmount);
        accountBank.deposit(depositAmount);
        System.out.println("Your account balance after deposit is: " + accountBank.getBalance());
        // test withdraw
        System.out.println("Test withdraw menthod.");
        System.out.println("-------------------------");
        System.out.println("Please enter withdraw amount.");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Your withdraw amount is: " + withdrawAmount);
        accountBank.withdraw(withdrawAmount);
        System.out.println("Your account balance after withdraw is: " + accountBank.getBalance());
        System.out.println("-------------------------");
        // test transfer
        System.out.println("Test transfer method");
        System.out.println("-------------------------");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setAccountNumber("123");
        destinationAccountBank.setAccountHolderName("Doan Chien");
        destinationAccountBank.setBalance(10000);
        accountBanks.add(destinationAccountBank);
        accountBanks.add(accountBank);
        System.out.println("Destination Account");
        destinationAccountBank.displayAccountInfo();
        System.out.println("Please enter transfer amount.");
        double transferAmount = scanner.nextDouble();
        scanner.nextLine();
        accountBank.transfer("123",transferAmount);
        System.out.println("After transfer transaction");
        System.out.println("My account");
        accountBank.displayAccountInfo();
        System.out.println("Destination account");
        destinationAccountBank.displayAccountInfo();
    }
}
