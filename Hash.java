import java.util.*;

public class Hash{

public static void main(String[]args)
{
 
HashSet<Integer>set=new HashSet<>();
set.add(10);
set.add(20);
set.add(30);
set.add(40);


ArrayList<String>str=new ArrayList<>();
str.add("A");
str.add("B");
str.add("C");
str.add("D");
String ch= str.get(0);
int a=Character.getNumericValue('a');
System.out.println("a="+a);




Iterator it = set.iterator();
while(it.hasNext())
{
System.out.println(it.next());


}
}
}