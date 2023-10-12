package com.demo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
		
		//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
		//src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
		//src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
		//src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
		@RequestMapping("say-hello-jsp")
		//@ResponseBody - return strings as it is or whatever is returned
		public String sayHelloJsp() {
			return "sayHello";
		}
}
