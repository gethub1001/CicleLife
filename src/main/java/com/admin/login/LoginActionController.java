package com.admin.login;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 系统登录处理类
 * @author yanzhiliang
 */
@Controller
public class LoginActionController {
   @Autowired
    private LoginServices loginServices;
    /**
     * 用户名和密码是否争取，正确的话允许登录
     * 登录成功管理控制台首页
     * @return
     */
    @RequestMapping("admin")
    public String admin()
    {
        return "admin/login";
    }

/**
 * 验证是否登录成功，用户名密码正确运行登录，否则失败
 */
@RequestMapping(value = "login",method = {RequestMethod.POST, RequestMethod.GET})
public String login(HttpServletRequest request, HttpSession session){
    String dispPage="admin/login";//默认登录不上
    String userName=request.getParameter("userName");
    loginServices.findOneUser(new User());
    return dispPage;
}
}
