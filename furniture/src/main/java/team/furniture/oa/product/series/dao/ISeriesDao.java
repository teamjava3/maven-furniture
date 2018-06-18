package team.furniture.oa.product.series.dao;

import java.util.List;
import java.util.Map;

import team.furniture.oa.commons.beans.Product;

public interface ISeriesDao {



	List<Product> selectCurrentPgaeSalesLabels(Map<String, Object> map);

	void deleteById(int id);

	Product selectNewsLabelById(int id);

	void updateNewsLabel(Product product);

	void insertNewsLabel(Product product);

}
