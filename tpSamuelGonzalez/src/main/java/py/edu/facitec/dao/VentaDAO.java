package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.nombre.entidad.Venta;

@Repository // Trabaja con entity manager
public class VentaDAO extends DAOGenerico<Venta> {
	  public VentaDAO(){
		super(Venta.class);
		// TODO Auto-generated constructor stub
	}

	// Manejador de la conexion para cada entidad
	@PersistenceContext
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		
		return this.em;
	}
	
	/*public void save(Cliente cliente){
		//Metodo para insertar datos
		//Convierte el objecto recibido en una sentencia SqL
		em.persist(cliente);*/
	}


