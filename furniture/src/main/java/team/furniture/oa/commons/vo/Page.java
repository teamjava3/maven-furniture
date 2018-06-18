package team.furniture.oa.commons.vo;

import java.util.List;

import team.furniture.oa.commons.constant.Constant;

public class Page<T> {
	/**
	 * 当前页码（给定）
	 */
	private int pageno;
	/**
	 * 当前页起始索引（计算）
	 */
	private int pageStartIndex;
	/**
	 * 页面大小（给定）
	 */
	private int pageSize;

	/**
	 * 当前页包含的具体数据（查询）
	 */
	private List<T> datas;
	public Page() {
		pageno = 1;
		pageSize = Constant.PAGE_SIZE;
	}

	/**
	 * 
	 * @param pageno
	 *            页码
	 * @param pageSize
	 *            页面大小
	 */
	public Page(int pageno, int pageSize) {
		if (pageno < 0) {
			pageno = 1;
		}
		if (pageSize < 0) {
			pageSize = Constant.PAGE_SIZE;
		}
		this.pageno = pageno;
		this.pageSize = pageSize;
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public int getPageStartIndex() {
		return (pageno - 1) * pageSize;
	}

	public void setPageStartIndex(int pageStartIndex) {
		this.pageStartIndex = pageStartIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "Page [pageno=" + pageno + ", pageStartIndex=" + pageStartIndex + ", pageSize=" + pageSize + ", datas="
				+ datas + "]";
	}

	
	
}
