package ly.people_list_online.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ly.people_list_online.service.PeopleService;

@Controller
public class IndexController {
	
	@Autowired
	private PeopleService ps;
	
	//接收新增人员请求
	@RequestMapping("/insertPeople.do")
	public String insertPeople(HttpServletRequest request,String iname,String isex,Integer iage) {
		request.setAttribute("result", ps.doInsertPeople(iname, isex, iage));
		return "/index.jsp";
	}

	public PeopleService getPs() {
		return ps;
	}

	public void setPs(PeopleService ps) {
		this.ps = ps;
	}

}

