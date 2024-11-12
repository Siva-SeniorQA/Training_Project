import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add("Siva");
        list.add(100);list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);

        ArrayList list1=new ArrayList();

        list1=(ArrayList)list.clone();
        System.out.println(list1);
    }
}
