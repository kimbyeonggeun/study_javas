import java.util.Scanner;

public class AddAB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A+B);
        in.close();
    }
}
