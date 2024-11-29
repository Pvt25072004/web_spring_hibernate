package hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInstructorDetail extends JpaRepository<InstructorDetail, Integer>{

}
