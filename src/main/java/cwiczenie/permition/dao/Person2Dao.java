package cwiczenie.permition.dao;

import cwiczenie.permition.entity.Person2;
import cwiczenie.permition.repo.Person2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class Person2Dao {
    @Autowired
    private Person2Repo person2Repo;

    public List<Person2> allPeople2(){return person2Repo.findAll();}
    public Optional<Person2> found2ById(@RequestParam Long id){return person2Repo.findById(id);}
}
