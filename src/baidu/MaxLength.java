package baidu;

import java.util.HashMap;

public class MaxLength {
    public static void main(String[] args) {
        String str="abcdabc     ";
        System.out.println(findmaxLength(str));
    }

    public static int findmaxLength(String str){
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int length=str.length();
        int left=0,right=0;
        while(right<length){
            char ch1=str.charAt(right);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            right++;

            while(map.get(ch1)>1){
                char ch2=str.charAt(left);
                map.put(ch2,map.get(ch2)-1);
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}
