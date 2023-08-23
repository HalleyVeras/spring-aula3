package next.school.cesar.springaula3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos") // localhost:8080/servico
public class ServicosController {
    
    @GetMapping("/entrega") // localhost:8080/servico/entrega
    public String entrega(){
        return "Entrega realizada!";
    }

    @GetMapping("/devolucao") // localhost:8080/servico/devolucao
    public String devolucao(){
        return "devolvendo";
    }
}
