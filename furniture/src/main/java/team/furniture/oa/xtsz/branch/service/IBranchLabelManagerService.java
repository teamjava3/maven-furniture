package team.furniture.oa.xtsz.branch.service;

import team.furniture.oa.commons.beans.Branch;
import team.furniture.oa.commons.vo.Page;

public interface IBranchLabelManagerService {

	Page<Branch> findCurrentPage(int pageno);

	void removeById(int id);

	Branch findNewsLabelById(int id);

	void modifyNewsLabel(Branch branch);

	void addNewsLabel(Branch branch);

}
