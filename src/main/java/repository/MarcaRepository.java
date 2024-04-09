package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
