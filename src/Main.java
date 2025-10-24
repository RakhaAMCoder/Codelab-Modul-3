import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penjumlahan Dua Bilangan ===");

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        double hasil = angka1 + angka2;

        System.out.println("----------------------------------------");
        System.out.println("Hasil penjumlahan: " + angka1 + " + " + angka2 + " = " + hasil);
        System.out.println("----------------------------------------");
        System.out.println("Program selesai. Terima kasih telah menggunakan program ini!");
        // rakha
        input.close();
    }
}
