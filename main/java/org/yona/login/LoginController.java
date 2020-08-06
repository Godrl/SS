package org.yona.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/signin")
	public String singinPOST() throws Exception {
		logger.info("=====signin=====");
		return "/signin";
	}
	
	@RequestMapping(value="/user/main")
	public String user() throws Exception {
		logger.info("=====user=====");
		return "/user/main";
	}
	
	@RequestMapping(value="/admin/main")
	public String admin() throws Exception {
		logger.info("=====admin=====");
		return "/admin/main";
	}
	
	@RequestMapping(value="/denyaccess", method=RequestMethod.GET)
	public void denyaccess() throws Exception{
		logger.info("=====denyaccess=====");
	}
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public void signupGET() throws Exception{
		logger.info("=====signup GET=====");
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signupPOST() throws Exception{
		logger.info("=====signup POST=====");
		
		return "home";
	}
	
}
