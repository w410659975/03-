package com.qfedu.innovate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.innovate.entity.TUser;
import com.qfedu.innovate.vo.Bean;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TUserService extends IService<TUser> {

    public Bean login(String uaccount, String password);

    public Bean addtUser(TUser tUser);
}

















