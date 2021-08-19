package lovebabbar;

public class MinJumpToReachEndOfArray {

    private static int minJump(int ar[],int n) {
        Integer dp[] = new Integer[n+1];
        dp[n]=0;

        for(int i = n-1;i>=0;i--){

            if(ar[i]>0){
                int min =Integer.MAX_VALUE;
                //for(int j=i;j<=ar[i]+i && j<dp.length ;j++){
                  for(int j =1;j<=ar[i] && i+j<dp.length;j++){
                    if(dp[i+j]!=null){
                        min= Math.min(min, dp[i+j]);
                    }

                }
                if(min!=Integer.MAX_VALUE) {
                    dp[i]=min+1;
                }
            }
        }
        return dp[0];
    }

    private static int  minJumpUpdate(int ar[],int n ){
        Integer dp[] = new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){

            if(ar[i]>0){
                int min = Integer.MAX_VALUE;
                for(int j=i+1;j<=i+ar[i] && j<dp.length;j++){
                    System.out.println("j = "+j);
                    if(dp[j]!=null){
                        min = Math.min(min,dp[j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i]=min+1;
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int ar[]={3,3,0,2,1,2,4,2,0,0};
        int minJumps= minJumpUpdate(ar,ar.length);
        System.out.println("Minimum jumps Updated= "+minJumps);
        minJumps=minJump(ar, ar.length);
        System.out.println("Minimum jumps = "+minJumps);
    }

}
