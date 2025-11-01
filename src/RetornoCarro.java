import java.util.Scanner;

public class RetornoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        //scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a + b);
    }
}
