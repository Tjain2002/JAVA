import java.util.LinkedList;
import java.util.Queue;

public class queueimplementation {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(9);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
