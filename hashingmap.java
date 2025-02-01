import java.util.*;

public class hashingmap {

public static void main(String[]args)
{
    HashMap<String,Integer>map=new HashMap<>();
    map.put("roll-no",21);
    
    map.put("roll-no",22);
    map.put("roll-no3",24);
    map.put("roll-no3",25);
    map.put("roll-no4",25);

    System.out.println(map);



    if(map.containsKey("roll-no"))
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    System.out.println(map.get("roll-no"));
    System.out.println(map.get("my roll no"));

    System.out.println(map.hashCode());


    //   Iteration in hashmap
    for(Map.Entry<String,Integer>e:map.entrySet())
    {
        System.out.println("key"+e.getKey());
        
        System.out.println("value"+e.getValue());

    }
    Set<String>key=map.keySet();
    for(String val:key)
    { 
        System.out.println(map.get(val));

    }

}
    
}
