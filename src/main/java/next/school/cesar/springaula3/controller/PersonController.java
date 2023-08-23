package next.school.cesar.springaula3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import next.school.cesar.springaula3.entity.Person;

@RestController // Define a classe como um controlador de recursos
@RequestMapping("/person") // Define a rota base do recurso
public class PersonController {

    @GetMapping // Define o metodo de requisição e também a sub-rota do recurso
    // neste caso o metodo de requiseção é o metodo GET
    public Person getPerson(@RequestParam(value = "name", defaultValue = "Fulano") 
    String name) {
        // logica de negocio
        return new Person(name, "13/11/1991");// retorno do recurso serializado e tranformado em padrão REST, no caso em json
    }

    @PostMapping // Define o metodo de requisição e também a sub-rota do recurso
    // neste caso o metodo de requisição é o metodo POST
    public Person postPerson(){
        return new Person(null, null);
    }
}
