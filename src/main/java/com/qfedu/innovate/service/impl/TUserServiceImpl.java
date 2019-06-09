package com.qfedu.innovate.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.innovate.entity.TUser;
import com.qfedu.innovate.mapper.TUserMapper;
import com.qfedu.innovate.service.TUserService;
import com.qfedu.innovate.vo.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service(value = "TUserService")
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Autowired
    private TUserMapper tUserDao;

    @Override
    public Bean login(String uaccount, String password) {
//        List<TUser> list = new ArrayList<>();
        TUser user = tUserDao.login(uaccount);
        Bean result = new Bean();
        if (user != null) {
            result.setCode(0);
            result.setMsg("登录成功");
            result.setData(0);
        } else {
            result.setCode(1);
            result.setMsg("登录失败");
        }

        return result;
    }

}











