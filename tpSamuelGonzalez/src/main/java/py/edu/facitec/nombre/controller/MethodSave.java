package py.edu.facitec.nombre.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.dao.VentaDAO;
import py.edu.facitec.nombre.entidad.Venta;
// trabaja para arquitectura REST
@RestController

@Transactional

@RequestMapping("/ventaDao")
public class MethodSave {
	@Autowired
	private VentaDAO ventaDAO;
	
	// va a responder al verbo GET indicamos que respondera la formato JSON
	@RequestMapping(method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Venta>> getLista(){
		List<Venta> ventas= ventaDAO.getLista();
		
		return new ResponseEntity<>(ventas, HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE
			)
	public  ResponseEntity<Venta> guardar(@RequestBody Venta venta){
		ventaDAO.guardar(venta);
		return new ResponseEntity<Venta>(venta, HttpStatus.OK);
		
	}
}


