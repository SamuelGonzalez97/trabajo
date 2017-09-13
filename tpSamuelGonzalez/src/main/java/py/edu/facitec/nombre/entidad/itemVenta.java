package py.edu.facitec.nombre.entidad;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class itemVenta extends General {
         private Integer cantidad;
         @ManyToOne
         private Venta venta;
		public Integer getCantidad() {
			return cantidad;
		}
		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
		public Venta getVenta() {
			return venta;
		}
		public void setVenta(Venta venta) {
			this.venta = venta;
		}


	
}
