
import com.sun.jdi.connect.Connector;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Dentro de la carpeta “modelos” crea la clase “Empleado” con los atributos nombre, 
edad, salario y departamento. Todos sus atributos deben ser declarados como privados 
y deben contar con sus métodos getter y setter.  */

public class Empleado { 

private String nombre;
private int edad;
private double  salario;
private String departamento;

private static List<Empleado> empleados = new ArrayList<>();

//Constructor

public Empleado(String nombre, int edad, double salario, String departamento){
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

public static Empleado buscarPorNombre(List<Empleado> empleados, String nombre) {
    for (Empleado empleado : empleados) {
        if (empleado.getNombre().equalsIgnoreCase(nombre)) {
            return empleado; // Devuelve el primer empleado que coincide con el nombre
        }
    }
    return null; // Si no encuentra a nadie, devuelve null
}

}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        
}