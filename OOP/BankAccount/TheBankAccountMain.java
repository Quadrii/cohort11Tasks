package OOP.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBankAccountMain {
    static Scanner input = new Scanner(System.in);

    static Bank bank;
    private static void dummyAccounts(){
        bank.createAccount("Laolu","Anjana", "12123546", 2345467);
        bank.createAccount("Isiak", "Kolacek", "26353647", 576835536);

       bank.registerACustomer("Philip", Gender.MALE, 32);
       bank.registerACustomer("sharon", Gender.FEMALE, 25);
    }

    private static void register(){
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter gender (male/female)");
        String sex = input.next();
        Gender gender = null;
        switch (sex){
            case "male":
                gender = Gender.MALE;
            case "female":
                gender = Gender.FEMALE;
        }
        System.out.println("Enter your age");
        int age = input.nextInt();

        bank.registerACustomer(name, gender, age);
    }
    private static void createAnAccount(){
        System.out.println("Enter firstname");
        String firstName = input.next();
        System.out.println("Enter lastname");
        String lastname = input.next();
        System.out.println("Enter account number");
        String accountNumber = input.next();
        System.out.println("Enter BVN");
        int BVN = input.nextInt();
        bank.createAccount(firstName, lastname, accountNumber, BVN);
    }
    public static void main(String[] args) {
        String bankName = "Oceanic Bank";
        String bankAddress = "Yaba, lagos";
        int BVN;
        bank = new Bank(bankName, bankAddress);
        dummyAccounts();
        System.out.println("####################################################");
        System.out.println("Welcome to " + bankName.toUpperCase());
        System.out.println("####################################################");
        int sentinel = 0;
        try {
        while (sentinel != -1){
            System.out.println("Press 1 to register a customer");
            System.out.println("press 2 to create an account");
            System.out.println("press 3 to view account");
            System.out.println("press 4 to deposit");
            System.out.println("press 5 to withdraw");
            System.out.println("press 6 to transfer");
            System.out.println("press 7 to get a customer");
            System.out.println("press 8 to view account balance");
            System.out.println("press 9 to close account");
            System.out.println("press 0 to quit");
            int response = input.nextInt();
            switch (response){
                case 1:
                    register();
                    break;
                case 2:
                    createAnAccount();
                    break;
                case 3:
                    System.out.println("Enter account Number");
                    String accountNumber = input.next();
                    bank.getAccount(accountNumber);
                    break;
                case 4:
                    System.out.println("Enter account Number");
                    String accountNum = input.next();
                    System.out.println("Enter deposit amount");
                    int amount = input.nextInt();
                    bank.deposit(amount, accountNum);
                    break;
                case 5:
                    System.out.println("How much do you want to withdraw? ");
                    int withdrawAmt = (int) input.nextDouble();
                    System.out.println("Enter password");
                    String password = input.next();
                    System.out.println("Enter account number");
                    String accountNumb = input.next();
                    bank.withdraw(withdrawAmt, password,accountNumb);
                    break;
                case 6:
                    System.out.println("Enter receiver account");
                    String receiverAccount = input.next();
                    System.out.println("Enter sender Account");
                    String senderAccount = input.next();
                    System.out.println("Enter amount to transfer");
                    int amountToTransfer = input.nextInt();
                    bank.transfer(receiverAccount, senderAccount, amountToTransfer);
                case 7:
                    System.out.println("Enter BVN");
                    int bvnNo = input.nextInt();
                    bank.getCustomer(bvnNo);
                case 8:
                    System.out.println("Enter account Number");
                    String accountNumbr = input.next();
                    System.out.println("Enter password");
                    String passwd = input.next();
                    bank.getAccountBalance(accountNumbr, passwd);
                case 9:
                    System.out.println("Enter account number");
                    String acctNumber = input.next();
                    System.out.println("Enter password");
                    String pword = input.next();
                    bank.closeAccount(acctNumber, pword);
                case 0:
                    sentinel = -1;
            }
        }
    } catch (IllegalArgumentException | NullPointerException illegal) {
        System.out.println(illegal.getMessage());
        main(args);
    }

    }
}
