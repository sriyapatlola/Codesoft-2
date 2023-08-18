import java.util.Scanner;
public class AtmMachine{
   static Scanner scanner=  new Scanner(System.in);
    static int balance = 20000;
    static int withdrawing;
    static int depositing;
    public static void main(String args[]){

    while(true){
        System.out.println("Select your operation");
        System.out.println("Enter 1: To check balance");
         System.out.println("Enter 2: To withdraw mony");
          System.out.println("Enter 3: To Deposit money ");
           System.out.println("Enter 4: To EXIT");
           
        int input=scanner.nextInt();

           switch(input){
            case 1:checkBalance();
            break;
           
           case 2:Withdraw();
           break;

           case 3:deposit();
           break;

           case 4: terminate();
           break;
    }
    }
}
private static void checkBalance(){
    System.out.println("Available Balance: "+balance+"\n");
}


private static void Withdraw(){
    System.out.println("Enter amount to withdraw: ");
    withdrawing= scanner.nextInt();
    if(withdrawing < balance){
    balance-=withdrawing;
    System.out.println("Withdraw is successfull !!");
    System.out.println("Available balance: "+balance+"\n");
    }else
     System.out.println("Insufficient funds"+"\n");
}

private static void deposit(){
    System.out.println("Enter the amount to deposit :");
    depositing=scanner.nextInt();
    balance+=depositing;
    System.out.println("Deposit is Successful!!");
    System.out.println("Available balance="+balance+"\n");
}


private static void terminate(){
    System.out.println("------------Thank you-----------");
    System.exit(0);
}

}