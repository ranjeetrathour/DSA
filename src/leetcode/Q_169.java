package leetcode;

import java.util.*;

/**
 * question 169. Majority Element
 * Input: nums = [3,2,3]
 * Output: 3
 * solution step
 * 1 add arr value into map
 * find max value from map
 * compare max value
 */
public class Q_169 {
    public static void main(String[] args) {
        int max = getMax();
        System.out.println(max);

    }

    private static int getMax(){
        int [] nums = {-1,1,1,1,2,1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry:  map.entrySet()){
            if (Objects.equals(entry.getValue(), Collections.max(map.values()))){
               return entry.getKey();
            }
        }
        return -1;
    }
}
