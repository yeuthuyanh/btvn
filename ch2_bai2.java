
import java.util.Scanner;

public class ch2_bai2 {

    public static void main(String[] args) {
        int n = 1;
        int temp = 1;
        long giaiThua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao so n: ");
        n = scanner.nextInt();
        while (n <= 0) {
            System.out.println(" nhap lai so N");
            n = scanner.nextInt();
        };
        while (temp <= n) {
            giaiThua *= temp;
            temp++;
        }
        System.out.println(n + "! = " + giaiThua);
    }
}
