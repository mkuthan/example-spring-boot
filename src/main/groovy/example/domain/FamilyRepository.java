package example.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends PagingAndSortingRepository<Family, Long> {

	List<Family> findByHusband(@Param("husband") Individual husband);

	List<Family> findByWife(@Param("wife") Individual wife);
	
}