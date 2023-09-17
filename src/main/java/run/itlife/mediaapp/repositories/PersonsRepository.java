package run.itlife.mediaapp.repositories;

import org.springframework.data.repository.CrudRepository;
import run.itlife.mediaapp.entities.Persons;

public interface PersonsRepository extends CrudRepository<Persons, String> {

}
