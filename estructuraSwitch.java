import java.util.InputMismatchException;
import java.util.Scanner;

/*
public class estructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lunes - 1 ");
        System.out.println("Martes - 2 ");
        System.out.println("Miércoles - 3 ");
        System.out.println("Jueves - 4 ");
        System.out.println("Viernes - 5 ");
        System.out.println("Sábado - 6 ");
        System.out.println("Domingo - 7 ");
        System.out.println("Ingrese un día de la semana (en número): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1, 2, 3, 4, 5 -> System.out.println("El día " + dia + " es día hábil.");
            case 6, 7 -> System.out.println("El día " + dia + " NO es día hábil.");
            default -> System.out.println("El número ingresado no es válido.");
        }

        sc.close();
    }
}
*/

/* 
public class estructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char figura;
        char continuar;

        System.out.println("--- CALCULADORA DE ÁREA Y PERÍMETRO ---");
        
        // Estructura do-while para que ejecute hasta elegir pararlo
        do {
            System.out.print("¿Qué figura elegirá? (C: Círculo / R: Rectángulo): ");
            figura = sc.next().charAt(0);

            // Estructura switch para calcular segun eleccion
            switch (figura) {
                case 'c', 'C' -> {
                    System.out.println("Ingrese el valor del radio del Circulo: ");
                    double radio = sc.nextDouble();

                    // Llamo a la función de selección
                    char opcionC = seleccionarCalculo(sc); // Paso sc como parámetro

                    if (opcionC == 'A') {
                        double areaC = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo de radio " + radio + " es: " + areaC);
                    } else if (opcionC == 'P') {
                        double perimetroC = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo de radio " + radio + " es: " + perimetroC);
                    }
                }
                case 'r', 'R' -> {
                    System.out.println("Ingrese el valor de la base del Rectangulo: ");
                    float base = sc.nextFloat();
                    System.out.println("Ingrese el valor de la altura del Rectangulo: ");
                    float altura = sc.nextFloat();

                    char opcionR = seleccionarCalculo(sc);

                    if (opcionR == 'A') {
                        double areaR = base * altura;
                        System.out.println("El área del rectángulo de base " + base + " y altura " + altura + " es: " + areaR);
                    } else if (opcionR == 'P') {
                        double perimetroR = 2 * base + 2 * altura;
                        System.out.println("El perímetro del rectángulo de base " + base + " y altura " + altura + " es: " + perimetroR);
                    }
                }
                default -> System.out.println("La opción ingresada es incorrecta.");
            }
            
            // Preguntar si el usuario desea continuar
            System.out.print("¿Desea continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("Gracias por usar la calculadora!");

        sc.close();
    }

    // Función para la selección de tipo de cálculo
    public static char seleccionarCalculo(Scanner sc) {
        char opcion;
        do {
            System.out.print("¿Qué desea calcular? (A: Área / P: Perímetro): ");
            opcion = sc.next().toUpperCase().charAt(0);
    
            if (opcion != 'A' && opcion != 'P') {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 'A' && opcion != 'P');
        
        return opcion;
    }
}
*/


public class estructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char figura;
        char continuar;

        System.out.println("--- CALCULADORA DE ÁREA Y PERÍMETRO ---");
        
        // Estructura do-while para que ejecute hasta elegir pararlo
        do {
            System.out.print("¿Qué figura elegirá? (C: Círculo / R: Rectángulo): ");
            figura = sc.next().charAt(0);

            // Estructura switch para calcular segun eleccion
            switch (figura) {
                case 'c', 'C' -> {
                    double radio = 0;
                    try {
                        System.out.println("Ingrese el valor del radio del Circulo: ");
                        radio = sc.nextDouble();

                        // Llamo a la función de selección
                        char opcionC = seleccionarCalculo(sc); // Paso sc como parámetro

                        if (opcionC == 'A') {
                            double areaC = Math.PI * Math.pow(radio, 2);
                            System.out.println("El área del círculo de radio " + radio + " es: " + areaC);
                        } else if (opcionC == 'P') {
                            double perimetroC = 2 * Math.PI * radio;
                            System.out.println("El perímetro del círculo de radio " + radio + " es: " + perimetroC);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresó un caracter en lugar de un numero.");
                    } catch (Exception e) {
                        System.out.println("Sucedió un error.");
                    }
                }
                case 'r', 'R' -> {
                    float base = 0;
                    float altura = 0;
                    try {
                        System.out.println("Ingrese el valor de la base del Rectangulo: ");
                        base = sc.nextFloat();
                        System.out.println("Ingrese el valor de la altura del Rectangulo: ");
                        altura = sc.nextFloat();

                        char opcionR = seleccionarCalculo(sc);

                        if (opcionR == 'A') {
                            double areaR = base * altura;
                            System.out.println("El área del rectángulo de base " + base + " y altura " + altura + " es: " + areaR);
                        } else if (opcionR == 'P') {
                            double perimetroR = 2 * base + 2 * altura;
                            System.out.println("El perímetro del rectángulo de base " + base + " y altura " + altura + " es: " + perimetroR);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresó un caracter en lugar de un numero.");
                    } catch (Exception e) {
                        System.out.println("Sucedió un error.");
                    }
                }
                default -> System.out.println("La opción ingresada es incorrecta.");
            }
            
            // Preguntar si el usuario desea continuar
            System.out.print("¿Desea continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("Gracias por usar la calculadora!");

        sc.close();
    }

    // Función para la selección de tipo de cálculo
    public static char seleccionarCalculo(Scanner sc) {
        char opcion;
        do {
            System.out.print("¿Qué desea calcular? (A: Área / P: Perímetro): ");
            opcion = sc.next().toUpperCase().charAt(0);
    
            if (opcion != 'A' && opcion != 'P') {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 'A' && opcion != 'P');
        
        return opcion;
    }
}
