
import java.util.Arrays;
import java.util.Comparator;

class ArraysSortDemo {
    public static void main(String args[]) {

        int[] a = {10, 5, 20, 11, 6}; 
        System.out.print("Primitive Array Before Sorting : ");  //  10 5 20 11 6
        for (int a1 : a) {
        System.out.print(a1+" ");
         }

        Arrays.sort(a);
        System.out.print("\n\nPrimitive Array After Sorting : ");   // 5 6 10 11 20
        for (int a1 : a) {
        System.out.print(a1+" ");
         }

        String[] s = {"A", "Z", "B"};
        System.out.print("\n\nObject Array Before Sorting : ");     // A Z B
        for (String s1 : s) {
        System.out.print(s1+" ");
         }

        Arrays.sort(s);
        System.out.print("\n\nObject Array After Sorting : ");      //  A B Z
        for (String s1 : s) {
        System.out.print(s1+" ");
         }

        Arrays.sort(s, new MyComparator1());
        System.out.print("\n\nObject Array After Sorting : ");      //  Z B A
        for (String s1 : s) {
        System.out.print(s1+" ");
         }
    }
}    
class MyComparator1 implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        return s2.compareTo(s1);
    }
}