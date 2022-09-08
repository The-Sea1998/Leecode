package baiao;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class problem02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[] nums= {20,5,10,20,5,5};
        solution(n,nums);
    }
    public static int[] solution(int w,int[] timeArr){
        int[] indexs=new int[timeArr.length];
        TreeMap<Integer,Integer> map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        for(int i=0;i<w;i++){
            map.put(timeArr[i],i+1);
            indexs[i]=i+1;
        }
        for(int i=w;i<timeArr.length;i++){
            int firstKey=map.firstKey();
            int value=map.get(map.firstKey());
            map.remove(map.firstKey());
            map.put(firstKey+timeArr[i],value);
            indexs[i]= value;
        }
        for(int i=0;i<timeArr.length;i++){
            System.out.println(indexs[i]);
        }
        return indexs;
    }
}
