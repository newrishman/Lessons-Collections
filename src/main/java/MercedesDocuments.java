import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MercedesDocuments {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        testList(list);
        //testList(list2);

    }
    public static void testList(List<Integer> list){
        for (int i = 0; i<10000000; i++){
            list.add(0, i);
        }
        System.out.println(list);
    }
}
