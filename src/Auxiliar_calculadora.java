import java.util.Scanner;

public class Auxiliar_calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primer_número, segundo_número;
        int resultado = 0;
        String operación;

        while (true) {
            System.out.println("\t*** Calculadora JAVA ***");

            System.out.println("Ingrese el primer número: ");
            primer_número = Integer.parseInt(scanner.nextLine());

            System.out.println("Elija la operación: ");
            System.out.println("+  -  *  /");
            operación = scanner.nextLine();

            System.out.println("Ingrese el segundo número: ");
            segundo_número = Integer.parseInt(scanner.nextLine());
            // Hasta aquí sería el segundo bucle.

            if (operación.length() == 1) {
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
            }   else {
                System.out.println("Error, introduzca los caracteres correctamente.");
            }


            System.out.println(resultado);
            break;
        }

        System.out.println("Has salido de la calculadora.");
        scanner.close();
    }
}
