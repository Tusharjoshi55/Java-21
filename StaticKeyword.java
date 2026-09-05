class StaticKeyword{
     public static void main(String[] args){
        System.out.print(MainFunction.num);
    }
    
}


class MainFunction{
    static int num =5;
}



// we cannot use the var variable inside the static method
// we can only use static variable which will only be accessed by static method
// class Test{
//     public int var = 38;
//     private static int num = 45;
//     public static void main(String[] args){
//         System.out.println(var); - this will not work
//         System.out.println(num); - this will work fine
//     }
// }