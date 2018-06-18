package team.furniture.oa.xtsz.branch.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import team.furniture.oa.commons.beans.Branch;
import team.furniture.oa.commons.constant.Constant;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.xtsz.branch.dao.IBranchLabelDao;
import team.furniture.oa.xtsz.branch.service.IBranchLabelManagerService;
@Service
public class BranchServiceImpl implements IBranchLabelManagerService {
	
	@Autowired
	private IBranchLabelDao dao;
	
	public Page<Branch> findCurrentPage(int pageno) {
		Page<Branch> page = new Page<Branch>(pageno, Constant.PAGE_SIZE);
	
		
		// 查询出当前页包含的栏目详情
		int pageStartIndex = page.getPageStartIndex();
		int pageSize = page.getPageSize();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageStartIndex", pageStartIndex);
		map.put("pageSize", pageSize);
		
		List<Branch> datas = dao.selectCurrentPgaeBranchLabels(map);
		page.setDatas(datas);
		return page;
	}

	public void removeById(int id) {
		dao.deleteById(id);

	}

	public Branch findNewsLabelById(int id) {
		return dao.selectNewsLabelById(id);
	}

	public void modifyNewsLabel(Branch branch) {
		dao.updateNewsLabel(branch);
	}

	public void addNewsLabel(Branch branch) {
		dao.insertNewsLabel(branch);

	}

}
