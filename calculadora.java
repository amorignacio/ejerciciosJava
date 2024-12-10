import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char letra = 'a';
        double num1, num2;

        System.out.println("--- CALCULADORA DE DOS NÚMEROS ---");
        
        do {
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextDouble();
            
            // Llamar a la función menú
            int numero = menu(sc); // Pasar el Scanner como parámetro
            
            switch (numero) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    String mensaje = (num2 == 0) ? "No se puede dividir por cero." : "Resultado: " + (num1 / num2);
                    System.out.println(mensaje);
                    break;
                
                default:
                    System.out.println("El número ingresado es incorrecto.");
            }
            
            // Preguntar si el usuario desea continuar
            System.out.print("¿Desea continuar? (S/N): ");
            letra = sc.next().charAt(0);
        } while (letra == 's' || letra == 'S');
        
        System.out.println("Gracias por usar la calculadora!");
    }
    
    // Función para mostrar el menú y obtener la selección del usuario
    public static int menu(Scanner sc) {
        System.out.println("Ingrese el número de tipo de operación a realizar:");
        System.out.println("1 - Para la Suma");
        System.out.println("2 - Para la Resta");
        System.out.println("3 - Para la Multiplicación");
        System.out.println("4 - Para la División");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }
}
