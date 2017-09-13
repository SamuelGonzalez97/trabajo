package py.edu.facitec.nombre.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
@Transactional
@MappedSuperclass
public abstract class General {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer codigo;


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "General [codigo=" + codigo + "]";
	}
	
	
	
	
	

}
