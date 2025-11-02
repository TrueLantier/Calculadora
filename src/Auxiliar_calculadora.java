import java.util.Scanner;

public class Auxiliar_calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primer_número, segundo_número;
        double resultado = 0;
        String operación;
        char[] nums = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] caracteres = { '+', '-', '*', '/'};

        cero: while (true) {
            boolean hay_error = true;
            String str_prueba = "";

            System.out.println("\n\t*** Calculadora JAVA ***");
            System.out.println("Escriba \'SALIR' para dejar de usar la aplicación.");

            do {
                System.out.println("Ingrese el primer número: ");
                str_prueba = scanner.nextLine();
                if ( str_prueba.equals("SALIR") ) break cero;

                uno:    for ( int i = 0; i<str_prueba.length(); i++) {
                    for ( int j = 0; j<10; j++) {
                        if ( str_prueba.charAt(i) == nums[j] ) {
                            hay_error = false;
                            continue uno;
                        }   else {
                            hay_error = true;
                        }
                    }
                    if (hay_error) break ;
                }

                if ( hay_error ) System.out.println("Hay error.\n");
            }   while (hay_error);

            primer_número = Double.parseDouble(str_prueba);

            do {
                System.out.println("Elija la operación: ");
                System.out.println("+  -  *  /");
                str_prueba = scanner.nextLine();
                if ( str_prueba.equals("SALIR") ) break cero;

                if ( str_prueba.length()>1 ) {
                    hay_error = true;
                    System.out.println("Hay error.\n");
                    continue ;
                }   else {
                    for ( char ch: caracteres ) {
                        if ( ch == str_prueba.charAt(0) ) {
                            hay_error = false;
                            break ;
                        }   else {
                            hay_error = true;
                        }
                    }
                }

                if ( hay_error ) System.out.println("Hay error.\n");
            }   while (hay_error);

            operación = str_prueba;

            do {
                System.out.println("Ingrese el segundo número: ");
                str_prueba = scanner.nextLine();
                if ( str_prueba.equals("SALIR") ) break cero;

                dos:    for ( int i = 0; i<str_prueba.length(); i++) {
                    for ( int j = 0; j<10; j++) {
                        if ( str_prueba.charAt(i) == nums[j] ) {
                            hay_error = false;
                            continue dos;
                        }   else {
                            hay_error = true;
                        }
                    }
                    if (hay_error) break ;
                }

                if ( hay_error ) System.out.println("Hay error.\n");
            }   while (hay_error);

            segundo_número = Double.parseDouble(str_prueba);

            switch (operación) {
                case "+":
                    resultado = primer_número + segundo_número;
                    break;
                case "-":
                    resultado = primer_número - segundo_número;
                    break;
                case "*":
                    resultado = primer_número * segundo_número;
                    break;
                case "/":
                    resultado = primer_número / segundo_número;
                    break;
            }

            System.out.println(resultado);
        }

        System.out.println("Has salido de la calculadora.");
        scanner.close();
    }
}
