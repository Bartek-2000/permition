package cwiczenie.permition.conrtoller;

import cwiczenie.permition.dao.Person1Dao;
import cwiczenie.permition.entity.Person1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class Person1Controller {
    @Autowired
    private Person1Dao person1Dao;


    @GetMapping("/person1")
    public String findAllPerson1(Model model){
        List<Person1> allList1 = person1Dao.allPeople1();
        model.addAttribute("person1", allList1);
        return "index1";
    }
    @GetMapping("/person1/find/{id}")
    public ModelAndView findById (@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("found");
        Optional<Person1> found1 = person1Dao.found1ById(id);
        modelAndView.addObject("person1",found1);
        return modelAndView;
    }
}
