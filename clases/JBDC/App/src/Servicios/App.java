package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entidades.Cliente;
import Persistencia.ClienteDAO;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conexion = getConnection();
       // buscarClientes(conexion);
       //buscarClientePorCodigo(conexion, 19);
       //buscarClientesPorEmpleado(conexion, 11);
       getProductosParaReponer(conexion, 16);
       
       

ClienteDAO conexionCliente = new ClienteDAO();
Cliente cliente1 = new Cliente();
cliente1.setIdCliente(30);
cliente1.setCodigoCliente(30);
cliente1.setNombreCliente("Juan S.A");
cliente1.setNombreContacto("Juan");
cliente1.setFax("111");
conexionCliente.guardarCliente(cliente1);
       buscarClientes(conexion);
       

       cerrarConexion(conexion);
    }

    public static Connection getConnection() {
        String host = "127.0.0.1"; // localhost
        String port = "3305"; // por defecto es el puerto que utiliza
        String name = "root"; // usuario de la base de datos
        String password = "pass"; // password de la base de datos
        String database = "vivero"; // nombre de la base de datos recien creada, en este caso vivero.
        // Esto especifica una zona horaria, no es obligatorio de utilizar, pero en
        // algunas zonas genera conflictos de conexión si no existiera
        String zona = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + zona;
        // esto indica la ruta de conexion, que es la combinacion de
        // host,usuario,puerto, nombre de la base de datos a la cual queremos
        // conectarnos y la zona horaria (si se precisara).

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(url, name, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el conector JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void buscarClientes(Connection conexion) {
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente ";
        try {
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        int count = 0;
        while (rs.next()) {
        String nombre = rs.getString("nombre_contacto");
        String apellido = rs.getString("apellido_contacto");
        String telefono = rs.getString("telefono");
        count++;
        System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
        }
        // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
        rs.close();
        stmt.close();
        } catch (SQLException e) {
        System.out.println("Error en la consulta: " + e.getMessage());
        }
        }

/*Realiza un método llamado buscarClientePorCodigo(codigo) 
    que reciba como parámetro el código del cliente y muestre
      por pantalla los datos que tiene el cliente guardado en la base de datos. */   

    public static void buscarClientePorCodigo(Connection conexion, int codigoCliente) {
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente WHERE codigo_cliente = "+codigoCliente+" ";
        try {
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        int count = 0;
        while (rs.next()) {
        String nombre = rs.getString("nombre_contacto");
        String apellido = rs.getString("apellido_contacto");
        String telefono = rs.getString("telefono");
        count++;
        System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
        }
        // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
        rs.close();
        stmt.close();
        } catch (SQLException e) {
        System.out.println("Error en la consulta: " + e.getMessage());
        }
        }


/*Realiza un método llamado  buscarClientesPorEmpleado(codigo) que reciba el 
código del empleado como parámetro y muestre todos los clientes asociados a un
 empleado en particular. Puedes elegir qué campos mostrar en tu método. */ 


 public static void buscarClientesPorEmpleado(Connection conexion, int idEmpleado) {
    String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente WHERE id_empleado = "+idEmpleado+" ";
    try {
    Statement stmt = conexion.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    int count = 0;
    while (rs.next()) {
    String nombre = rs.getString("nombre_contacto");
    String apellido = rs.getString("apellido_contacto");
    String telefono = rs.getString("telefono");
    count++;
    System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
    }
    // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
    rs.close();
    stmt.close();
    } catch (SQLException e) {
    System.out.println("Error en la consulta: " + e.getMessage());
    }
    }

/*Realiza una función getProductosParaReponer(puntoReposicion) que dado un 
número de punto de reposición que se pasa como parámetro, liste todos los 
productos que están por debajo de su punto de reposición, esto quiere decir, 
que tienen menos stock que el punto establecido. */

public static void getProductosParaReponer(Connection conexion, int puntosReposicion) {
    String sql = "SELECT nombre FROM producto WHERE cantidad_en_stock <  "+puntosReposicion+" ";
    try {
    Statement stmt = conexion.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    int count = 0;
    while (rs.next()) {
    String nombre = rs.getString("nombre");
    
    count++;
    System.out.println(count + " - " + nombre);
    }
    // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
    rs.close();
    stmt.close();
    } catch (SQLException e) {
    System.out.println("Error en la consulta: " + e.getMessage());
    }
    }

   /*  String sql = "SELECT * FROM producto WHERE categoria = ?";
    PreparedStatement ps = conexion.prepareStatement(sql);
    ps.setString(1, "Variable");
    ResultSet rs = ps.executeQuery();*/

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("La conexión a la base de datos fue cerrada de manera exitosa");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión:" + e.getMessage());
            }
        }
    }
}
