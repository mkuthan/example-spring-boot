package hello;

import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<HelloEntity, Long> {
}