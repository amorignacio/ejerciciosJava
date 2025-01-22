import java.util.Scanner;
public class estructuraWhile {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número entero: ");
    int numero = scanner.nextInt();
    numero = Math.abs(numero);
    int contador = 0;

    if (numero == 0) {
        contador = 1;
    }

    while (numero > 0) {
        numero = numero / 10;
        contador++;
    }
    System.out.println("El número tiene " + contador + " dígitos.");
    scanner.close();
    }
}