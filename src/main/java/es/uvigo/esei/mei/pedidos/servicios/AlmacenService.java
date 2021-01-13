package es.uvigo.esei.mei.pedidos.servicios;

import java.util.List;

import es.uvigo.esei.mei.pedidos.entidades.Almacen;
import es.uvigo.esei.mei.pedidos.entidades.ArticuloAlmacen;
import es.uvigo.esei.mei.pedidos.entidades.Articulo;

public interface AlmacenService {
	public Almacen crear(Almacen almacen);
	public Almacen modificar(Almacen almacen);
	public void eliminar(Almacen almacen);
	public Almacen buscarPorId(Long id);
	public List<Almacen> buscarTodos();
	public List<Almacen> buscarPorNombre(String patron);
	public List<Almacen> buscarPorLocalidad(String localidad);
	public List<Almacen> buscarPorArticuloId(Long articuloId);

	public ArticuloAlmacen crearArticuloAlmacen(ArticuloAlmacen articuloAlmacen);
	public ArticuloAlmacen crearArticuloAlmacen(Articulo articulo, Almacen almacen, Integer stock);
	public void eliminarArticuloAlmacen(ArticuloAlmacen articuloAlmacen);
	public void eliminarArticuloAlmacen(Long idArticulo, Long idAlmacen);
	public ArticuloAlmacen buscarArticuloAlmacenPorArticuloIdAlmacenId(Long articuloId, Long almacenId);
	public List<ArticuloAlmacen> buscarArticulosAlmacenPorAlmacenId(Long almacenId);
	public List<ArticuloAlmacen> buscarArticulosAlmacenPorArticuloId(Long articuloId);
}
