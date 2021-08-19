package test;

import java.util.ArrayList;
import java.util.List;

public class TestLengthAndSizeMethods {


    public static void main(String[] args) {
        
        int ar[] = new int[10];
        ar[0]=1;
        ar[1]=2;

        System.out.println("Length of array is "+ar.length);
        List<Integer> list = new ArrayList<>(20);
        list.add(1);
        list.add(2);
        System.out.println("Size of the list = "+list.size());
        System.out.println("value == "+(7/2));
        
    }
    
}
