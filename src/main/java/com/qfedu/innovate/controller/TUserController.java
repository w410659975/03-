package com.qfedu.innovate.controller;


import com.qfedu.innovate.entity.TUser;
import com.qfedu.innovate.service.TUserService;
import com.qfedu.innovate.vo.Bean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value = "操作用户", tags = "操作用户")
@Controller
@ResponseBody

public class TUserController {

    @Autowired
    private TUserService tUserService;

    @ApiOperation(value = "登录", notes = "登录方法")
    @RequestMapping("/login.do")
    public Bean loginUser(String uaccount, String password) {
        return Bean.setOK("OK", tUserService.login(uaccount,password));
    }

    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    @GetMapping("/findAllUser.do")
    @CrossOrigin//允许跨域
    public Bean findAllUser(){
        return Bean.setOK("OK",tUserService.list());
    }

    @ApiOperation(value = "添加用户", notes = "添加用户")
    @PostMapping("/addUser.do")
    public Bean addTuser(TUser tUser) {
        return Bean.setOK("OK",tUserService.addtUser(tUser));
    }
}

