
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Willian Kelvin Nata - 123180004
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        int menu;
        char kembali, pilihan;
        
        do {
            System.out.println(":::::MENU:::::");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Silahkan Pilih : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\n:::::Bangun Datar:::::");
                    System.out.println("a. Lingkaran");
                    System.out.println("b. Tembereng Lingkaran");
                    System.out.println("c. Juring Lingkaran");
                    System.out.println("d. Busur Lingkaran");
                    System.out.print("Silahkan Pilih Bangun datar : ");
                    pilihan = input.next().charAt(0);
                    switch (pilihan) {
                        case 'a':
                            System.out.println("\n:::::Lingkaran:::::");
                            System.out.println("Input Jari-jari : ");
                            double jari_jari = input.nextDouble();
                            Lingkaran lingkaran = new Lingkaran(jari_jari);
                            System.out.println("Luas Lingkaran = "+ lingkaran.luasLingkaran());
                            System.out.println("Keliling Lingkaran = "+lingkaran.kelilingLingkaran());
                            break;
                        case 'b':
                            System.out.println("\n:::::Tembereng Lingkaran:::::");
                            break;
                        case 'c':
                            System.out.println("\n:::::Juring Lingkaran:::::");
                            break;
                        case 'd':
                            System.out.println("\n:::::Busur Lingkaran:::::");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n:::::Bangun Ruang:::::");
                    System.out.println("a. Bola");
                    System.out.println("b. Tembereng Bola");
                    System.out.println("c. Juring Bola");
                    System.out.println("d. Kerucut");
                    System.out.println("e. Tabung");
                    System.out.println("f. Kerucut Terpancung");
                    break;
            }
            System.out.println("Kembali ke menu? <y/n> : ");
            kembali = input.next().charAt(0);
        } while (kembali == 'y' || kembali == 'Y');

    }

}
