class VariableType{

    // this is the preimivie data type in java 
    public static void main(String[] args){
        byte byteType;  //8 bits    (-2⁷ to 2⁷ − 1 )       (-128 to 127)
        short shortType; //16 bits  (-2¹⁵ to 2¹⁵ − 1)      (-32,768 to 32,767)
        int intType;    //32 bits   (-2³¹ to 2³¹ − 1)      (-2,147,483,648 to 2,147,483,647)
        long longType;  //64 bits   (-2⁶³ to 2⁶³ − 1)      (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)


        // Java uses the IEEE 754 floating-point format.
        // 1 bit  → sign
        // 8 bits → exponent
        // 23 bits → fraction
        //Java treats decimal literals like 10.5 as double by default, so f tells Java: "this is a float."
        float floatType;   
        float a = 10.5f; 

        // Default choice
        // 1 bit  → sign
        // 11 bits → exponent
        // 52 bits → fraction
        double doubleType; //64 bits



        boolean boolType; // only two type - true or false 

        char charType; // only contain a character

    }
}