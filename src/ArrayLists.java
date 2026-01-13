import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//
//        System.out.println(list);

            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                lists.get(row).add(in.nextInt());
            }
        }

        System.out.println(lists);
    }
}
