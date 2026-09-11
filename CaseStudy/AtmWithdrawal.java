// 2. ATM Withdrawal
// Create an ATM program.
// Input:
// Account balance
// Withdrawal amount
// PIN

// Rules:
// Correct PIN required
// Withdrawal must be positive
// Withdrawal cannot exceed balance
// Maintain minimum balance of ₹500
// Print appropriate messages.
// Practice: nested conditions and validation.

import java.util.Scanner;

class AtmWithdrawal{
    private double balance = 8000;
    private double pin = 1234;


    void withdrawal(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal amount must be greater than ₹0.");
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance !!");
            System.out.println("Current Balance : "+ balance);
        }
        else if(balance-amount < 500){
            System.out.println("You cannot Withdrawal.");
            System.out.println("Maintaining minimum balance of 500 rupee !!");
        }
        else{
            balance -= amount;
            System.out.println("Transection seccussfull completely !");
            System.out.println("Please collect your cash: ₹" + amount);
            System.out.println("Current Balance : ₹"+ balance);
        }
    }


    void showBalance(){
        System.out.println("Balance : ₹"+balance);
    }

    boolean verifiedPin(int password){      
        if(password == pin){
            return true;
        }
        return false;
    }



    public static void main(String[] args){

        AtmWithdrawal user = new AtmWithdrawal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your card and press Enter!");
        
        System.out.print("Enter Four Digit PIN: ");
        int password = sc.nextInt();

        if(user.verifiedPin(password)){

            boolean running = true;

            while(running){
                System.out.println("\n===== ATM MENU ====="); 
                System.out.println("1. Withdrawal"); 
                System.out.println("2. Balance"); 
                System.out.println("3. Exit"); 
                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();
                switch(choice){
                    case 1 -> {
                        System.out.print("Enter Amount to Withdraw: ₹"); 
                        double amount = sc.nextDouble(); 
                        user.withdrawal(amount); 
                        } 
                    case 2 -> 
                        user.showBalance(); 
                    case 3 -> {
                         System.out.println("Thank you for using the ATM."); 
                         running = false;
                        } 
                    default -> 
                    System.out.println("Enter a valid option!"); 
                    
                }
            }
        }
        else{
            System.out.println("Wrong Password !!");
        }

        sc.close();

    }
}






























// import java.util.Scanner;

// class AtmWithdrawal {

//     void Withdrawal(double amount, double balance){
//         if(balance <=500){
//             System.out.println("Minimum balance is required 500 rupe");
//         }
//         else{
//             if(balance-amount >=0){
//                 System.out.println("Withdrawl is Successfull : "+ (balance-amount));
//                 System.out.println("Check Your Cash : "+ amount);
//             }
//             else{
//                 System.out.println("Your account has : "+ balance);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int passKey = 1234;
//         double amount = 0.0;
//         double balance = 7800.0;

//         AtmWithdrawal obj = new AtmWithdrawal();

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Swap your card and Press enter!");
//         System.out.print("Enter Four Digit Password : ");
//         int password = sc.nextInt();
//         if (password == passKey) {
//             boolean running = true;
//             while (running) {
//                 System.out.println("Enter your Choice ");
//                 System.out.println("1. Withdaral ");
//                 System.out.println("2. Balance ");
//                 System.out.println("3. Exit ");
//                 int choice = sc.nextInt();

//                 switch(choice) {
//                     case 1 -> {
//                         System.out.println("Enter Amount to Withdrawal : ");
//                         amount = sc.nextDouble();
//                         obj.Withdrawal(amount, balance);
//                     }
//                     case 2 -> {
//                         System.out.println("Balance : "+ balance);
//                     }
//                     case 3 -> {
//                         System.out.println("Exit");
//                         running = false;
//                     }
//                     default -> System.out.println("Enter Valid Input number!!");
//                 }

//             }

//         }
//         else{
//         System.out.println("Worng password");
//     }

//     }
    
// }
