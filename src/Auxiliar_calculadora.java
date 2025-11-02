import java.util.Scanner;

public class Auxiliar_calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primer_número, segundo_número;
        double resultado = 0;
        String operación;
        String rectificar_primero, rectificar_segundo, rectificar_operación;
        char[] nums = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] caracteres = { '+', '-', '*', '/'};

        while (true) {
            boolean hay_error = true;

            System.out.println("\n\t*** Calculadora JAVA ***");
            System.out.println("Escriba \'SALIR' para dejar de usar la aplicación.");
            System.out.println("Ingrese el primer número: ");

            String str_prueba = scanner.nextLine();
            if ( str_prueba.equals("SALIR") ) break;

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

            if ( hay_error ) System.out.println("Hay error.");
            // Debería poner un bucle aquí. Para repetir hasta que el usuario no ingrese un error.
            //else System.out.println("No hay error.");

            primer_número = Double.parseDouble(str_prueba);

            //Aquí otro bucle para ver que no halla error en introducir la operación.
            System.out.println("Elija la operación: ");
            System.out.println("+  -  *  /");
            str_prueba = scanner.nextLine();
            if ( str_prueba.equals("SALIR") ) break;

            dos:    for ( int i = 0; i<str_prueba.length(); i++) {
                for ( int j = 0; j<10; j++) {
                    if ( str_prueba.charAt(i) == caracteres[j] ) {
                        hay_error = false;
                        continue dos;
                    }   else {
                        hay_error = true;
                    }
                }
                if (hay_error) break ;
            }

            if ( hay_error ) System.out.println("Hay error.");
            // Hasta aquí el 2do bucle.

            operación = str_prueba;

            //Empieza 3er bucle do-while
            System.out.println("Ingrese el segundo número: ");
            str_prueba = scanner.nextLine();
            if ( str_prueba.equals("SALIR") ) break;

            tres:    for ( int i = 0; i<str_prueba.length(); i++) {
                for ( int j = 0; j<10; j++) {
                    if ( str_prueba.charAt(i) == nums[j] ) {
                        hay_error = false;
                        continue tres;
                    }   else {
                        hay_error = true;
                    }
                }
                if (hay_error) break ;
            }

            if ( hay_error ) System.out.println("Hay error.");
            // Hasta aquí sería el segundo bucle.

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
