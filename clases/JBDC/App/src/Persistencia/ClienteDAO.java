package Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entidades.Cliente;

public class ClienteDAO extends DAO {
    public void guardarCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
        }
        String sql = "INSERT INTO clientes (nombre, apellido, email) VALUES ('"

                + cliente.getNombreCliente() + "', '"
                + cliente.getNombreContacto() + "','"
                + cliente.getApellidoContacto() + "','"
                + cliente.getFax() + "')";
        insertarModificarEliminarDataBase(sql);
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        String sql = "SELECT id, nombre, apellido FROM clientes";
        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id"));
            cliente.setNombreContacto(resultSet.getString("nombre"));
            cliente.setApellidoContacto(resultSet.getString("apellido"));
            clientes.add(cliente);
        }
        return clientes;
    }

    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM clientes WHERE id = " + id;
        insertarModificarEliminarDataBase(sql);
    }
}
