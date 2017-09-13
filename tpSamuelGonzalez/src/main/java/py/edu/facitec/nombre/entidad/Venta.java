package py.edu.facitec.nombre.entidad;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Venta  extends General {
	
	private BigDecimal monto;
	private String factura;
	
	@OneToMany(mappedBy="venta")
	private List<itemVenta>itemVentas;
	
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public List<itemVenta> getItemVentas() {
		return itemVentas;
	}
	public void setItemVentas(List<itemVenta> itemVentas) {
		this.itemVentas = itemVentas;
	}
	

	
	

}
