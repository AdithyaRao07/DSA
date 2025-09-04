import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> Al=new ArrayList<>();
        Al.add(1);
        Al.add(2);
        Al.add(3);
        Al.add(4);
        System.out.println(Al);
        Al.contains(4);
        Al.addLast(5);
        Al.add(1,10);
        Al.set(2,20);
        System.out.println(Al);
        for(int i=0;i<Al.size();i++){
            System.out.println(Al.get(i));
        }
    }
}
