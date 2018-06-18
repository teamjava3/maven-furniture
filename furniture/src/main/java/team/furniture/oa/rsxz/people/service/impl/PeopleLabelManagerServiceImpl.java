package team.furniture.oa.rsxz.people.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.furniture.oa.commons.beans.PeopleLabel;
import team.furniture.oa.commons.constant.Constant;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.rsxz.people.dao.IPeopleLabelDao;
import team.furniture.oa.rsxz.people.service.IPeopleLabelManagerService;
@Service
public class PeopleLabelManagerServiceImpl implements IPeopleLabelManagerService {
	@Autowired
	private IPeopleLabelDao dao;
	public Page<PeopleLabel> findCurrentPage(int pageno) {
		Page<PeopleLabel> page = new Page<PeopleLabel>(pageno, Constant.PAGE_SIZE);
	
		
		// 查询出当前页包含的栏目详情
		int pageStartIndex = page.getPageStartIndex();
		int pageSize = page.getPageSize();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageStartIndex", pageStartIndex);
		map.put("pageSize", pageSize);
		
		List<PeopleLabel> datas = dao.selectCurrentPgaeSalesLabels(map);
		page.setDatas(datas);
		return page;
	}

	public PeopleLabel findNewsLabelById(int rid) {
		return dao.selectNewsLabelById(rid);
	}

	public void modifyNewsLabel(PeopleLabel peopleLabel) {
		dao.updateNewsLabel(peopleLabel);
	}

	public void removeById(int rid) {
		dao.deleteById(rid);

	}
	

	public void addNewsLabel(PeopleLabel peopleLabel) {
		dao.insertNewsLabel(peopleLabel);
		
	}
}
