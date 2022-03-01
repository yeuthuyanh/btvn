//Nhậpvào2sốbấtkỳ từ bàn phím và thực hiện các yêu cầu sau:
//1.Tínhtổng,hiệu,tích,thương,chialấydưcủa2sốđó.
//2.Sửdụngcáctoántửsosánhđãhọcđểsosánh2sốđó.

import java.text.DecimalFormat;
import java.util.Scanner;

public class ch2_bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so thu nhat ");
        int sothunhat = scanner.nextInt();
       
        System.out.println("Nhap vao so thu hai");
        int sothuhai = scanner.nextInt();

        //1 Tinh tong
        int tong = sothunhat + sothuhai;
        System.out.println(sothunhat + " + " + sothuhai + " = " + tong);
        //2 tinh hieu
        int hieu = sothunhat - sothuhai;
        System.out.println(sothunhat + " - " + sothuhai + " = " + hieu);
        //3 tinh tich
        int tich = sothunhat * sothuhai;
        System.out.println(sothunhat + " * " + sothuhai + " = " + tich);
        //4 tinh thuong
        int thuong = sothunhat / sothuhai;
        System.out.println(sothunhat + " / " + sothuhai + " = " + thuong);
        //5 chia lay so du
        int sodu = sothunhat % sothuhai;
        System.out.println(sothunhat + " % " + sothuhai + " = " + sodu);
        //5 So sanh bang nhau 
        System.out.println(" Ket qua so sanh bang " + sothunhat + " va " + sothuhai + " la " + (sothunhat == sothuhai));
        //6 2 so ko bang nhau 
        System.out.println(" Ket qua so khac bang " + sothunhat + " va " + sothuhai + " la " + (sothunhat != sothuhai));
        //7 2 so lon hon hoac bang 
        System.out.println(" Ket qua so lon hon hoac bang " + sothunhat + " va " + sothuhai + " la " + (sothunhat >= sothuhai));
        //8 2 so nho hon hoac bang 
        System.out.println(" Ket qua so nho hon hoac bang " + sothunhat + " va " + sothuhai + " la " + (sothunhat <= sothuhai));

    }

}
