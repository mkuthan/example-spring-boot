package example.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRepository extends PagingAndSortingRepository<Individual, Long> {

	List<Individual> findByLastName(@Param("name") String name);

}