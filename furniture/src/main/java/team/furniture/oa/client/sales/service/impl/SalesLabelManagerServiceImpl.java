package team.furniture.oa.client.sales.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import team.furniture.oa.client.sales.dao.ISalesLabelDao;
import team.furniture.oa.client.sales.service.ISalesLabelManagerService;
import team.furniture.oa.commons.beans.SalesLabel;
import team.furniture.oa.commons.constant.Constant;
import team.furniture.oa.commons.vo.Page;

@Service
public class SalesLabelManagerServiceImpl implements ISalesLabelManagerService {
 
	@Autowired
	private ISalesLabelDao dao;
	
	public Page<SalesLabel> findCurrentPage(int pageno) {
			Page<SalesLabel> page = new Page<SalesLabel>(pageno, Constant.PAGE_SIZE);
	
			
			// 查询出当前页包含的栏目详情
			int pageStartIndex = page.getPageStartIndex();
			int pageSize = page.getPageSize();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("pageStartIndex", pageStartIndex);
			map.put("pageSize", pageSize);
			
			List<SalesLabel> datas = dao.selectCurrentPgaeSalesLabels(map);
			page.setDatas(datas);
			return page;
		}

	public void removeById(int id) {
		dao.deleteById(id);
	}

	public SalesLabel findNewsLabelById(int sid) {
		
			return dao.selectNewsLabelById(sid);
		}

	public void modifyNewsLabel(SalesLabel salesLabel) {
	
			dao.updateNewsLabel(salesLabel);
		}
	

	

	public void addNewsLabel(SalesLabel salesLabel) {
	
			dao.insertNewsLabel(salesLabel);
		}

		
	}
		