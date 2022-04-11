import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //APLIKASI PERKALIAN
        System.out.println(".::: APLIKASI PERKALIAN :::.");
        System.out.println("==========================");
        System.out.println("Masukkan Angka Pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukkan Angka Kedua : ");
        int angka2 = input.nextInt();

        int hitung;
        int Perkalian = angka1*angka2;
        hitung = Perkalian;

        System.out.println("");
        System.out.println(".::: APLIKASI PERKALIAN :::.");
        System.out.println("==========================");
        System.out.println("Hasil perkalian Dari : "+ angka1 + " X " +angka2 +" Adalah " + hitung );
        System.out.println("");


        //APLIKASI PEMBAGIAN 
        Scanner input1 = new Scanner(System.in);
        System.out.println(".::: APLIKASI PEMBAGIAN :::.");
        System.out.println("==========================");
        System.out.println("Masukkan Angka Pertama : ");
        int angka11 = input1.nextInt();
        System.out.println("Masukkan Angka Kedua : ");
        int angka21 = input1.nextInt();

        int hitung1;
        int Perkalian1 = angka11/angka21;
        hitung1 = Perkalian1;
        
        System.out.println("");
        System.out.println(".::: APLIKASI PEMBAGIAN :::.");
        System.out.println("==========================");
        System.out.println("Hasil perkalian Dari : "+ angka1 + " X " +angka2 +" Adalah " + hitung1 );


        //APLIKASI MENGHITUNG LUAS LINGKARAN
        Scanner inputlingkaran = new Scanner(System.in);
        System.out.println(".::: APLIKASI MENGHITUNG LUAS LINGKARAN :::.");
        System.out.println("==========================");
        System.out.println("Masukkan Jari -Jari : ");
        int jarijari = inputlingkaran.nextInt();
        

        int LuasLingkaran;
        int Luas = 227*jarijari*jarijari;
        LuasLingkaran = Luas
        ;

        System.out.println("");
        System.out.println(".::: APLIKASI MENGHITUNG LUAS LINGKARAN :::.");
        System.out.println("==========================");
        System.out.println("Luas Lingkaran Dari Jari - Jari : "+ jarijari + " Adalah " + LuasLingkaran );

         //APLIKASI MENGHITUNG LUAS SEGITIGA
         Scanner inputsegitiga = new Scanner(System.in);
         System.out.println(".::: APLIKASI MENGHITUNG LUAS SEGITIGA :::.");
         System.out.println("==========================");
         System.out.println("Masukkan Alas: ");
         int alas = inputsegitiga.nextInt();
         System.out.println("Masukkan Tinggi: ");
         int tinggi = inputsegitiga.nextInt();
         
 
         int LuasSegitiga;
         int Luassegitiga = (alas*tinggi)/2;
         LuasSegitiga = Luassegitiga;
         ;
 
         System.out.println("");
         System.out.println(".::: APLIKASI MENGHITUNG LUAS SEGITIGA :::.");
         System.out.println("==========================");
         System.out.println("Luas Segitiga Dari Alas : "+ alas + " Dan Tinggi "+ tinggi+ " Adalah " + LuasSegitiga );


         //APLIKASI MENGHITUNG LUAS PERSEGI PANJANG
         Scanner inputpersegipanjang = new Scanner(System.in);
         System.out.println(".::: APLIKASI MENGHITUNG LUAS PersegiPanjang :::.");
         System.out.println("==========================");
         System.out.println("Masukkan panjang: ");
         int panjang = inputpersegipanjang.nextInt();
         System.out.println("Masukkan Lebar: ");
         int lebar = inputpersegipanjang.nextInt();
         
 
         int LuasPersegiPanjang;
         int LuaspersegiPanjang = (panjang*lebar);
         LuasPersegiPanjang = LuaspersegiPanjang;
         ;
 
         System.out.println("");
         System.out.println(".::: APLIKASI MENGHITUNG LUAS PersegiPanjang :::.");
         System.out.println("==========================");
         System.out.println("Luas PersegiPanjang Dari panjang : "+ panjang + " Dan Lebar "+ lebar+ " Adalah " + LuasPersegiPanjang );



        
       
    }    
}
