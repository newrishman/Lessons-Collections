import java.util.*;

public class MercedesDocuments {
    public static void main(String[] args) {

        WIS one = new WIS(1, "Общий обзор автомобиля");
        WIS two = new WIS(2, "Двигатель в целом");
        WIS three = new WIS(3, "КШМ");
        WIS four = new WIS(4, "ГРМ");
        WIS five = new WIS(5, "Система топливных элементов");
        WIS six = new WIS(6, "Смесеобразование");
        WIS seven = new WIS(7, "Элекрический привод");
        WIS eight = new WIS(7, "Элекрический привод");
        WIS nine = new WIS(7, "Система впуска");

        Set<WIS> doc = new HashSet<>();

        doc.add(one);
        doc.add(two);
        doc.add(three);
        doc.add(four);
        doc.add(five);
        doc.add(six);
        doc.add(seven);
        doc.add(eight);
        doc.add(nine);

        System.out.println(doc);

        Set<WIS> doc2 = new LinkedHashSet<>();
        doc2.addAll(doc);

        System.out.println(doc2);

                //   WTF ?! //
        Set<WIS> doc3 = new TreeSet<>(doc2);


        System.out.println(doc3);

    }

    static class WIS {
        private Integer number;
        private String group;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WIS wis = (WIS) o;

            if (!number.equals(wis.number)) return false;
            return group.equals(wis.group);
        }

        @Override
        public int hashCode() {
            int result = number.hashCode();
            result = 31 * result + group.hashCode();
            return result;
        }

        public WIS(Integer number, String group) {
            this.number = number;
            this.group = group;
        }

        @Override
        public String toString() {
            return "WIS{" +
                    "number=" + number +
                    ", group='" + group + '\'' +
                    '}';
        }
    }

}
