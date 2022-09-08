package baiao;

public class problem01 {
    public static void main(String[] args) {
        int[] arr = {0,0};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {

        int count = 0;
        int pre = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != pre) {
                pre = arr[i];
                count++;
            }
        }

        return count;
    }
}
