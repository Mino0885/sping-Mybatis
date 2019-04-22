package com.aoao.spbtuser;

import com.aoao.spbtuser.model.User;
import com.aoao.spbtuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String demo() {
        User user = new User();
        user.setPassword("123");
        user.setUserName("ljh");
        user.setPhone("23123");
        int insert = userService.insert(user);
        return "" + insert;

    }
}
