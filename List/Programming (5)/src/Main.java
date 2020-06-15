import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        while (sc.hasNext()){
            str.add(sc.next());
        }
        System.out.println(str);
    }
}