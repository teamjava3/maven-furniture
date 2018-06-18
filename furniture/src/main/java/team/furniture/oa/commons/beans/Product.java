package team.furniture.oa.commons.beans;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;      //主键，订单编号
	private String name;       //订单名称
	private String information;       //订单详情
	
	  
	private Product parent;
	public Product getParent() {
		return parent;
	}
	public void setParent(Product parent) {
		this.parent = parent;
	}
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
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", information=" + information + ", parent=" + parent + "]";
	}
	
	
}