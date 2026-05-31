import java.util.ArrayList;
import java.util.Collections;

public class WilbertSorting {

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

        ArrayList<Integer> tinggiAAsc = new ArrayList<>(tinggiA);
        ArrayList<Integer> tinggiBAsc = new ArrayList<>(tinggiB);

        Collections.sort(tinggiAAsc);
        Collections.sort(tinggiBAsc);

        System.out.println("Tinggi tim A ascending");
        System.out.println(tinggiAAsc);

        System.out.println("\nTinggi tim B ascending");
        System.out.println(tinggiBAsc);

        Collections.sort(tinggiAAsc, Collections.reverseOrder());
        Collections.sort(tinggiBAsc, Collections.reverseOrder());

        System.out.println("\nTinggi tim A descending");
        System.out.println(tinggiAAsc);

        System.out.println("\nTinggi tim B descending");
        System.out.println(tinggiBAsc);

        ArrayList<Integer> beratAAsc = new ArrayList<>(beratA);
        ArrayList<Integer> beratBAsc = new ArrayList<>(beratB);

        Collections.sort(beratAAsc);
        Collections.sort(beratBAsc);

        System.out.println("\nBerat tim A ascending");
        System.out.println(beratAAsc);

        System.out.println("\nBerat tim B ascending");
        System.out.println(beratBAsc);

        Collections.sort(beratAAsc, Collections.reverseOrder());
        Collections.sort(beratBAsc, Collections.reverseOrder());

        System.out.println("\nBerat tim A descending");
        System.out.println(beratAAsc);

        System.out.println("\nBerat tim B descending");
        System.out.println(beratBAsc);

        System.out.println("\nTim A");
        System.out.println("Tinggi Max = " + Collections.max(tinggiA));
        System.out.println("Tinggi Min = " + Collections.min(tinggiA));
        System.out.println("Berat Max = " + Collections.max(beratA));
        System.out.println("Berat Min = " + Collections.min(beratA));

        System.out.println("\nTim B");
        System.out.println("Tinggi Max = " + Collections.max(tinggiB));
        System.out.println("Tinggi Min = " + Collections.min(tinggiB));
        System.out.println("Berat Max = " + Collections.max(beratB));
        System.out.println("Berat Min = " + Collections.min(beratB));

        ArrayList<Integer> tinggiC = new ArrayList<>(tinggiB);
        ArrayList<Integer> beratC = new ArrayList<>(beratB);

        System.out.println("\nTim C (salinan tim B)");
        System.out.println("Tinggi : " + tinggiC);
        System.out.println("Berat  : " + beratC);
    }
}