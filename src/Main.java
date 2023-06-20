import java.sql.Connection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Mời bạn nhập số phần tử mà bạn muốn thên");
        int so= sc.nextInt();
        for (int i = 0; i < so; i++) {
            System.out.println("Mời bạn nhập số thứ : "+(i+1));
            int soo = sc.nextInt();
            list.add(soo);
        }

        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
            list1.add(list.get(i));
        }
        System.out.println("dãy số sau khi bị thay đổi là: ");
        System.out.println(list1);
    }
}