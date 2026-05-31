import java.io.File;
import java.util.Scanner;

public class WilbertOperasiFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori yang akan dihapus: ");
        var pathDirektori = keyboard.nextLine();

        var direktori = new File(pathDirektori);

        if (direktori.exists() && direktori.isDirectory()) {
            var daftarFile = direktori.listFiles();

            // hapus semua file di dalam direktori dulu
            for (var file : daftarFile) {
                var hasil = file.delete();
                if (hasil) {
                    System.out.println("File " + file.getName() + " berhasil dihapus");
                } else {
                    System.out.println("File " + file.getName() + " gagal dihapus");
                }
            }

            // setelah semua file dihapus, hapus direktorinya
            var hasilHapusDirektori = direktori.delete();
            if (hasilHapusDirektori) {
                System.out.println("Direktori " + pathDirektori + " berhasil dihapus");
            } else {
                System.out.println("Direktori " + pathDirektori + " gagal dihapus");
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
