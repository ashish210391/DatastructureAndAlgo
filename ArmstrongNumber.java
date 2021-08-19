package lovebabbar;

public class ArmstrongNumber {


    private static boolean isArmstrongNumber(int num){
        int sum=0;
        int originalNum = num;
        int numOfDigits=String.valueOf(originalNum).length();
        while(num!=0){

            int digit = num%10;
            sum +=power(digit, numOfDigits); 
            num = num/10;
        }
        return sum == originalNum;
    }

    private static boolean isArmstrongNumberRec(int num){
            return findSumOfCubeOfDigits(num,String.valueOf(num).length()) == num;
    }

    private static int findSumOfCubeOfDigits(int num,int len){

        if(num == 0)
            return num;
     return evaluateProductOfDigits(len, 1, num%10)+ findSumOfCubeOfDigits(num/10,len);
    }
    private static int evaluateProductOfDigits(int count ,int i , int product){

        // if( count==i)
        // return product;
        // return product*evaluateProductOfDigits(count, ++i, product);
        return power(product, count);

    }

    private static int power( int num,int n){

        int product =1;
        while(n!=1){
            if(n%2==0){
                num = num*num;
                n=n/2;
            }else{
                product*= num;
                n=n-1;
            }
        }
        return num*product;
    }


    public static void main(String[] args) {

            boolean isArmstrongNumber = isArmstrongNumber(8208);
            System.out.println("Is Armstrong number== "+isArmstrongNumber);

            boolean isArmstrongNumberRec = isArmstrongNumberRec(8208);
            System.out.println("Is Armstrong number recursively == "+isArmstrongNumberRec);
    }
    
}
