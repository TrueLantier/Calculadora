import java.util.Scanner;

public class RetornoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] q = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int cont = 0;
        while (cont<5) {
            boolean hay_error = true;
            String str_prueba = scanner.nextLine();

            uno:    for ( int i = 0; i<str_prueba.length(); i++) {
                for ( int j = 0; j<10; j++) {
                    if ( str_prueba.charAt(i) == q[j] ) {
                        hay_error = false;
                        continue uno;
                    }   else {
                        hay_error = true;
                    }
                }
                if (hay_error) break ;
            }

            if ( hay_error ) System.out.println("Hay error.");
            else System.out.println("No hay error.");
            cont++;
        }
        scanner.close();
    }
}
