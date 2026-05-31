import java.util.ArrayList;
import java.util.Collections;

public class WilbertBinary {

    public static void main(String[] args) {

        ArrayList<Integer> tinggiA = new ArrayList<>();
        ArrayList<Integer> beratA = new ArrayList<>();

        ArrayList<Integer> tinggiB = new ArrayList<>();
        ArrayList<Integer> beratB = new ArrayList<>();

        Collections.addAll(tinggiA,
                168,170,165,168,172,170,169,165,171,166);

        Collections.addAll(beratA,
                50,60,56,55,60,70,66,56,72,56);

        Collections.addAll(tinggiB,
                170,167,165,166,168,175,172,171,168,169);

        Collections.addAll(beratB,
                66,60,59,58,58,71,68,68,65,60);

        Collections.sort(tinggiA);
        Collections.sort(beratA);
        Collections.sort(tinggiB);
        Collections.sort(beratB);

        System.out.println("Tinggi 168 cm dari tim B");

        if(Collections.binarySearch(tinggiB, 168) >= 0)
            System.out.println("Ada");

        System.out.println(
                "Jumlah = " +
                        Collections.frequency(tinggiB,168));

        System.out.println("\nTinggi 160 cm dari tim B");

        if(Collections.binarySearch(tinggiB,160) >= 0)
            System.out.println("Ada");
        else
            System.out.println("Tidak ada");

        System.out.println(
                "Jumlah = " +
                        Collections.frequency(tinggiB,160));

        System.out.println("\nBarat 56 kg dari tim A");

        if(Collections.binarySearch(beratA,56) >= 0)
            System.out.println("Ada");

        System.out.println(
                "Jumlah = " +
                        Collections.frequency(beratA,56));

        System.out.println("\nBerat 53 dari tim A");

        if(Collections.binarySearch(beratA,53) >= 0)
            System.out.println("Ada");
        else
            System.out.println("Tidak ada");

        System.out.println(
                "Jumlah = " +
                        Collections.frequency(beratA,53));

        boolean tinggiSama =
                !Collections.disjoint(tinggiA, tinggiB);

        boolean beratSama =
                !Collections.disjoint(beratA, beratB);

        System.out.println("\nTingginya sama?");
        System.out.println(
                tinggiSama ? "Ada" : "Tidak ada");

        System.out.println("\nBeratnya sama?");
        System.out.println(
                beratSama ? "Ada" : "Tidak ada");
    }
}