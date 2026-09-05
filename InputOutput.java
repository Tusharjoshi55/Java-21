import java.util.Scanner;


class InputOutput{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //create the object of Scanner class and use these funtion
        System.out.print("Enter your age and name : ");
        
         // for string for one word we can use .next() and for stream we can use nextline()
        String name = s.nextLine();

        short age = s.nextShort();
        
        System.out.print("Name  : "+name+" \nage : "+age);
    }
}

// %d	integer
// %f	floating point for eg - %.2f two decimal places
// %s	String
// %c	character
// %b	boolean
// %n	new line