package arrays;

import java.util.HashMap;

public class CountMaxSubArraySumEqualsK {

    private static int countElements(int ar[], int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, 1);
        for (int i = 0; i < ar.length; i++) {
            prefixSum += ar[i];
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;

    }

    public static void main(String[] args) {
        int ar[]={3,4,7,2,-3,1,4,2};
        int count = countElements(ar, 7);
        System.out.println("Total Subarray with sum =k is "+count);
    }

}
