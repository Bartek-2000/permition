package cwiczenie.permition.repo;

import cwiczenie.permition.entity.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person1Repo extends JpaRepository<Person1,Long> {
}
