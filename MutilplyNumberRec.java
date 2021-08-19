package lovebabbar;

public class MutilplyNumberRec {


    private static int multiply(int num,int count,int i ){


        if( count ==i) return num;
        return num *multiply(num, count, ++i);

    }

    public static void main(String[] args) {
        int product = multiply(10, 3, 1);
        System.out.println("product == "+product);
        
    }
    
}
