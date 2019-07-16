import java.util.*;

public class MercedesDocuments {
    public static void main(String[] args) {

        Set<WIS> doc = new HashSet<>();

        doc.add(new WIS(1, "Общий обзор автомобиля"));
        doc.add(new WIS(2, "Двигатель в целом"));
        doc.add(new WIS(3, "КШМ"));
        doc.add(new WIS(4, "ГРМ"));
        doc.add(new WIS(5, "Система топливных элементов"));
        doc.add(new WIS(6, "Смесеобразование"));
        doc.add(new WIS(7, "Элекрический привод"));
        doc.add(new WIS(7, "Элекрический привод"));
        doc.add(new WIS(7, "Система впуска"));

        System.out.println(doc);

        Set<WIS> doc2 = new LinkedHashSet<>();
        doc2.addAll(doc);

        System.out.println(doc2);


        Set<WIS> doc3 = new TreeSet<>(doc2);


        System.out.println(doc3);

    }

    static class WIS implements Comparable<WIS>{
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



        @Override
        public int compareTo(WIS o) {
            return number - o.number;
        }
    }

}
