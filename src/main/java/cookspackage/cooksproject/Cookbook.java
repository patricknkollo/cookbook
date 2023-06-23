package cookspackage.cooksproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cookbook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	public Cookbook(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Cookbook() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Cookbook [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name : "") + "]";
	}
	
	

	
}
