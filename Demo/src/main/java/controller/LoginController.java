package controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import model.User;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping("login.do")
	public String login(){
		return "login.html";
	}

	
	/**
	 * 登录提交
	 * @param username 用户名
	 * @param password 密码
	 * @param rememberMe 是否记住
	 * @param request HTTP请求
	 * @return
	 */
	@RequestMapping(value="submitLogin",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> submitLogin(String ciphername,String ciphercode,HttpServletRequest request){
				
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
	
		try {
			Boolean rememberMe=false;			
			    
			User user = new User();
			resultMap.put("user",user);
			resultMap.put("status", 200);
			resultMap.put("message", "登录成功.");
			String url = request.getContextPath() + "/main.do";
			//跳转地址
			resultMap.put("back_url", url);			
		}catch(Exception e){
			e.printStackTrace();
			resultMap.put("status", 300);
			resultMap.put("message", "用户名或者密码错误.");
		}


		return resultMap;
	}
		
}
