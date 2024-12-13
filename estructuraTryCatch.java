import java.util.Scanner;

public class estructuraTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena que represente un número entero: ");
        
        String cadena = sc.nextLine();
        try {
            int nro = Integer.parseInt(cadena);
            System.out.println("El número ingresado es: " + nro);
            System.out.println("El tipo de dato cambió de " + cadena.getClass().getSimpleName() +
                                " a " + ((Object) nro).getClass().getSimpleName());
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida a un número entero.");
        } finally {
        sc.close();
        }
    }
}