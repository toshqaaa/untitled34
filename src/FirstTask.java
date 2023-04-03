import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class FirstTask {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void arrayListTime() {
        Date start = new Date();
        for (int i = 0; i < 3000000; i++) {
            arrayList.add(i);
        }
        Date end = new Date();
        long duration = end.getTime() - start.getTime();
        System.out.println("ArrayList: " + duration);
    }

    public void linkedListTime() {
        Date start = new Date();
        for (int i = 0; i < 3000000; i++) {
            linkedList.add(i);
        }
        Date end = new Date();
        long duration = end.getTime() - start.getTime();
        System.out.println("LinkedList: " + duration);
    }
}

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */
