package team.furniture.oa.product.series.service.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.furniture.oa.commons.beans.Product;
import team.furniture.oa.commons.constant.Constant;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.product.series.dao.ISeriesDao;
import team.furniture.oa.product.series.service.ISeriesManagerService;

@Service
public class SeriesManagerServiceImpl implements ISeriesManagerService {
	@Autowired
	private ISeriesDao dao;
	
	public Page<Product> findCurrentPage(int pageno) {
		Page<Product> page = new Page<Product>(pageno, Constant.PAGE_SIZE);
	
		
		// 查询出当前页包含的栏目详情
		int pageStartIndex = page.getPageStartIndex();
		int pageSize = page.getPageSize();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageStartIndex", pageStartIndex);
		map.put("pageSize", pageSize);
		
		List<Product> datas = dao.selectCurrentPgaeSalesLabels(map);
		page.setDatas(datas);
		return page;
	}

	public void removeById(int id) {
		dao.deleteById(id);
	}



	public Product findNewsLabelById(int id) {

		return dao.selectNewsLabelById(id);
	}


	public void modifyNewsLabel(Product product) {
		dao.updateNewsLabel(product);
		}

	public void addNewsLabel(Product product) {
		dao.insertNewsLabel(product);
		}

}
