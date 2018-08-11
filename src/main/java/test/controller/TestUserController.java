package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.entity.User;

@Controller
@RequestMapping("/user")
public class TestUserController {

    @RequestMapping("/getUser")
     public @ResponseBody User getUser(){
         User user =new User();
         return user;
     }
}
