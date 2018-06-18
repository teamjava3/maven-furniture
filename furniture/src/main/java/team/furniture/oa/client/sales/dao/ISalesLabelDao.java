package team.furniture.oa.client.sales.dao;

import java.util.List;
import java.util.Map;

import team.furniture.oa.commons.beans.SalesLabel;



public interface ISalesLabelDao {



	List<SalesLabel> selectCurrentPgaeSalesLabels(Map<String, Object> map);

	void deleteById(int sid);

	SalesLabel selectNewsLabelById(int sid);

	void updateNewsLabel(SalesLabel salesLabel);

	void insertNewsLabel(SalesLabel salesLabel);

}
