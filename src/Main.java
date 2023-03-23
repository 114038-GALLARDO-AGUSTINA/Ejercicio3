import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precio1,precio2,precio3;
        int cantidad1, cantidad2, cantidad3;

        System.out.println("Ingrese el precio del primer articulo");
        precio1 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida ");
        cantidad1 = scanner.nextInt();

        System.out.println("Ingrese el precio del segundo articulo");
        precio2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida");
        cantidad2 = scanner.nextInt();

        System.out.println("Ingrese el precio del tercer articulo");
        precio3 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida");
        cantidad3 = scanner.nextInt();

        double subtotal1 = precio1*cantidad1;
        double subtotal2 = precio2*cantidad2;
        double subtotal3 = precio3*cantidad3;

        double total = subtotal1+subtotal2+subtotal3;
        System.out.println("El total de la factura es: "+total);

    }
}