import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            double avg = sum / count;
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            double persent = cnt / count * 100.000;
            System.out.print(persent + '%');
        }
    }
}
