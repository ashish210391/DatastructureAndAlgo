package lovebabbar;

public class BinaryPowerFunction {
    


    private static long power( long num,int n){

        long product =1;
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



    private static long powerRec(long num, int n){
        
        if(num ==0) return 0;
        if( n==0) return 1;
        long pow ;
        if(n%2==0)
        {
             pow = powerRec(num, n/2);
             pow = pow*pow;
        }
        else{
             pow = num *powerRec(num, n-1);
        }
        return pow;
    }

    public static int power(int x, int n)
    {
        int pow = 1;
 
        // loop till `n` become 0
        while (n > 0)
        {
            // if `n` is odd, multiply the result by `x`
            if ((n & 1) == 1) {
                pow *= x;
            }
 
            // divide `n` by 2
            n = n >> 1;
 
            // multiply `x` by itself
            x = x * x;
        }
 
        // return result
        return pow;
    }

    public static void main(String[] args) {
        
        //  long power = power(5, 2);
        //  System.out.println(power);
        // System.out.println("using math function ");
        // System.out.println(Math.pow(2, 6));

        long powerRec = power(2, 10);
        System.out.println("using recursion power == "+powerRec);
    }



}
