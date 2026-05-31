import java.io.File;
import java.util.Scanner;

public class WilbertOperasiFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var pathDirektori = keyboard.nextLine();

        var direktori = new File(pathDirektori);

        if (direktori.exists() && direktori.isDirectory()) {
            var daftarFile = direktori.listFiles();

            if (daftarFile.length == 0) {
                System.out.println("Direktori kosong, tidak ada file");
            } else {
                System.out.println("Daftar file di dalam direktori " + pathDirektori + ":");
                for (var file : daftarFile) {
                    if (file.isFile()) {
                        System.out.println("- " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau path bukan direktori");
        }
    }
}
