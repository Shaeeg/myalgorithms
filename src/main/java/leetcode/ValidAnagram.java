package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        if(sArr.length != tArr.length){
            return false;
        }
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i = 0; i < sArr.length; i++){
            if(!sArr[i].equals(tArr[i])){
                return false;
            }
        }
        return true;
    }
}