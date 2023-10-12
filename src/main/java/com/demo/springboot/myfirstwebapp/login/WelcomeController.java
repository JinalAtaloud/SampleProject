package com.demo.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")

//renaming from LoginController to WelcomeController
public class WelcomeController {
	
	private AuthenticationService authenticationService; 

	public WelcomeController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());
//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name",name);
//		//System.out.println("Request Param is : "+name);
//		logger.info("Request param is :{}" , name);
//		return "login";
//	}
//	
	
//	Before
//	@RequestMapping(value="login",method =RequestMethod.GET)
//	public String gotoLoginPage() {
//		logger.debug("Inside login method get");
//		return "login";
//	}
//	
//	@RequestMapping(value="login",method =RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		logger.debug("Inside login method post");
//		model.put("name",name);
//		//model.put("password", password);
//		if(authenticationService.authenticate(name, password)) {
//			return "welcome";
//		}
//		
//		model.put("errorMesssage","Invalid credentials, Please try again");
//		return "login";
//	}
	
	@RequestMapping(value="/",method =RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		logger.debug("Inside login method get");
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	

}
