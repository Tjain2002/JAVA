import java.util.*;

public class validparenthesis {

    public static boolean parenthesis(String str) {

        char ch;
        Stack<Character> str1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                str1.push(ch);
            }

            else {
                if (str1.isEmpty()) {
                 //   System.out.println("stack is empty");

                    return false;

                }

                else {
                    if (str1.peek() == '[' && ch == ']' || str1.peek() == '{' && ch == '}'
                            || str1.peek() == '(' && ch == ')') {
                        str1.pop();
                    } else {
                        return false;
                    }
                }
            }
        }


     return str1.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the parenthesis");
        String str = sc.next();
        if(parenthesis(str))
        {
            System.out.println("parenthesis is valid");
        }
        else{
            System.out.println("parenthesis is not valid");
        }
    }

}
