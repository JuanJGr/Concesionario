import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;
        boolean estado = true;

        do {
            System.out.println("""
                    1. Agregar Vehículo
                    2. Mostrar Vehículos Registrados
                    3. Calcular Precio Final
                    4. Salir
                    """);

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la marca del vehículo:");
                    String marca = scanner.nextLine();
                    System.out.println("Ingrese el modelo del vehículo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Ingrese el año del vehículo:");
                    int año = scanner.nextInt();
                    System.out.println("Ingrese el precio base del vehículo:");
                    double precioBase = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Seleccione el tipo de vehículo:");
                    System.out.println("1. Auto");
                    System.out.println("2. Motocicleta");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Ingrese el número de puertas del auto:");
                            int numeroPuertas = scanner.nextInt();
                            scanner.nextLine();
                            Auto auto = new Auto(marca, modelo, año, precioBase, numeroPuertas);
                            vehiculos.add(auto);
                        }
                        case 2 -> {
                            System.out.println("Ingrese la cilindrada de la motocicleta:");
                            int cilindrada = scanner.nextInt();
                            scanner.nextLine();
                            Motocicleta motocicleta = new Motocicleta(marca, modelo, año, precioBase, cilindrada);
                            vehiculos.add(motocicleta);
                        }
                        default -> System.out.println("Opción no válida.");
                    }
                }

                case 2 -> {
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        for (Vehiculo vehiculo : vehiculos) {
                            System.out.println(vehiculo);
                        }
                    }
                }

                case 3 -> {
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        for (Vehiculo vehiculo : vehiculos) {
                            vehiculo.calcularPrecioFinal();
                        }
                    }
                }

                case 4 -> {
                    System.out.println("Saliendo...");
                    estado = false;
                }

                default -> System.out.println("Opción no válida.");
            }
        } while (estado);
    }
}
