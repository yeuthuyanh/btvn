/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author young
 */
import java.util.Scanner;

public class ch2_bai10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi Ky tu: ");
        String Kytu = scanner.next();
        if (Kytu.length() > 80) {
            System.out.print("Ban da nhap qua 80 ky tu ");
        }
        char ch = (char) scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<Kytu.length();i++)
            if (ch==Kytu.charAt(i)) count++;
        System.out.println("So lan xuat hien " +ch+ " : " +count);

    }

}
