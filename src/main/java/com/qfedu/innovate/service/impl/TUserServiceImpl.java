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
        TUser user = tUserDao.login(uaccount);
            if(user.getUpassword().equals(password) && user.getUaccount().equals(uaccount)){
                return Bean.setOK("OK","密码正确");
            }else {
                return Bean.setError();
            }
    }

    @Override
    public Bean addtUser(TUser tUser) {
        if (tUserDao.insert(tUser) > 0) {
            return Bean.setOK();
        } else {
            return Bean.setError();
        }
    }
}