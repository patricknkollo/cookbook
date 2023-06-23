package cookspackage.cooksproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service("memory")
public class CookbookMemoryService {

	public CookbookMemoryService() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Cookbook> cookbooks = new ArrayList<Cookbook>();
	
	public List<Cookbook> readAllcoobook(){//it works because list is iterable
		return this.cookbooks;
	}

}
