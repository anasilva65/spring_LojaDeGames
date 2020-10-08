package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
	
}
