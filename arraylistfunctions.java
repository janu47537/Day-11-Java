import java.util.*;
class arraylistfunctions{
    public static void main(String[]args){
        ArrayList <Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        //adding at particular index
        a.add(1,789);
        //modifying
        a.set(2,7898);
        System.out.println(a);
    }
}