package lovebabbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Check if we can reach the end of the array or not
 */
public class JumpGame1 {
    


    private static boolean checkJump(List<Integer> list){

        int reachable =0;
        int len = list.size();

        for(int i=0;i<len;i++){
            if(i>reachable)
            return false;
            else if (reachable>=len) 
            return true;
            reachable= Math.max(i+list.get(i), reachable);
        }

        return true;


    }


    private static boolean checkJumpRec(int ar[],int reachable,int n,int i){

        if(i>reachable) return false;
        if(reachable >= n) return true;

            reachable = Math.max(i+ar[i], reachable);
        return checkJumpRec(ar, reachable, n,++i);

    }
    public static void main(String[] args) {
        //int ar[] = {1,3,2,0,2,3};
        int ar[] = {1,1,2,3,2,1,0,0,1,3};

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            list.add(ar[i]);
        }
        System.out.println("Is it possible to reach end of the array== "+checkJump(list));

        System.out.println("is it possible to reach end of the array recursively ="+checkJumpRec(ar, 0, ar.length-1, 0));
    }
}
