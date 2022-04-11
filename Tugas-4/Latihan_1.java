import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(".::: APLIKASI BIODATA :::.");
        System.out.println("==========================");
        System.out.println("Masukkan NPM Anda : ");
        int npm = input.nextInt();
        System.out.println("Masukkan Nama Anda : ");
        String Nama = input.next();
        System.out.println("Masukkan Alamat Anda : ");
        String Alamat = input.next();

        System.out.println(".::: APLIKASI BIODATA :::.");
        System.out.println("==========================");
        System.out.println("NPM :" + npm + "!");
        System.out.println("Nama :" + Nama + "!");
        System.out.println("Nama :" + Alamat + "!");
    }    
}
