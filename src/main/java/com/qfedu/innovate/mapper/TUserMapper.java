package com.qfedu.innovate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.innovate.entity.TUser;
import org.apache.ibatis.annotations.Select;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TUserMapper extends BaseMapper<TUser> {

    @Select("select * from t_user where uaccount=#{uaccount}")
    TUser login(String uaccount);
}










