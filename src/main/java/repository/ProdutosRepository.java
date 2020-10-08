package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.Produtos;


public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	public List<Produtos> findAllByTituloContainingIgnoreCase(String titulo);


}
