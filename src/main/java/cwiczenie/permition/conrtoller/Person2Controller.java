package cwiczenie.permition.conrtoller;


import cwiczenie.permition.dao.Person2Dao;
import cwiczenie.permition.entity.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class Person2Controller {
    @Autowired
    private Person2Dao person2Dao;


    @GetMapping("/person2")
    public String findAllPerson1(Model model){
        List<Person2> allList2 = person2Dao.allPeople2();
        model.addAttribute("person2", allList2);
        return "index2";
    }
    @GetMapping("/person2/find/{id}")
    public ModelAndView findById (@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("found");
        Optional<Person2> found2 = person2Dao.found2ById(id);
        modelAndView.addObject("person2",found2);
        return modelAndView;
    }
}
