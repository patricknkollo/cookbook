package cookspackage.cooksproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("database")
public class CookbookDataBaseService implements CookbookService {

	@Autowired
	private CookbookRepository cookbookRepository;
	

	@Override
	public Iterable<Cookbook> readAllCookbooks() {
		// TODO Auto-generated method stub
		return this.cookbookRepository.findAll();
	}

}
