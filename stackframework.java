import java.util.*;

public class stackframework {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("jain ");
        s.push("Tanisha");
        s.push("is");
        s.push("name");
        s.push("my");
        while (!s.isEmpty()) {
            System.out.print(s.peek()+"->");
            s.pop();
        }

    }

}
