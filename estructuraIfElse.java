import java.util.Scanner;


public class estructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasenaPredefinida = "predefinida";

        System.out.println("Ingrese la contrasena: ");
        String contrasena = sc.nextLine();

        String mensaje = contrasena.equals(contrasenaPredefinida) ? "Acceso concedido." : "Acceso denegado.";
        System.out.println(mensaje);
    }
}


/*
public class estructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        float precio = sc.nextFloat();

        if (precio >= 100) {
            float precioFinal = precio * 0.9f;
            System.out.println("El precio final del producto es de: " + precioFinal);
        } else {
            System.out.println("El precio final del producto es de: " + precio);
        }
    }
}
*/

/*
public class estructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto.");
        } else if (edad >= 65) {
            System.out.println("Eres un adulto mayor.");
        } else {
            System.out.println("Edad no válida.");
        }
    }
}
*/