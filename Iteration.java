
import java.util.Iterator;
import java.util.HashSet;

public class Iteration {

    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("my");
        set.add("name");
        set.add("is");
        set.add("tanisha");
        set.add("jain");
        set.add(27);

        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
