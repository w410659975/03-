package com.qfedu.innovate.controller;


import com.qfedu.innovate.entity.TMessage;
import com.qfedu.innovate.service.TMessageService;
import com.qfedu.innovate.vo.Bean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value = "个人信息",tags = "个人信息")
@RestController
@CrossOrigin
@RequestMapping("/tMessage")
public class TMessageController {

    @Autowired
    private TMessageService tMessageService;

    @ApiOperation(value = "查询个人详情",notes = "查询个人详情")
    @GetMapping("/single.do")
    public Bean querySingle(Integer uid){
        return Bean.setOK("OK",tMessageService.selectByid(uid));
    }

    @ApiOperation(value = "添加信息",notes = "添加信息")
    @PostMapping("/save.do")
    public Bean insert(@RequestBody TMessage tMessage) {
        return Bean.setOK("OK", tMessageService.addSingle(tMessage));
    }

    @ApiOperation(value = "修改个人信息",notes = "修改个人信息")
    @PutMapping("/update.do")
    @CrossOrigin
    public Bean update(TMessage tMessage) {
        return tMessageService.updateByTmessage(tMessage);
    }
}


















