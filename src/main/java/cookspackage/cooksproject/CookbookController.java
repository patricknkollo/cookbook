package cookspackage.cooksproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CookbookController {

	
	@Autowired
	@Qualifier("database")
	private CookbookService  cookbookService ;
	
	@GetMapping("/cookbooks")
	public Iterable<Cookbook> readCookbook(){
		 return cookbookService.readAllCookbooks();
	}

}
