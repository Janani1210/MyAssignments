package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingElementSet {

	public static void main(String[] args) {
		int[] nums = new int[]{4,3,3,1};
        int sum =0, dup=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
          if(set.contains(i)){
            dup = i;
            break;
          }
          set.add(i);
        }
       
        Arrays.sort(nums);
        int x=1;
        for(int i=0;i<nums.length;i++){
          if(nums[i] == x){
            x++;
          }
          else{
            sum = dup + x;
            break;
          }
        }
    
        System.out.println(sum);
    }

	}


