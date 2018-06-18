package team.furniture.oa.rsxz.people.service;

import team.furniture.oa.commons.beans.PeopleLabel;
import team.furniture.oa.commons.vo.Page;

public interface IPeopleLabelManagerService {

	Page<PeopleLabel> findCurrentPage(int pageno);

	void removeById(int rid);

	PeopleLabel findNewsLabelById(int rid);

	void modifyNewsLabel(PeopleLabel peopleLabel);

	void addNewsLabel(PeopleLabel peopleLabel);

}
