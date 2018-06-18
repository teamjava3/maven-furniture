package team.furniture.oa.xtsz.branch.dao;

import java.util.List;
import java.util.Map;

import team.furniture.oa.commons.beans.Branch;

public interface IBranchLabelDao {



	List<Branch> selectCurrentPgaeBranchLabels(Map<String, Object> map);

	void deleteById(int id);

	void updateNewsLabel(Branch branch);

	Branch selectNewsLabelById(int id);

	void insertNewsLabel(Branch branch);

}
