package team.furniture.oa.rsxz.people.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import team.furniture.oa.commons.beans.PeopleLabel;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.rsxz.people.service.IPeopleLabelManagerService;

@Controller
@RequestMapping("/people")
public class PeopleLabelHandler {
	@Autowired
	private IPeopleLabelManagerService service;
	
	@RequestMapping("/peoplelabelManage.do")
	public String requestHandle(int pageno, Model model) {
			
		// 查询当前页的信息
		Page<PeopleLabel> page = service.findCurrentPage(pageno);
		model.addAttribute("page", page);
		
		return "/rsxz/Employlee.jsp";
	}
	//根据id删除
	@RequestMapping("/deletePeopleLabel.do")
	public String deleteHandle(int rid) {
		service.removeById(rid);
		
		return "/people/peoplelabelManage.do?pageno=1";
	}
	//修改
	@RequestMapping("/toPeoplelabelUpdatePage.do")
	public String toSalesNewslabelUpdatePageHandle(int rid, Model model) {
		// 根据id查询出相应的NewsLabel
		PeopleLabel peopleLabel = service.findNewsLabelById(rid);
		// 将其存放到request域
		model.addAttribute("peopleLabel", peopleLabel);
		
		return "/rsxz/peopleLabelModify.jsp";
	}
	
	@RequestMapping("/updatePeopleLabel.do")
	public String updateNewsLabelHandle(PeopleLabel peopleLabel) {
	
		// 调用Service的修改栏目的方法
		service.modifyNewsLabel(peopleLabel);
		return "toPeoplelabelUpdatePage.do";
	}
	
	
	
	@RequestMapping("/toPeopleLabelAdd.do")
	public String toNewsLabelAddHandle(Model model) {
		
		return "/rsxz/AddEmploylee.jsp";
	}

	@RequestMapping("/addPeopleLabel.do")
	public String addNewsLabelHandle(PeopleLabel peopleLabel) {
		
		service.addNewsLabel(peopleLabel);
		
		return "/toPeopleLabelAdd.do";
	}
	
	
}
