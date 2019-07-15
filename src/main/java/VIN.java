import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class VIN {
    public static void main(String[] args) {
        Set<Integer> VIN = new HashSet<>();
        VIN.add(176);
        VIN.add(246);
        VIN.add(117);
        VIN.add(205);
        VIN.add(213);
        VIN.add(222);
        VIN.add(167);
        VIN.add(463);

        System.out.println(VIN.isEmpty());

        VIN.contains(222);

        Set<Integer> VIN2 = new TreeSet<>();
        VIN2.addAll(VIN);

        System.out.println(VIN2);
    }
}
