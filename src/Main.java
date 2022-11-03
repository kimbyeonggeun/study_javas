import java.util.Scanner;

public class Main {
    public static int plus3(int A, int B){
        return A+B;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int A;
        int B;

        for(int i=0; i<count; i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            int output = plus3(A,B);
            System.out.println(output);
        }
        scanner.close();
    }
}
