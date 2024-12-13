import java.util.*;
class printelementsinarraylist{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //Accepting array list elements
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.size();
        System.out.println("size is:"+a.size());
        //printing the elements in an arraylist
        for(int i=0;i<a.size();i++)
        System.out.println(a.get(i)+" ");
        a.add(89);
        System.out.println(a);
    }
}