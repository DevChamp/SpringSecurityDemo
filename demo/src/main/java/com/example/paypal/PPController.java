package com.example.paypal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pp")
public class PPController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "success !";
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String success(ModelMap modelMap, HttpServletRequest request){
		 System.out.println(request.getParameter("payment_gross"));
	     PayPalSuccess  payPalSucess = new PayPalSuccess();
		 modelMap.put("result", payPalSucess.getPayPal(request));
	   	 return "success";
}
}
