package team.furniture.oa.commons.beans;

import java.io.Serializable;

public class PeopleLabel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer rid;      
	private String rname;      
	private String sex;     
	private String number;       
	private String position;
	private PeopleLabel parent;

	public PeopleLabel getParent() {
		return parent;
	}
	public void setParent(PeopleLabel parent) {
		this.parent = parent;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "PeopleLabel [rid=" + rid + ", rname=" + rname + ", sex=" + sex + ", number=" + number + ", position="
				+ position + ", parent=" + parent + "]";
	}
	  
	  
}
