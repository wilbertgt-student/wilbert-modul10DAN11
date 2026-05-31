import java.io.File;
import java.util.Scanner;

public class WilbertOperasiFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        var namaFile = keyboard.nextLine();

        var file = new File(namaFile);

        if (file.exists()) {
            long ukuranBytes = file.length();

            if (ukuranBytes < 1024 * 1024) {
                double ukuranKB = (double) ukuranBytes / 1024;
                System.out.printf("Ukuran file: %.2f KB\n", ukuranKB);
            } else {
                double ukuranMB = (double) ukuranBytes / (1024 * 1024);
                System.out.printf("Ukuran file: %.2f MB\n", ukuranMB);
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}