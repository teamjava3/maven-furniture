package team.furniture.oa.product.series.service;

import team.furniture.oa.commons.beans.Product;
import team.furniture.oa.commons.vo.Page;

public interface ISeriesManagerService {

	Page<Product> findCurrentPage(int pageno);

	void removeById(int id);

	Product findNewsLabelById(int id);

	void modifyNewsLabel(Product product);

	void addNewsLabel(Product product);

}
