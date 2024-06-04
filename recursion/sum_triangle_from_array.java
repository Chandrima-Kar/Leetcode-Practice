import java.util.ArrayList;

public class sum_triangle_from_array {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        sum(A);
        System.out.println(A);
    }

    static void sum(ArrayList<Integer> list) {
        if (list.size() <= 1)
            return;

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int x = (list.get(i) + list.get(i + 1));
            list2.add(x);
        }

        sum(list2);
        System.out.println(list2);
    }
}
