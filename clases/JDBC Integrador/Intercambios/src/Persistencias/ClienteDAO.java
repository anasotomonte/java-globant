package Persistencias;

import java.util.ArrayList;
import java.util.List;
import Entidades.familias;

public class ClienteDAO extends DAO {
        public void guardarFamilia(Familia familia) throws Exception {
            if (familia == null) {
                throw new Exception("La familia no puede ser nula");
            }
            String sql = "INSERT INTO familias (nombre, edad_minima, edad_maxima, num_hijos, email) VALUES ('"
                    + familias.getNombre() + "', '"
                    + familias.getEdad_minima() + "', '"
                    + familias.getEdad_maxima() + "', '"
                    + familias.getNum_hijos() + "', '"
                    + familias.getEmail() + "')";
            insertarModificarEliminarDataBase(sql);
        }

}
