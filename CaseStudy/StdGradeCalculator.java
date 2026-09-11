// Student Grade Calculator

// 

// Input marks for:            Calculate:          Example:
//                                                 90+       A+
// Database                    Total               80-89     A
// Computer Networks           Percentage          60-69     C  
// Operating Systems           Grade               50-59     D
// Mathematics                                     <50       F
// Java   

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class StdGradeCalculator{
    private int[] marks = new int[5];
    private String[] subjects = {"Database", "Computer Network", "Mathematic", "Java", "Operating System"};
    private int total = 0;
    private double percentage = 0.0;

    Scanner sc = new Scanner(System.in);
    
    void SubjectMarks(){
        System.out.println("---------------Enter Student Marks---------------");
        for(int i = 0 ; i < 5 ; ++i){
            System.out.println((i+1) +". "+ subjects[i] + " : " + );
            marks[i] = sc.nextInt();
        }
    }



    int Total(int[] marks){
        for(int mark : marks){
            total += mark;
        } 
        return total;
    }

    double Percentage(){
        percentage = Total()/5
        return percentage;
    }

    void Grade(){
        int per = Percentage();
        switch(per){
            case -> (per => 90){
                System.out.println("+A");
            }
            case -> (80 => per && per > 90){
                System.out.println("A");
            }
            case -> (70 => per && per > 80){
                System.out.println("B");
            }
            case -> (60 => per && per > 70){
                System.out.println("C");
            }
            case -> (50 => per && per > 60){
                System.out.println("D");
            }
            case -> (per < 50){
                System.out.println("F");
            }
            default -> System.out.println("Fill marks first");
        }
    }

  



    public static void main(String[] args){
        boolean running = true;

        while(true){
            SubjectMarks();
            switch()
        }
    }
}