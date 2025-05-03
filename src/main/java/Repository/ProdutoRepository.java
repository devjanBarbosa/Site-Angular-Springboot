package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Loja.demo.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
  
}
