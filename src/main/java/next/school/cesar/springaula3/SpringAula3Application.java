package next.school.cesar.springaula3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/produtos")
public class SpringAula3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAula3Application.class, args);
	}

	// get // @GetMapping
	// post // @PostMapping
	// put // @PutMapping
	// delete // @DeleteMapping

	@GetMapping("/") // localhost:8080/api/hello
	public String hello(){
		return "hello";
	}

}
