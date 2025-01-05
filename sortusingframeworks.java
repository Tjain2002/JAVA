import java.util.*;

public class sortusingframeworks {

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(min) > list.get(j)) {

                    int temp = list.get(j);
                    list.set(j, list.get(min));
                    list.set(min, temp);

                }
            }
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(20);
        LL.add(30);
        LL.add(13);
        LL.add(23);
        ArrayList<Integer> list = new ArrayList<>();
        while (!LL.isEmpty()) {
            list.add(LL.poll());
        }

        sort(list);

    }

}
