package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.paypal.PayPalSuccess;

@Controller
public class TestController {

	@RequestMapping(value = "/test/{param}", method = RequestMethod.GET)
	@ResponseBody
	public String test(@PathParam("param") String param) {
		return encryptPassword("TSOEZa17");
		// return "success !";
	}

	public static String encryptPassword(String password) {
		org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder passwordEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String success(ModelMap modelMap, HttpServletRequest request) {
		System.out.println(request.getParameter("payment_gross"));
		PayPalSuccess payPalSucess = new PayPalSuccess();
		modelMap.put("result", payPalSucess.getPayPal(request));
		return "success";
	}

	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public String home() {
		int i;
		return "home";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
}
