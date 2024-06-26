package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Carro;


@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
