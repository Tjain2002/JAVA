import java.util.*;

public class romantoint {

    public static void main(String[]args)
    {


        String str="IV";
       HashMap<Character,Integer>map=new HashMap<>();
    //    values['I']=1;
    //    values['V']=5;
    //    values['X']=10;
    //    values['L']=50;
    //    values['C']=100;
    //    values['D']=500;
    //    values['M']=1000;
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
int prev=0;
int result=0;

for(int i=str.length()-1;i>=0;i--)
{

    char ch=str.charAt(i);
    int cv =map.get(ch);
    if(cv<prev)
    {
        result=result-cv;
    }
    else{
        result=result+cv;
    }
    prev=cv;
    

}
System.out.println(result);





    }
    
}
