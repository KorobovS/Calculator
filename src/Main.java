import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();

        System.out.println(calc(data));
    }

    public static String calc(String data) throws Exception {
        String[] items = data.split(" ");

        int arabic = new Except().exceptions(items);

        String res = new Math().calculate(items, arabic);

        return res;
    }
}
