package es.uvigo.esei.mei.pedidos.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uvigo.esei.mei.pedidos.entidades.ArticuloAlmacen;
import es.uvigo.esei.mei.pedidos.entidades.ArticuloAlmacenId;

@Repository
public interface ArticuloAlmacenDAO extends JpaRepository<ArticuloAlmacen, ArticuloAlmacenId>{
	List<ArticuloAlmacen> findByAlmacenId(Long almacenId);
	List<ArticuloAlmacen> findByArticuloId(Long articuloId);
}
