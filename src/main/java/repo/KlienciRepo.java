package repo;

import data.Auta;
import data.Klienci;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlienciRepo extends CrudRepository<Klienci, Integer> {
}
