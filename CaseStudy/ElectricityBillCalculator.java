// 1. Electricity Bill Calculator
// A power company charges:
// First 100 units → ₹5/unit
// Next 100 → ₹7/unit
// Above 200 → ₹10/unit
// Take units as input and calculate the bill.
// Practice: conditions, arithmetic, slabs.

import java.util.Scanner;


class ElectricityBillCalculator{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Unit : ");
        int unit = sc.nextInt();

        if(unit < 0){
            System.out.print("Enter valid Number !");
        }
        else if(unit <= 100){
            System.out.print("Amount : "+unit*5);
        }
        else if(unit <= 200){
            System.out.print("Amount : "+unit*7);
        }
        else{
            System.out.print("Amount : "+unit*10);
        }
        
    }
}