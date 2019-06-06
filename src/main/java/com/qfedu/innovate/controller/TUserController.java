package com.qfedu.innovate.controller;


import com.qfedu.innovate.service.TUserService;
import com.qfedu.innovate.vo.Bean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("/tUser")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    @GetMapping("/findAllUser.do")
    @CrossOrigin//允许跨域
    public Bean findAllUser(){

        return Bean.setOK("OK",tUserService.list());
    }
}

