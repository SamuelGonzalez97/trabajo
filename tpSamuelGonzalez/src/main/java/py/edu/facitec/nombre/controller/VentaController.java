package py.edu.facitec.nombre.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.DAOGenerico;
import py.edu.facitec.dao.VentaDAO;
import py.edu.facitec.nombre.entidad.Venta;
@Controller
@Transactional 
public class VentaController {
	
	// Gestiona las operaciones con la bd
		// Crea unn objeto global unico para toda la aplicacio, inyecion de la dependecia.
		@Autowired  
		   private VentaDAO ventaDAO;
		@RequestMapping("/venta")
		public String insertar(Venta venta){
			ventaDAO.guardar(venta);
			System.out.println("Registrado con exito");
			return "views/venta/ok";
		}
	}


