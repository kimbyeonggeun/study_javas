import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int avg = 0, sum = 0;
        int[] arr = new int[count];

        // 값 입력
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(arr);

        // 조작한 점수
        int M = arr[count - 1];
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        System.out.println(sum * 100 / M / count);
    }
}
