package test;

public class BitwiseOddEvenCheck {
    


     private static  boolean isEven(int num){
        return (num & 1) == 0;
     }



    public static void main(String[] args) {
    
            if(isEven(101)){
                System.out.println("is even");
            }else{
                System.out.println("is odd");
            }
    }
}
