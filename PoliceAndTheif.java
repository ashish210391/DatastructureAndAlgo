package arrays;

public class PoliceAndTheif {

    private static int maxTheifCaught(char[] ar, int n,int k) {
        int maxThief = 0;
        for (int i = 0; i < n ; i++) {
            if (ar[i] == 'P') {
                if(traverseLeft(ar, i, k) || traverseRight(ar, i, k)){
                        ++maxThief;
                }
            }
        }

        return maxThief;
    }

    private static boolean traverseLeft(char[] ar, int policeIndex, int maxDistance) {

        while (policeIndex >= 0 && maxDistance >= 0) {
            if (ar[policeIndex] == 'T')
                return true;
            --policeIndex;
            --maxDistance;
        }

        return false;
    }

    private static boolean traverseRight(char[] ar,int policeIndex,int maxDistance){
        int windowSize=0;
        while (policeIndex <=ar.length-1 && maxDistance >= windowSize) {
            if (ar[policeIndex] == 'T')
                return true;
            ++policeIndex;
            ++windowSize;
        }
        return false;
    }

    public static void main(String[] args) {
        char arr[] = {'T', 'P', 'P', 'P', 'P', 'P'};
            int k =1;

            int maxVal = maxTheifCaught(arr,arr.length,k);
            System.out.println("Maximum possible theif that can be caught==  "+maxVal);
    }

}
