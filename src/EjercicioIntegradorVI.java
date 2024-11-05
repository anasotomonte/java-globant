import java.util.Scanner;


public class EjercicioIntegrador {
    public static void main(String[] args) {
        import java.util.Scanner;

public class EjAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 100;
        String[] alumnos = new String[op];
        double[] notas = new double[op];
        int cont = 0;
        do {
            System.out.println("1.Registrar alumno :");
            System.out.println("2.Mostrar todos los alumnos :");
            System.out.println("3.Mostrar promedio de notas :");
            System.out.println("4.Buscar alumno por nombre :");
            System.out.println("5.Modificar nota por nombre :");
            System.out.println("6.Eliminar alumno por nombre :");
            System.out.println("7. Salir");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Opcion 1");
                    do {
                        System.out.println("Ingrese el nombre del alumno: ");
                        alumnos[cont] = sc.nextLine();
                    } while ((alumnos[cont].equals("")));
                    do {
                        System.out.println("Ingrese la nota del mismo alumno: ");
                        notas[cont] = sc.nextDouble();
                    } while (notas[cont] < 0 || notas[cont] > 10);
                    cont = cont + 1;
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    if (cont == 0) {
                        System.out.println("No hay alummos registrados");
                    } else {
                        System.out.println("Lista de Alumnos");
                        System.out.println("----------------------");
                        for (int i = 0; i < cont; i++) {
                            System.out.println("Nombre: " + alumnos[i]);
                            System.out.println("Nota: " + notas[i]);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 3:
                    if (cont == 0) {
                        System.out.println("No hay registro de notas");
                    } else {
                        double promedio = 0;
                        System.out.println("Calculando...");
                        for (int i = 0; i < cont; i++) {
                            promedio += notas[i];
                        }
                        System.out.println("El promedio es :" + (promedio / cont));
                    }
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    System.out.println("Ingresa el nombre del alumno que deseas buscar: ");
                    // sc.nextLine();
                    String buscarNombre = sc.nextLine().trim();
                    boolean encontrado = false;

                    for (int i = 0; i < cont; i++) {
                        if (alumnos[i].equalsIgnoreCase(buscarNombre)) {
                            System.out.println("Alumno encontrado: " + alumnos[i] + ", Nota: " + notas[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El alumno que ingresaste no pudo ser encontrado.");
                    }
                    break;
                /*
                 * System.out.print("Ingresa el nombre del alumno a buscar: ");
                 * String buscarNombre = scanner.nextLine();
                 * 
                 * if (!alumnos.containsKey(buscarNombre)) {
                 * System.out.println("La nota de " + buscarNombre + ": "
                 * +!alumnos.get(buscarNombre));
                 * } else {
                 * System.out.println("El alumno no está registrado.");
                 * }
                 * break;
                 */

                case 5:
                    sc.nextLine();
                    int i = 0;
                    boolean existe = false;
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = sc.nextLine();

                    while (i < cont && !existe) {
                        if (alumnos[i].equalsIgnoreCase(nombre)) {
                            existe = true;
                        } else {
                            i++;
                        }
                    }
                    if (existe) {
                        System.out.print("Ingrese su nueva nota: ");
                        double nota = sc.nextDouble();
                        notas[i] = nota;
                        System.out.println("Modificación exitosa");
                    } else {
                        System.out.printf("%s no existe en el sistema\n", nombre);
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Eliminar alumno por nombre");
                    System.out.println("Ingrese nombre");
                    String buscado = sc.nextLine();
                    boolean eliminado = false;
                    for (int j = 0; j < cont; j++) {
                        if (alumnos[j].equalsIgnoreCase(buscado)) {
                            for (int j2 = j; j2 < cont - 1; j2++) {
                                alumnos[j2] = alumnos[j2 + 1];
                                notas[j2] = notas[j2 + 1];

                            }
                            cont--;
                            System.out.println("Alumno eliminado exitosamente");
                            eliminado = true;
                            break;
                        }

                    }
                    if (!eliminado) {
                        System.out.println("Alumno no encontrado");
                    }

                    break;
                case 7:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 7);
        sc.close();

    }
}
// guardenlo!!
