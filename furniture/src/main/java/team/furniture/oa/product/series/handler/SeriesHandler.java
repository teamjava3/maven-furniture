package team.furniture.oa.product.series.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import team.furniture.oa.commons.beans.Product;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.product.series.service.ISeriesManagerService;

@Controller
@RequestMapping("/product")
public class SeriesHandler {

	@Autowired
	private ISeriesManagerService service;
	
	@RequestMapping("/newslabelManage.do")
	public String requestHandle(int pageno, Model model) {
			
		// 查询当前页的信息
		Page<Product> page = service.findCurrentPage(pageno);
		model.addAttribute("page", page);
		
		return "/product/LineManage.jsp";
	}
	//根据id删除
	@RequestMapping("/deleteNewsLabel.do")
	public String deleteHandle(int id) {
		service.removeById(id);
		
		return "/product/newslabelManage.do?pageno=1";
	}
	//修改
	@RequestMapping("/toNewslabelUpdatePage.do")
	public String toSalesNewslabelUpdatePageHandle(int id, Model model) {
		// 根据id查询出相应的NewsLabel
		Product product = service.findNewsLabelById(id);
		// 将其存放到request域
		model.addAttribute("product", product);
		
		return "/product/ModifyProduct.jsp";
	}
	
	@RequestMapping("/updateNewsLabel.do")
	public String updateNewsLabelHandle(Product product) {
	
		// 调用Service的修改栏目的方法
		service.modifyNewsLabel(product);
		return "toNewslabelUpdatePage.do";
	}
	// @RequestMapping(value="/toNewsLabelAdd.do",produces = "text/plain;charset=utf-8")
	@RequestMapping("/toNewsLabelAdd.do")
	public String toNewsLabelAddHandle(Model model) {
		
		return "/product/AddProductLine.jsp";
	}
	// @RequestMapping(value="/addNewsLabel.do",produces = "text/plain;charset=utf-8")
	@RequestMapping("/addNewsLabel.do")
	public String addNewsLabelHandle(Product product) {
		

		service.addNewsLabel(product);
		
		return "/toNewsLabelAdd.do";
	}
	
	
	
}
