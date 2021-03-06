package com.zhangzhihao.SpringMVCSeedProject.Controller;

import com.zhangzhihao.SpringMVCSeedProject.Model.User;
import com.zhangzhihao.SpringMVCSeedProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@SuppressWarnings("JavaDoc")
@Controller
@RequestMapping("/Account")
public class AccountController {
	@Autowired
	UserService userService;


	/**
	 * 转向登录界面
	 *
	 * @return 登录界面
	 */
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String LoginPage() {
		return "Account/Login";
	}

	/**
	 * 接收用户登录传参，判断是否登陆成功
	 *
	 * @param UserName
	 * @param Password
	 * @param session
	 * @return
	 */
	@Cacheable("springCache")
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String Login(@RequestParam("UserName") String UserName, @RequestParam("Password") String Password, HttpSession session) {
		String userName = UserName.trim();
		User LoginUser = null;
		if (userName != null && userName != "") {
			try {
				LoginUser = userService.getById(userName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		assert LoginUser != null;
		if (LoginUser.getPassWord().equals(Password.trim())) {
			session.setAttribute("User", LoginUser);
			return "redirect:/MustLogin";

		} else {
			return "/Account/Login";
		}
	}
}
