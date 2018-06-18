package team.furniture.oa.commons.beans;

import java.io.Serializable;

public class Branch implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private Integer id;
	
	private String name;
	
	private String ab;
	
	private String position;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAb() {
		return ab;
	}


	public void setAb(String ab) {
		this.ab = ab;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public Branch(Integer id, String name, String ab, String position) {
		super();
		this.id = id;
		this.name = name;
		this.ab = ab;
		this.position = position;
	}


	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", ab=" + ab + ", position=" + position + "]";
	}


	


}
