package cwiczenie.permition.repo;

import cwiczenie.permition.entity.Person2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person2Repo extends JpaRepository<Person2,Long> {
}
