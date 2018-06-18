package team.furniture.oa.client.sales.service;

import team.furniture.oa.commons.beans.SalesLabel;
import team.furniture.oa.commons.vo.Page;

public interface ISalesLabelManagerService {

	Page<SalesLabel> findCurrentPage(int pageno);

	void removeById(int id);

	SalesLabel findNewsLabelById(int sid);

	void modifyNewsLabel(SalesLabel salesLabel);


	void addNewsLabel(SalesLabel salesLabel);


}
