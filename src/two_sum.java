
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */

// what I tried first

/***
public class two_sum {
    public int twoSum(int[] nums, int target) {

      int t = target; 

        // loop to tranver an array

        for (int i =0; i< nums.length; i++)
        {
            int val =  nums[i] + nums[i+1];
                
                // if statement to check values

                if ( val == t){
                    return new int[] {i, i+1};

                }
               

        }
        return 0;
            
        
    }   
}
* **/


//correct answer


// explanation: https://docs.google.com/document/d/1Q08ISSxC2k44H5fb3k--bRDBOQvMy4TjryuWG3Sdx_U/edit?usp=sharing
public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        // loop to traverse the array
        for (int i = 0; i < nums.length; i++) {
            // loop to compare the current number with the rest of the array
            for (int j = i + 1; j < nums.length; j++) {
                // check if the sum of the two numbers equals the target
                if (nums[i] + nums[j] == target) {
                    // return the indices of the two numbers
                    return new int[] {i, j};
                }
            }
        }
        // no two numbers add up to the target
        return new int[] {};
    }
    
    //optimal solution
    public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
    
    
    
}

