package com.qfedu.innovate.controller;


import com.qfedu.innovate.service.impl.TUnitServiceImpl;
import com.qfedu.innovate.vo.Bean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Controller
@RequestMapping("/tUnit")
public class TUnitController {
    @Autowired
    private TUnitServiceImpl tUnitService;
    @CrossOrigin
    @ApiOperation(value ="众包平台展示",notes = "查询展示")
    @RequestMapping(value = "/all.do",method = RequestMethod.GET)
    @ResponseBody
    public Bean findAll(){
        return tUnitService.findAll();
    }
    @CrossOrigin
    @ApiOperation(value = "展示所有",notes = "所有")
    @RequestMapping(value = "/find.do",method = RequestMethod.GET)
    @ResponseBody
    public Bean findUnit(){
        return tUnitService.findUnit();
    }
}

