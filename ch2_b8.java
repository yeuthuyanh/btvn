/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author young
 */
import java.util.Scanner;
public class ch2_b8 {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();
        
        for (int count = 1; count <=n; count++){
        System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
        avgNumber = (float) sum / n;
        System.out.println("trung binh cong =" + avgNumber);
    }
}
