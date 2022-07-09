package repo;

import data.Auta;
import data.Cennik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CennikRepo extends CrudRepository<Cennik, Integer> {
    @Override
    List<Cennik> findAll();
}

