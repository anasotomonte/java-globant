/*Dentro de la carpeta “modelos” crea la clase “Empleado” con los atributos nombre, edad, 
salario y departamento. Todos sus atributos deben ser declarados como privados y deben contar 
con sus métodos getter y setter. */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    private static List<Empleado> empleados = new ArrayList<>();

    // Constructor
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static List<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(List<Empleado> empleados) {
        Empleado.empleados = empleados;
    }

    // Métodos para agregar y gestionar empleados

    public static void agregarEmpleado(String nombre, int edad, double salario, String departamento) {
        Empleado empleado = new Empleado(nombre, edad, salario, departamento);
        empleados.add(empleado);
        System.out.println("Empleado añadido exitosamente.\n");
    }

    public static void mostrarResumenEmpleados() {
        System.out.printf("%-5s %-15s %-5s %-10s %-15s\n", "ID", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            System.out.printf("%-5d %-15s %-5d %-10.2f %-15s\n", i + 1, emp.nombre, emp.edad, emp.salario,
                    emp.departamento);
        }
        System.out.println();
    }

    public static Empleado buscarPorNombre(List<Empleado> empleados, String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public void imprimirDetalles() {
        System.out.println("Detalles del Empleado:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.printf("Salario: $%.2f\n", this.salario); // Formatea el salario con dos decimales
        System.out.println("Departamento: " + this.departamento);
        System.out.println();
    }

    public static List<Empleado> filtrarEmpleados(String nombre, Integer edadMin, Integer edadMax, Double salarioMin,
            Double salarioMax, String departamento) {
        return empleados.stream()
                .filter(e -> (nombre == null || e.nombre.contains(nombre)))
                .filter(e -> (edadMin == null || e.edad >= edadMin))
                .filter(e -> (edadMax == null || e.edad <= edadMax))
                .filter(e -> (salarioMin == null || e.salario >= salarioMin))
                .filter(e -> (salarioMax == null || e.salario <= salarioMax))
                .filter(e -> (departamento == null || e.departamento.equalsIgnoreCase(departamento)))
                .collect(Collectors.toList());
    }

    public static void ordenarEmpleadosPor(String criterio) {
        switch (criterio.toLowerCase()) {
            case "nombre":
                empleados.sort(Comparator.comparing(e -> e.nombre));
                break;
            case "edad":
                empleados.sort(Comparator.comparingInt(e -> e.edad));
                break;
            case "salario":
                empleados.sort(Comparator.comparingDouble(e -> e.salario));
                break;
            default:
                System.out.println("Criterio no válido. Opciones: nombre, edad, salario.");
                return;
        }
        System.out.println("Lista de empleados ordenada por " + criterio + ".\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menú de Administración de Empleados ---");
            System.out.println("1. Añadir nuevo empleado");
            System.out.println("2. Mostrar resumen de empleados");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Buscar empleado por nombre");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el departamento del empleado: ");
                    String departamento = scanner.nextLine();
                    agregarEmpleado(nombre, edad, salario, departamento);
                    break;

                case 2:
                    mostrarResumenEmpleados();
                    break;

                case 3:
                    System.out.print("Filtrar por nombre (dejar en blanco para omitir): ");
                    String nombreFiltro = scanner.nextLine();
                    System.out.print("Edad mínima (0 para omitir): ");
                    int edadMin = scanner.nextInt();
                    System.out.print("Edad máxima (0 para omitir): ");
                    int edadMax = scanner.nextInt();
                    System.out.print("Salario mínimo (0 para omitir): ");
                    double salarioMin = scanner.nextDouble();
                    System.out.print("Salario máximo (0 para omitir): ");
                    double salarioMax = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Filtrar por departamento (dejar en blanco para omitir): ");
                    String departamentoFiltro = scanner.nextLine();

                    List<Empleado> empleadosFiltrados = filtrarEmpleados(
                            nombreFiltro.isEmpty() ? null : nombreFiltro,
                            edadMin == 0 ? null : edadMin,
                            edadMax == 0 ? null : edadMax,
                            salarioMin == 0 ? null : salarioMin,
                            salarioMax == 0 ? null : salarioMax,
                            departamentoFiltro.isEmpty() ? null : departamentoFiltro);

                    System.out.println("\nEmpleados filtrados:");
                    for (Empleado e : empleadosFiltrados) {
                        System.out.printf("%s, %d años, $%.2f, Departamento: %s\n", e.nombre, e.edad, e.salario,
                                e.departamento);
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Ordenar por (nombre, edad, salario): ");
                    String criterio = scanner.nextLine();
                    ordenarEmpleadosPor(criterio);
                    mostrarResumenEmpleados();
                    break;

                case 5:
                    System.out.print("Ingrese el nombre del empleado que desea buscar: ");
                    nombre = scanner.nextLine();
                    Empleado empleadoEncontrado = buscarPorNombre(empleados, nombre);
            
                    if (empleadoEncontrado != null) {
                        System.out.println("Empleado encontrado:");
                        empleadoEncontrado.imprimirDetalles();
                    } else {
                        System.out.println("No se encontró ningún empleado con el nombre " + nombre);
                    }
                    break;
            
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
            
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            
                }
            } while (opcion != 6);
    
            scanner.close();
        }
    }
        
    


/*
Alexis Joselyn
a

Everyone

17:09 hs
hola, cómo están?

Manuel Miguez Lauría
a

Everyone

17:38 hs
https://prod.liveshare.vsengsaas.visualstudio.com/join?3BA4066DA4AD1D21125B790C65D6EC83FC97

Manuel Miguez Lauría
a

Everyone

17:43 hs
package org.manumiguezz.globant.Class26.modelos;

public class Empleado {
private String nombre;
private int edad;
private double salario;
private String departamento;

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}

public double getSalario() {
return salario;
}

public void setSalario(double salario) {
this.salario = salario;
}

public String getDepartamento() {
return departamento;
}

public void setDepartamento(String departamento) {
this.departamento = departamento;
}




}

Manuel Miguez Lauría
a

Everyone

17:43 hs
package org.manumiguezz.globant.Class26;

import java.util.Scanner;

public class Application {
public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {

}

}

Andrea Milagros Toribio Salazar
a

Everyone

18:05 hs
public static Empleado incrementarSalario(Empleado empleado, double porcentaje){
double incremento = (porcentaje)*empleado.getSalario();
empleado.setSalario(empleado.getSalario()+ incremento)
return empleado;

}

Andrea Milagros Toribio Salazar
a

Everyone

18:07 hs
public static Empleado incrementarSalario(Empleado empleado, double porcentaje){
double incremento = (porcentaje)*empleado.getSalario();
empleado.setSalario(empleado.getSalario()+ incremento);
return empleado;

}

Manuel Miguez Lauría
a

Everyone

18:22 hs
public static List<Empleado> filtrarEmpleados(List<Empleado> empleados, String atributo, Object valor1, Object valor2) {
List<Empleado> filtrados = new ArrayList<>();

for (int i = 0; i < empleados.size(); i++) {
Empleado emp = empleados.get(i);

if (atributo.equalsIgnoreCase("nombre")) {
String nombreFiltro = (String) valor1;
if (emp.getNombre().equalsIgnoreCase(nombreFiltro)) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("edad")) {
int edadMin = (int) valor1;
int edadMax = (int) valor2;
if (emp.getEdad() >= edadMin && emp.getEdad() <= edadMax) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("salario")) {
double salarioMin = (double) valor1;
double salarioMax = (double) valor2;
if (emp.getSalario() >= salarioMin && emp.getSalario() <= salarioMax) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("departamento")) {
String departamentoFiltro = (String) valor1;
if (emp.getDepartamento().equalsIgnoreCase(departamentoFiltro)) {
filtrados.add(emp);
}
}
}

return filtrados;
}

Ana María Sotomonte (Tú)
a

Everyone

18:25 hs
public static Empleado buscarPorNombre(List<Empleado> empleados, String nombre) {
for (Empleado empleado : empleados) {
if (empleado.getNombre().equalsIgnoreCase(nombre)) {
return empleado;
}
}
return null;
}

Manuel Miguez Lauría
a

Everyone

18:26 hs
(empleados.get(j).getNombre().compareTo(empleados.get(j + 1).getNombre()) > 0)

Ezequiel Rodriguez
a

Everyone

18:34 hs
public static void ordenarEmpleadosEdad(ArrayList<Empleado> array) {
int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getEdad() > array.get(j + 1).getEdad()) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}
}

public static void ordenarEmpleadosSalario(ArrayList<Empleado> array) {
int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getSalario() > array.get(j + 1).getSalario()) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}
}

public static void ordenarEmpleadosNombre(ArrayList<Empleado> array) {

int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getNombre().compareTo(array.get(j + 1).getNombre()) > 0 ) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}

}


public static void ordenarEmpleadosDepartamento(ArrayList<Empleado> array) {

int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getDepartamento().compareTo(array.get(j + 1).getDepartamento()) > 0 ) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}




}

Cindy Gnaedinger
a

Everyone

18:35 hs
public static void mostrarEmpleados(List<Empleado> empleados){
if(empleados == null || empleados.isEmpty()){
System.out.println("No se han creado empleados aún.");
return;
}
for (int i = 0; i < empleados.size(); i++) {
Empleado emp = empleados.get(i);
System.out.print("\n Nombre: "+emp.getNombre()+"\n Edad: "+emp.getEdad()+"\n Salario: "+emp.getSalario()+"\n Departamento: "+emp.getDepartamento()+"\n");
}
}

Ana María Sotomonte (Tú)
a

Everyone

18:36 hs
public void imprimirDetalles() {
System.out.println("Detalles del Empleado:");
System.out.println("Nombre: " + this.nombre);
System.out.println("Edad: " + this.edad);
System.out.printf("Salario: $%.2f\n", this.salario); // Formatea el salario con dos decimales
System.out.println("Departamento: " + this.departamento);
System.out.println();
}

Andrea Milagros Toribio Salazar
a

Everyone

18:47 hs
import java.util.ArrayList;
import java.util.List;

public class Empleado {
// atributos de la clase son privados. Solo se inicializan dentro de la clase.
private String nombre;
private int edad;
private double salario;
private String departamento;
static int contador = 0;

public Empleado(String nombre, int edad, double salario, String departamento) {
this.nombre = nombre;
this.edad = edad;
this.salario = salario;
this.departamento = departamento;
contador++;
}

// get es para tomar el valor
public String getNombre() {
return nombre;
}

// set es para cambiar el valor
public void setNombre(String nombre) {
this.nombre = nombre;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}

public double getSalario() {
return salario;
}

public void setSalario(double salario) {
this.salario = salario;
}

public String getDepartamento() {
return departamento;
}

public void setDepartamento(String departamento) {
this.departamento = departamento;
}

public static void mostrarEmpleados(List<Empleado> empleados) {
if (empleados == null || empleados.isEmpty()) {
System.out.println("No se han creado empleados aún.");
return;
}
for (int i = 0; i < empleados.size(); i++) {
Empleado emp = empleados.get(i);
System.out.print("\n Nombre: " + emp.getNombre() + "\n Edad: " + emp.getEdad() + "\n Salario: "
+ emp.getSalario() + "\n Departamento: " + emp.getDepartamento() + "\n");
}
}

public static List<Empleado> filtrarEmpleados(List<Empleado> empleados, String atributo, Object valor1,
Object valor2) {
List<Empleado> filtrados = new ArrayList<>();

for (int i = 0; i < empleados.size(); i++) {
Empleado emp = empleados.get(i);

if (atributo.equalsIgnoreCase("nombre")) {
String nombreFiltro = (String) valor1;
if (emp.getNombre().equalsIgnoreCase(nombreFiltro)) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("edad")) {
int edadMin = (int) valor1;
int edadMax = (int) valor2;
if (emp.getEdad() >= edadMin && emp.getEdad() <= edadMax) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("salario")) {
double salarioMin = (double) valor1;
double salarioMax = (double) valor2;
if (emp.getSalario() >= salarioMin && emp.getSalario() <= salarioMax) {
filtrados.add(emp);
}
} else if (atributo.equalsIgnoreCase("departamento")) {
String departamentoFiltro = (String) valor1;
if (emp.getDepartamento().equalsIgnoreCase(departamentoFiltro)) {
filtrados.add(emp);
}
}
}

return filtrados;
}

public static void ordenarEmpleadosEdad(ArrayList<Empleado> array) {
int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getEdad() > array.get(j + 1).getEdad()) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}
}

public static void ordenarEmpleadosSalario(ArrayList<Empleado> array) {
int tamanio = array.size();
for (int i = 0; i < tamanio - 1; i++) {
for (int j = 0; j < tamanio - i - 1; j++) {
if (array.get(j).getSalario() > array.get(j + 1).getSalario()) {
Empleado temp = array.get(j);
array.set(j, array.get(j + 1));
array.set(j + 1, temp);
}
}
}
}

public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
double incremento = (porcentaje) * empleado.getSalario();
empleado.setSalario(empleado.getSalario() + incremento);
return empleado;

}

}

Andrea Milagros Toribio Salazar
a

Everyone

18:47 hs

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
ArrayList<Empleado> empleados = new ArrayList<>();
int opcion = 0;
empleados.add(new Empleado("Hidalgo Hinostroza",23,2500,"Recursos Humanos"));
empleados.add(new Empleado("Maria de las Mercedes",33,5500,"Recursos Humanos"));
empleados.add(new Empleado("Laura Larague",22,2500,"Recursos Humanos"));


do {
System.out.println("""
Ingrese una opcion del siguiente menu:
1 - Mostrar empleados
2 - Filtrar empleados
3 - Ordenar empleados
4 -
5 - Incrementar salario del empleado
6 - Salir""");
opcion = sc.nextInt();
switch (opcion) {
case 1 -> Empleado.mostrarEmpleados(empleados) ;
case 2 -> Empleado.filtrarEmpleados(empleados,"salario",2000,2500);
case 3 -> System.out.println("n2");
case 4 -> System.out.println("n2");
case 5 -> System.out.println("n2");
case 6 -> System.out.println("Salio del programa");
default -> System.out.println("Ingrese un numero valido");
}
} while (opcion<6);



}
}

*/