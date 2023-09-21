package run.itlife.mediaapp.repositories;

import org.springframework.stereotype.Repository;
import run.itlife.mediaapp.entities.persons.Persons;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PersonsRepositoryNoData implements CommonRepository<Persons> {

    private Map<String, Persons> persons = new HashMap<>();

    @Override
    public Persons save(Persons entity) {
        Persons result = persons.get(entity.getPersonId());
        if(result != null) {
            result.setFirstname(entity.getFirstname());
            result.setLastname(entity.getLastname());
            result.setInfo(entity.getInfo());
            result.setBirthdate(entity.getBirthdate());
            entity = result;
        }
        persons.put(entity.getPersonId(), entity);
        return persons.get(entity.getPersonId());
    }

    @Override
    public Iterable<Persons> save(Collection<Persons> entities) {
        entities.forEach(this::save);
        return findAll();
    }

    @Override
    public void delete(Persons entity) {
        persons.remove(entity.getPersonId());
    }

    @Override
    public Persons findById(String id) {
        return persons.get(id);
    }

    @Override
    public Iterable<Persons> findAll() {
        return persons.entrySet().stream().sorted(entryComparator).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    private Comparator<Map.Entry<String, Persons>> entryComparator = (Map.Entry<String, Persons> o1, Map.Entry<String, Persons> o2) ->
    {
        return o1.getValue().getBirthdate().compareTo(o2.getValue().getBirthdate());
    };
}
