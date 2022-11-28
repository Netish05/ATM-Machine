package ATMMachine;
import java.util.*;

class ATM{
    float Balance;
    int PIN=5674;
    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredpin =sc.nextInt();
        if(enteredpin==PIN) {
            menu();
        }
        else{
            System.out.println("enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. check a/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2) {
            withdrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("enter a valid choice");

        }
    }
    public void checkBalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insuficient balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money withdrawal Sucessfull");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited Sucessfully");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] arg){
        ATM obj = new ATM();
        obj.checkpin();


    }
}
