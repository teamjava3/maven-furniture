package team.furniture.oa.rsxz.people.dao;

import java.util.List;
import java.util.Map;

import team.furniture.oa.commons.beans.PeopleLabel;

public interface IPeopleLabelDao {



	List<PeopleLabel> selectCurrentPgaeSalesLabels(Map<String, Object> map);

	PeopleLabel selectNewsLabelById(int rid);

	void updateNewsLabel(PeopleLabel peopleLabel);

	void deleteById(int rid);

	void insertNewsLabel(PeopleLabel peopleLabel);

}
