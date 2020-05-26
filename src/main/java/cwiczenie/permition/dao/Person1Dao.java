package cwiczenie.permition.dao;

import cwiczenie.permition.entity.Person1;
import cwiczenie.permition.repo.Person1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class Person1Dao {
    @Autowired
    private Person1Repo person1Repo;

    public List<Person1> allPeople1(){return person1Repo.findAll();}
    public Optional<Person1> found1ById(@RequestParam Long id){return person1Repo.findById(id);}
}
