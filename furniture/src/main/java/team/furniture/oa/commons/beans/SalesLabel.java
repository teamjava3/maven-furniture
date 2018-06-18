package team.furniture.oa.commons.beans;

import java.io.Serializable;

public class SalesLabel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer sid;      //主键，订单编号
	private String sname;       //订单名称
	private String client;     //客户信息
	private float money;       //项目金额
	private String ways;       //配送方式
	private String stime;       //创建时间
	  
	private SalesLabel parent;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getWays() {
		return ways;
	}

	public void setWays(String ways) {
		this.ways = ways;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public SalesLabel getParent() {
		return parent;
	}

	public void setParent(SalesLabel parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "SalesLabel [sid=" + sid + ", sname=" + sname + ", client=" + client + ", money=" + money + ", ways="
				+ ways + ", stime=" + stime + ", parent=" + parent + "]";
	}
	
}
