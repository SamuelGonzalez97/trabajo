package py.edu.facitec.nombre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

// La URL a reponder
	@RequestMapping("/")
	public String index(){
		
    System.out.println("Hola Mundo Sprinf MVC");
    
    
    // Pagina a Responder
    return "views/templates/index";
	}
}
