package team.furniture.oa.xtsz.branch.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import team.furniture.oa.commons.beans.Branch;
import team.furniture.oa.commons.vo.Page;
import team.furniture.oa.xtsz.branch.service.IBranchLabelManagerService;



	@Controller
	@RequestMapping("/branch")
	public class BranchHandler {
		@Autowired
		private IBranchLabelManagerService service;
		
		@RequestMapping("/newslabelManage.do")
		public String requestHandle(int pageno, Model model) {
				
			// 查询当前页的信息
			Page<Branch> page = service.findCurrentPage(pageno);
			model.addAttribute("page", page);
			
			return "/xtsz/Branch.jsp";
		}
		//根据id删除
		@RequestMapping("/deleteNewsLabel.do")
		public String deleteHandle(int id) {
			service.removeById(id);
			
			return "/branch/newslabelManage.do?pageno=1";
		}
		//修改
		@RequestMapping("/toNewslabelUpdatePage.do")
		public String toSalesNewslabelUpdatePageHandle(int id, Model model) {
			// 根据id查询出相应的NewsLabel
			Branch branch= service.findNewsLabelById(id);
			// 将其存放到request域
			model.addAttribute("branch", branch);
			
			return "/xtsz/branchLabelModify.jsp";
		}
		
		@RequestMapping("/updateNewsLabel.do")
		public String updateNewsLabelHandle(Branch branch) {
		
			// 调用Service的修改栏目的方法
			service.modifyNewsLabel(branch);
			return "toNewslabelUpdatePage.do";
		}
		// @RequestMapping(value="/toNewsLabelAdd.do",produces = "text/plain;charset=utf-8")
		@RequestMapping("/toNewsLabelAdd.do")
		public String toNewsLabelAddHandle(Model model) {
			
			return "/xtsz/AddBranch.jsp";
		}
		// @RequestMapping(value="/addNewsLabel.do",produces = "text/plain;charset=utf-8")
		@RequestMapping("/addNewsLabel.do")
		public String addNewsLabelHandle(Branch branch) {
			
			service.addNewsLabel(branch);
			
			return "/toNewsLabelAdd.do";
		}
		
	}

	
