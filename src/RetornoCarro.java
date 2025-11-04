import java.util.Scanner;
import java.math.BigDecimal;

public class RetornoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal("1.1");
        BigDecimal b = new BigDecimal("1.1");
        BigDecimal c = new BigDecimal(1.1);


        BigDecimal suma = a.add(b);



        int num[] = new int[10];

        System.out.println(suma);

        scanner.close();
    }
}
