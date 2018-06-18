package team.furniture.oa.client.sales.handler;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import team.furniture.oa.client.sales.service.ISalesLabelManagerService;
import team.furniture.oa.commons.beans.SalesLabel;
import team.furniture.oa.commons.vo.Page;
@Controller
@RequestMapping("/test")
public class SalesLabelHandler {
	@Autowired
	private ISalesLabelManagerService service;
	
	@RequestMapping("/newslabelManage.do")
	public String requestHandle(int pageno, Model model) {
			
		// 查询当前页的信息
		Page<SalesLabel> page = service.findCurrentPage(pageno);
		model.addAttribute("page", page);
		
		return "/client/OrderManager.jsp";
	}
	//根据id删除
	@RequestMapping("/deleteNewsLabel.do")
	public String deleteHandle(int sid) {
		service.removeById(sid);
		
		return "/test/newslabelManage.do?pageno=1";
	}
	//修改
	@RequestMapping("/toNewslabelUpdatePage.do")
	public String toSalesNewslabelUpdatePageHandle(int sid, Model model) {
		// 根据id查询出相应的NewsLabel
		SalesLabel salesLabel = service.findNewsLabelById(sid);
		// 将其存放到request域
		model.addAttribute("salesLabel", salesLabel);
		
		return "/client/salesLabelModify.jsp";
	}
	
	@RequestMapping("/updateNewsLabel.do")
	public String updateNewsLabelHandle(SalesLabel salesLabel) {
	
		// 调用Service的修改栏目的方法
		service.modifyNewsLabel(salesLabel);
		return "toNewslabelUpdatePage.do";
	}

	@RequestMapping("/toNewsLabelAdd.do")
	public String toNewsLabelAddHandle(Model model) {
		
		return "/client/addSaleslabel.jsp";
	}
	
	@RequestMapping("/addNewsLabel.do")
	public String addNewsLabelHandle(SalesLabel salesLabel) {
		
		service.addNewsLabel(salesLabel);
		
		return "toNewsLabelAdd.do";
	}
	
	
	
}
